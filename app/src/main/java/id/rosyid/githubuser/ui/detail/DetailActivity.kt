package id.rosyid.githubuser.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.rosyid.githubuser.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        val DATA_USER = "data_user"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
