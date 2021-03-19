package id.rosyid.githubuser.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import id.rosyid.githubuser.data.GithubUser
import id.rosyid.githubuser.databinding.RowItemGithubuserBinding

class GithubUserAdapter(
    private val listGithubuser: ArrayList<GithubUser>,
    private val clickListener: (GithubUser) -> View.OnClickListener
) : RecyclerView.Adapter<GithubUserAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            RowItemGithubuserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listGithubuser.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listGithubuser[position], clickListener)
    }

    inner class ListViewHolder(
        val binding: RowItemGithubuserBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(githubUser: GithubUser, clickListener: (GithubUser) -> View.OnClickListener) {
            val context: Context = binding.root.context as Context
            Glide.with(context)
                .load(githubUser.avatar)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(binding.ivAvatarUser)
            binding.tvName.text = githubUser.name
            binding.tvUsername.text = githubUser.username
            binding.baseLayout.setOnClickListener(clickListener(githubUser))
        }
    }
}
