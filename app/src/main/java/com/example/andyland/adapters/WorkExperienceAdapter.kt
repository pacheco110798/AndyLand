package com.example.andyland.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.andyland.R
import com.example.andyland.data.WorkExperience

//we'll create this adapter separateley to make it easier to maintain
//separamos el adaptador de actividad principal para que sea más fácil de manter

class WorkExperienceAdapter(private val experiences: List<WorkExperience>) :
    RecyclerView.Adapter<WorkExperienceAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCompanyPosition: TextView = itemView.findViewById(R.id.tvCompanyPosition)
        val tvDuration: TextView = itemView.findViewById(R.id.tvDuration)
        val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
        val tvLocation: TextView = itemView.findViewById(R.id.tvLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_work_experience, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = experiences.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val experience = experiences[position]
        holder.tvCompanyPosition.text = "${experience.companyName} - ${experience.position}"
        val end = experience.endDate
        holder.tvDuration.text = "${experience.startDate} - $end"
        holder.tvDescription.text = experience.description
        holder.tvLocation.text = experience.location
    }

}