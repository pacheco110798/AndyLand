package com.example.andyland.data

data class WorkExperience (
    val companyName: String,
    val position: String,
    val startDate: String,
    val endDate: String?,
    val description: String,
    val location: String,
    val stack: List<String> = emptyList()
)