package com.mybossseasonfinal.justthejob.WebInterviewActivity

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat.checkSelfPermission
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.mybossseasonfinal.justthejob.BuildConfig
import com.mybossseasonfinal.justthejob.MainActivity.MainActivity
import com.mybossseasonfinal.justthejob.R
import io.skyway.Peer.*
import io.skyway.Peer.Browser.Canvas
import io.skyway.Peer.Browser.MediaConstraints
import io.skyway.Peer.Browser.MediaStream
import io.skyway.Peer.Browser.Navigator
import io.skyway.Peer.Peer


/**
 * Web面接画面
 */
class WebInterviewActivity : AppCompatActivity() {

    private lateinit var _peer: Peer
    private lateinit var _localStream: MediaStream
    private lateinit var _strOwnId: String
    private lateinit var _handler: Handler
    private var _remoteStream: MediaStream? = null
    private var _mediaConnection: MediaConnection? = null
    private var _bConnected: Boolean = false

    private lateinit var tvOwnId: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_interview)

        tvOwnId = findViewById(R.id.tvOwnId)

        _handler = Handler(Looper.getMainLooper())

        // p2p通信 初期化
        val options = PeerOption()
        options.key = BuildConfig.SKYWAY_API_KEY
        options.domain = BuildConfig.SKYWAY_HOST
        // ！！！ここで自分のPeerIDを指定！！！
        _peer = Peer(this, "user2", options)
        Navigator.initialize(_peer)

        // p2p通信 開始
        _peer.on(Peer.PeerEventEnum.OPEN) { `object` ->
            // 自分のPeer IDを取得・表示
            _strOwnId = `object` as String
            showCurrentPeerId(_strOwnId)
        }

        // 着信受信処理
        _peer.on(Peer.PeerEventEnum.CALL, OnCallback { `object` ->
            if (`object` !is MediaConnection) {
                return@OnCallback
            }

            _mediaConnection = `object`
            setMediaCallbacks()
            _mediaConnection?.answer(_localStream)

            _bConnected = true
            updateActionButtonTitle()
        })

        //接続が切れた時に発火
        _peer.on(Peer.PeerEventEnum.CLOSE) {
            Log.d("Skyway_TEST", "[On/Close]")
        }

        //シグナリングサーバとの接続が切れた時に発火
        _peer.on(Peer.PeerEventEnum.DISCONNECTED) {
            Log.d("Skyway_TEST", "[On/Disconnected]")
        }

        //エラー時に発火
        _peer.on(Peer.PeerEventEnum.ERROR) { currentPeerId ->
            val error = currentPeerId as PeerError
            Log.d("Skyway_TEST", "[On/Error]$error")
        }

        // カメラや音声を利用するための許可をもらう処理
        if (checkSelfPermission(this,
                        Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(this,
                        Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO), 0)

        } else {
            //メディアストリーミング開始
            startLocalStream()
        }

        val btnAction = findViewById<Button>(R.id.btnAction)
        btnAction.setEnabled(true)
        btnAction.setOnClickListener {
            if (!_bConnected) {
                // ！！！ここで通話相手を指定！！！
                onPeerSelected("user1")
            } else {
                // 切断処理
                closeRemoteStream()
                _mediaConnection?.close()
                toMainView()
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            0 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startLocalStream()
                } else {
                    Toast.makeText(this, "Failed to access the camera and microphone.\nclick allow when asked for permission.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun showCurrentPeerId(ownId: String) {
        tvOwnId.text = ownId
        Log.d("showCurrentPeerId()", "currentId: $ownId")
        runOnUiThread { tvOwnId.text = "ID: $ownId" }
    }

    private fun startLocalStream() {
        val mediaConstraints = MediaConstraints()
        mediaConstraints.maxWidth = 960
        mediaConstraints.maxHeight = 540
        mediaConstraints.cameraPosition = MediaConstraints.CameraPositionEnum.FRONT

        // ストリームの取得と再生
        Navigator.initialize(_peer)
        _localStream = Navigator.getUserMedia(mediaConstraints)
        val canvas = findViewById<Canvas>(R.id.svLocalView)
        _localStream.addVideoRenderer(canvas, 0)
    }

    private fun onPeerSelected(strPeerId: String) {
        if (null == _peer) {
            return
        }

        val option = CallOption()
        _mediaConnection = _peer.call(strPeerId, _localStream, option)

        if (null != _mediaConnection) {
            setMediaCallbacks()
            _bConnected = true
        }

        updateActionButtonTitle()
    }

    private fun setMediaCallbacks() {
        _mediaConnection?.on(MediaConnection.MediaEventEnum.STREAM) { `object` ->
            _remoteStream = `object` as MediaStream
            val canvas = findViewById<View>(R.id.svRemoteView) as Canvas
            _remoteStream?.addVideoRenderer(canvas, 0)
        }

    }

    private fun updateActionButtonTitle() {
        _handler.post {
            val btnAction = findViewById<View>(R.id.btnAction) as Button
            if (null != btnAction) {
                if (false == _bConnected) {
                    btnAction.text = "通話開始"
                } else {
                    btnAction.text = "通話終了"
                }
            }
        }
    }

    private fun closeRemoteStream() {
        val canvas = findViewById<View>(R.id.svRemoteView) as Canvas

        _remoteStream?.removeVideoRenderer(canvas, 0)
        _remoteStream?.close()
    }

    private fun destroyPeer() {
        closeRemoteStream()

        if (null != _localStream) {
            val canvas = findViewById<View>(R.id.svLocalView) as Canvas
            _localStream.removeVideoRenderer(canvas, 0)
            _localStream.close()
        }

        if (null != _mediaConnection) {
            if (_mediaConnection!!.isOpen) {
                _mediaConnection?.close()
            }
            unsetMediaCallbacks()
        }

        Navigator.terminate()

        if (null != _peer) {
            unsetPeerCallback(_peer)
            if (!_peer.isDisconnected) {
                _peer.disconnect()
            }

            if (!_peer.isDestroyed) {
                _peer.destroy()
            }
        }
    }

    private fun unsetPeerCallback(peer: Peer) {
        if (null == _peer) {
            return
        }

        peer.on(Peer.PeerEventEnum.OPEN, null)
        peer.on(Peer.PeerEventEnum.CONNECTION, null)
        peer.on(Peer.PeerEventEnum.CALL, null)
        peer.on(Peer.PeerEventEnum.CLOSE, null)
        peer.on(Peer.PeerEventEnum.DISCONNECTED, null)
        peer.on(Peer.PeerEventEnum.ERROR, null)
    }

    private fun unsetMediaCallbacks() {
        if (null == _mediaConnection) {
            return
        }

        _mediaConnection?.on(MediaConnection.MediaEventEnum.STREAM, null)
        _mediaConnection?.on(MediaConnection.MediaEventEnum.CLOSE, null)
        _mediaConnection?.on(MediaConnection.MediaEventEnum.ERROR, null)
    }

    override fun onDestroy() {
        super.onDestroy()
        destroyPeer()
    }


    // TODO: デバッグ用 削除
    private fun toMainView() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
