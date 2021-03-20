package id.rosyid.githubuser.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import id.rosyid.githubuser.databinding.ActivitySplashscreenBinding
import id.rosyid.githubuser.ui.list.MainActivity

class SplashscreenActivity : AppCompatActivity() {

    private val timeout = 3000L
    private lateinit var binding: ActivitySplashscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentList = Intent(this, MainActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(intentList)
                finish()
            },
            timeout
        )
    }
}
