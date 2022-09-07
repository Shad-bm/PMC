package com.example.pmc

import android.content.Context
import android.widget.Toast

class Repository {

    private val userSearchList :MutableList<String> = mutableListOf()

    companion object {
        fun getInstance(): Repository = Repository()
    }

    fun login(username: String, Password: String, requiredContext: Context):Boolean{

        if (username.isEmpty() || Password.isEmpty()) {
            Toast.makeText(requiredContext, "You must add username and password", Toast.LENGTH_SHORT).show()
        } else {
            //login checking from database must be done here
            return true
        }
        return false
    }

    fun resultSymptoms(symptom: String, requiredContext: Context) :Boolean{
        if (symptom.isEmpty()) {
            Toast.makeText(requiredContext, "You must add symptom", Toast.LENGTH_SHORT).show()
        } else {
            userSearchList.add(symptom)
            //1 checking matching symptom from database must be here
            return true
        }
        return false
    }

    fun resultDiseases(Disease: String, requiredContext: Context): Boolean {

        if (Disease.isEmpty()) {
            Toast.makeText(requiredContext, "You must add Disease", Toast.LENGTH_SHORT).show()
        } else {
            userSearchList.add(Disease)
            //1 checking matching Disease from database must be here
            return true
        }
        return false
    }

    fun ShowResult(symptom: String) : MutableList<String> {
        // return list of related diseases to the symptoms
        return mutableListOf()
    }


}