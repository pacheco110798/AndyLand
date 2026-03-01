package com.example.andyland

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import com.example.andyland.data.Country
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CountryDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        setContentView(R.layout.activity_country_detail)
        // retireve country name set in the adpter to fetch specific country
        // obtenemos el nobre enviado desde el evento del adaptador para buscar por nombre
        val countryName = intent.getStringExtra("country_name") ?: return

        loadCountryDetails(countryName)
        val toolbar = findViewById<Toolbar>(R.id.toolbar_country_detail)
        setSupportActionBar(toolbar)

        supportActionBar?.title = " Countries /" + countryName;
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun loadCountryDetails(name: String) {
        RetrofitClient.api.getCountryByName(name)
            .enqueue(object : Callback<List<Country>> {
                override fun onResponse(
                    call: Call<List<Country>>,
                    response: Response<List<Country>>
                ) {
                    val country = response.body()?.firstOrNull()
                    if (country != null) {
                        Log.d("country", country.toString())
                        findViewById<TextView>(R.id.tv_country_name).text = country.name.common
                        findViewById<TextView>(R.id.tv_continent).text =
                            (country.continents?.getOrNull(0) ?: "N/A")
                        findViewById<TextView>(R.id.tv_capital).text =
                            (country.capital?.getOrNull(0) ?: "N/A")
                        findViewById<TextView>(R.id.tv_region).text = (country.region ?: "N/A")

                        val ivFlag = findViewById<ImageView>(R.id.iv_flags)
                        val flagUrl = country.flags?.png;

                        Glide.with(this@CountryDetailActivity)
                            .load(flagUrl)
                            .into(ivFlag)
                    }
                }

                override fun onFailure(
                    call: Call<List<Country>>,
                    t: Throwable
                ) {
                    Log.d("error", t.toString())
                    Toast.makeText(
                        this@CountryDetailActivity,
                        "Error loading details",
                        Toast.LENGTH_SHORT,
                    ).show()

                }
            })
    }
}