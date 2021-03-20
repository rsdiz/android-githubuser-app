package id.rosyid.githubuser.data

import android.content.Context
import id.rosyid.githubuser.R

object DataList {
    private val githubUserArrayList: ArrayList<GithubUser> = arrayListOf()

    fun getData(context: Context): ArrayList<GithubUser> {
        val usernames = context.resources.getStringArray(R.array.username)
        val names = context.resources.getStringArray(R.array.name)
        val avatars = context.resources.obtainTypedArray(R.array.avatar)
        val companyNames = context.resources.getStringArray(R.array.company)
        val locations = context.resources.getStringArray(R.array.location)
        val repositories = context.resources.getStringArray(R.array.repository)
        val followers = context.resources.getStringArray(R.array.followers)
        val followings = context.resources.getStringArray(R.array.following)

        for (position in usernames.indices) {
            val githubUser = GithubUser(
                usernames[position],
                names[position],
                avatars.getResourceId(position, R.mipmap.ic_github_foreground),
                companyNames[position],
                locations[position],
                repositories[position].toInt(),
                followers[position].toInt(),
                followings[position].toInt()
            )
            githubUserArrayList.add(githubUser)
        }

        avatars.recycle()

        return githubUserArrayList
    }
}