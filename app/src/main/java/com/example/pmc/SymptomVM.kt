package com.example.pmc

import android.content.Context
import androidx.lifecycle.ViewModel

class SymptomVM : ViewModel(){
    private val repo = Repository.getInstance()

    fun resultSymptoms(symptom:String,requiredContext: Context):Boolean{
        return repo.resultSymptoms(symptom, requiredContext)
    }
}