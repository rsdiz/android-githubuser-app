package id.rosyid.githubuser.ui.list

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import id.rosyid.githubuser.adapter.GithubUserAdapter
import id.rosyid.githubuser.data.DataList
import id.rosyid.githubuser.data.GithubUser
import id.rosyid.githubuser.databinding.ActivityMainBinding
import id.rosyid.githubuser.ui.GithubUserCallback

class MainActivity : AppCompatActivity(), GithubUserCallback {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dataList: ArrayList<GithubUser>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList = DataList.getData(this)

        binding.rvGithubUser.layoutManager = LinearLayoutManager(this)
        val githubUserAdapter = GithubUserAdapter(dataList) { sendGithubUser(it) }
        binding.rvGithubUser.adapter = githubUserAdapter
    }

    override fun sendGithubUser(githubUser: GithubUser) {
        // TODO: send data with intent
    }
}
