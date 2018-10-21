package com.mybossseasonfinal.justthejob.VideoChatActivity

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Window
import android.widget.Toast
import com.mybossseasonfinal.justthejob.BuildConfig
import com.mybossseasonfinal.justthejob.R
import io.skyway.Peer.Browser.MediaConstraints
import io.skyway.Peer.Browser.Navigator
import io.skyway.Peer.Peer
import io.skyway.Peer.PeerOption
import kotlinx.android.synthetic.main.activity_video_chat.*


class VideoChatActivity : AppCompatActivity() {
    private lateinit var peer: Peer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_video_chat)

        val handler = Handler(Looper.getMainLooper())

        val options = PeerOption()
        options.key = BuildConfig.SKYWAY_API_KEY
        options.domain = BuildConfig.SKYWAY_HOST
        peer = Peer(this, options)
        Navigator.initialize(peer)

        showCurrentPeerId()

        // Request permissions
        if (ContextCompat.checkSelfPermission(this,
                        Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this,
                        Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO), 0)
        } else {

            // Get a local MediaStream & show it
            startLocalStream()
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

    private fun showCurrentPeerId() {
        peer.on(Peer.PeerEventEnum.OPEN) { currentPeerId ->
            if (currentPeerId is String) {
                Log.d("Skyway_TEST", "currentId: $currentPeerId")
            }
            runOnUiThread { textView_peerid.text = "ID: $currentPeerId" }
        }
    }

    private fun startLocalStream() {
        val mediaConstraints = MediaConstraints()
        mediaConstraints.maxWidth = 960
        mediaConstraints.maxHeight = 540
        mediaConstraints.cameraPosition = MediaConstraints.CameraPositionEnum.FRONT
    }
}
