package com.example.andyland.data

data class Country(
    val name : Name,
    val continents: List<String>?,
    val capital: List<String>?,
    val region: String,
    val subregion: String,
    val flag: String,
    val population: Long,
    val flags: Flags?
)

data class Name(
    val common: String
)

data class Flags(
    val png: String,
    val svg: String,
)