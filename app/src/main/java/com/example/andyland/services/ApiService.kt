package com.example.andyland.services

import com.example.andyland.data.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("v3.1/all")
    fun getCountries(): Call<List<Country>>

    @GET("name/{name}")
    fun getCountryByName(
        @Path("name") name: String
    ): Call<List<Country>>
}