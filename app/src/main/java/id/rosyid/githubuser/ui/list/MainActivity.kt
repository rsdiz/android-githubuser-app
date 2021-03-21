package id.rosyid.githubuser.ui.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.rosyid.githubuser.adapter.GithubUserAdapter
import id.rosyid.githubuser.data.DataList
import id.rosyid.githubuser.data.GithubUser
import id.rosyid.githubuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dataList: ArrayList<GithubUser>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList = DataList.getData(this)

        binding.rvGithubUser.layoutManager = LinearLayoutManager(this)
        // TODO: initialize adapter for recycler view
    }
}
