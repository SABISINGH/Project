package op.mobile.app.dev.singhs2.travelling

/**
 * Imports to migrate library and project dependencies.
 */
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    private var TIME_OUT :Long = 4900
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val MediaPlayer = MediaPlayer.create(this,R.raw.airplane)
        MediaPlayer.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            MediaPlayer.release()  // Release sound at the end of activity
            finish()  //Destroy the activity - stops going back to the activity once we out of it.
        },TIME_OUT )
    }
}