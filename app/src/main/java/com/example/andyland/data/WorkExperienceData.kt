package com.example.andyland.data

object WorkExperienceData {
    val experience = listOf(
        WorkExperience(
            companyName = "Transportes Soto",
            position = "Frontend Developer",
            startDate = "Nov 2025",
            endDate = null,
            description = "Developed Logistics Portal to improve current business operations optimizing user experience and site performance.",
            location = "Chihuahua, CHIH",
            stack = listOf(
                "Typescript",
                "React JS",
                "Redux",
                "Node JS",
                "Web Sockets",
                "Primereact"
            )
        ),
        WorkExperience(
            companyName = "G-Global Logistics",
            position = "Fullstack Mobile Developer",
            startDate = "Apr 2021",
            endDate = "Oct 2025 ",
            description = "Developed modern multiplatform apps using Flutter to support Operations. Deployed and monitored app distributed through multiple inHouse sites",
            location = "Tijuana, BC",
            listOf(
                "Flutter",
                "XCode",
                "JavaScript",
                "React JS",
                "Mongo DB"
            )
        ),
        WorkExperience(
            companyName = "Talentum",
            position = "Software Intern",
            startDate = "Jun 2020",
            endDate = "Dec 2020",
            description = "Develop moder job portal for career agency startup. Developed internal educational portal to assist end users polish language skills, using react and Nodejs",
            location = "Tijuana, BC",
            listOf(
                "SQL",
                "React JS",
                "Redux",
                "NodeJS"
            )
        )
    )
}