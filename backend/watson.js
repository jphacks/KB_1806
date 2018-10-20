var PersonalityInsightsV3 = require('watson-developer-cloud/personality-insights/v3');

var personalityInsights = new PersonalityInsightsV3({
  username: '0f304f75-c6ff-44d2-9e02-8ad625f0f14b',
  password: 'qpuQkhIbhTsy',
  version: '2016-10-19',
  url: 'https://gateway.watsonplatform.net/personality-insights/api'
});

personalityInsights.profile(
  {
    content: "私はオフィスにおける執務の快適性と知的生産性向上を目的とした知的照明システムの研究を行っています。知的照明システムとは、各照明の明るさや色を最適に制御することで、執務者が好む照明環境を実現するシステムです。私が行っている研究はその中でも、執務者が好む明るさ（照度）の実現精度に関する研究です。知的照明システムには、隣り合う執務者が大きく異なる照度を希望した場合、その照度を実現することができないという物理的問題があります。私はこの問題を解決するため、照明にレンズを取り付け、照明の配光パターンを変化させることで、照度の実現精度が向上すると考えました。レンズの種類や位置、角度を変更し、測定した照度を用いてシミュレーションを行う一連の作業を繰り返し行いました。シミュレーション環境の構築や最適化アルゴリズムの実装も行いました。試行錯誤の結果、照度の実現精度を向上させることができました。今年の4月に学内の論文誌に論文が採録され、研究の成果が認められました。また、9月には国際学会で発表を行い奨励賞を頂くことができました。",
    content_type: 'text/plain',
    consumption_preferences: true,
    content_language:'ja'
  },
  function(err, response) {
    if (err) {
      console.log('error:', err);
    } else {
      console.log(JSON.stringify(response, null, 2));
    }
  }
);
