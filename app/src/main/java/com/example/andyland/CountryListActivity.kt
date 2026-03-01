package com.example.andyland

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.andyland.adapters.CountryAdapter

class CountryListActivity : AppCompatActivity() {
    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        setContentView(R.layout.activity_country_list)
        val rv = findViewById<RecyclerView>(R.id.rvCountries)
        rv.layoutManager = LinearLayoutManager(this)
        val countries = resources.getStringArray(R.array.countries_array).toList()
        rv.adapter = CountryAdapter(countries);
        val toolbar = findViewById<Toolbar>(R.id.toolbar_countries)
        setSupportActionBar(toolbar)
        supportActionBar?.title = " Countries";
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish() // go back to home activity -volver a pantalla principa
        return true
    }
}

