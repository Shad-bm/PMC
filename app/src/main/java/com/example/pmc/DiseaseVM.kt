package com.example.pmc

import android.content.Context
import androidx.lifecycle.ViewModel

class DiseaseVM :ViewModel() {
    private val repo = Repository.getInstance()

    fun resultDiseases(Disease: String, requiredContext: Context): Boolean {
        return repo.resultDiseases(Disease,requiredContext)
    }

}