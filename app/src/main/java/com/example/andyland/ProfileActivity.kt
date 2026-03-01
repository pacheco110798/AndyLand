package com.example.andyland

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.andyland.adapters.WorkExperienceAdapter
import com.example.andyland.data.WorkExperience
import com.example.andyland.data.WorkExperienceData

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val rv = findViewById<RecyclerView>(R.id.rvWorkExperience)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = WorkExperienceAdapter(WorkExperienceData.experience)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish() // go back to previous activity
        return true
    }

}