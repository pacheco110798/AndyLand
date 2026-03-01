package com.example.andyland.adapters
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.andyland.CountryDetailActivity
import com.example.andyland.R

//we'll create this adapter separateley to make it easier to maintain
// separamos el adaptador de la lista de paises para que sea más fácil de manter

class CountryAdapter(
    private val countries: List<String>
) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCountry: TextView = itemView.findViewById(R.id.tvCountry)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_country_item, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.tvCountry.text = countries[position]
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, CountryDetailActivity::class.java)
            intent.putExtra("country_name", countries[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = countries.size
}