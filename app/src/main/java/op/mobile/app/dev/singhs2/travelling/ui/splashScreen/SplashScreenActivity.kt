package op.mobile.app.dev.singhs2.travelling.ui.splashScreen

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import op.mobile.app.dev.singhs2.travelling.ui.mainActivity.MainActivity
import op.mobile.app.dev.singhs2.travelling.R

/**
 * SplashScreenActivity - loads the animation and  MediaPlayer is responsible
 * for the plane sound in the background. We then release sound at the end of activity.
 * finish()  method then release sound at the end of activity.
 */
class SplashScreenActivity : AppCompatActivity() {
    private var TIME_OUT :Long = 4900
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val MediaPlayer = MediaPlayer.create(this, R.raw.airplane)
        MediaPlayer.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            MediaPlayer.release()  // Release sound at the end of activity
            finish()  //Release sound at the end of activity
        },TIME_OUT )
    }
}