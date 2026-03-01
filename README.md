# AndyLand
Android Kotlin app to consume external API in clean UI using RecyclerView and Card layouts.

# Project Structure Overview

This project is organized follows standard Android app conventions with Kotlin and Java files separated into relevant packages.

## Package  com.example.andyland 

- **adapters**  
  Contains adapter classes for RecyclerViews or other list components:  
  -  CountryAdapter  — Adapter for displaying country items.  
  -  WorkExperienceAdapter  — Adapter for displaying work experience items.

- **data**  
  Holds data models and related data objects:  
  -  Country  — Kotlin data class representing a country from suggested API ().  
  -  WorkExperience  — Kotlin class modeling work experience details.  
  -  WorkExperienceData  — Data source or utility class related to work experiences.
    
- **services**
  Contains basic network services for API calls:
  -  ApiService  — Interface defining API endpoints and HTTP methods for network calls.  
  -  RetrofitClient  — Singleton/helper class that configures and provides the Retrofit instance for API communication.

- **activities**  
  Contains Activity classes representing UI screens:  
  -  CountryDetailActivity  — Screen showing details of a selected country.  
  -  CountryListActivity  — Screen listing all countries.  
  -  MainActivity  — Main entry point of the app.  
  -  ProfileActivity  — Screen for professional profile details.

## Resources ( res  folder)

- **drawable** — Contains images and drawable assets.  
- **layout** — XML layout files defining UI for activities and list items:  
  - activity_country_detail.xml — Layout for country detail screen.  
  -  activity_country_item.xml  — Layout for a single country item in a list.  
  -  activity_country_list.xml  — Layout for the country list screen.  
  -  activity_main.xml  — Layout for the main activity.
  -  activity_profile.xml  — Layout for the professional profile activity.
  -  item_work_experience.xml  — Layout for the work experience entries displayed in the professional profile.
