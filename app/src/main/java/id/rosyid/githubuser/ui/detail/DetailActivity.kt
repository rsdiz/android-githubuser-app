package id.rosyid.githubuser.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import id.rosyid.githubuser.data.GithubUser
import id.rosyid.githubuser.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        val DATA_USER = "data_user"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var userData: GithubUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.extras != null) {
            userData = intent.getParcelableExtra<GithubUser>(DATA_USER) as GithubUser
            title = "Detail ${ userData.name }"
        }

        setContent()
    }

    private fun setContent() {
        binding.userName.text = userData.name
        binding.userUsername.text = userData.username
        binding.userFollowers.text = userData.follower.toString()
        binding.userFollowings.text = userData.following.toString()
        binding.userCompany.text = userData.company
        binding.userLocation.text = userData.location
        binding.userRepository.text = userData.repository.toString()
        Glide.with(this)
            .load(userData.avatar)
            .circleCrop()
            .into(binding.userImage)
    }
}
