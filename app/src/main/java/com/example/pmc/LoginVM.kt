package com.example.pmc

import android.content.Context
import androidx.lifecycle.ViewModel

class LoginVM : ViewModel() {

    private val repo = Repository.getInstance()


    fun login(username: String, password: String, requiredContext: Context):Boolean{
        return repo.login(username, password, requiredContext)
    }
}