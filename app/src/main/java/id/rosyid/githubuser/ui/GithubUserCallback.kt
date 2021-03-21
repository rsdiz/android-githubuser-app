package id.rosyid.githubuser.ui

import id.rosyid.githubuser.data.GithubUser

interface GithubUserCallback {
    fun sendGithubUser(githubUser: GithubUser)
}
