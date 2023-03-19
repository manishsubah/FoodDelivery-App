package com.example.multiscreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class dataAdapter(private val context: Context, private val arrContact: ArrayList<orderdata>) : RecyclerView.Adapter<dataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(context)
            .inflate(R.layout.itemnote, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: dataAdapter.ViewHolder, position: Int) {
        val ItemsViewModel = arrContact[position]

        holder.textView.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return arrContact.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val textView: TextView = itemView.findViewById(R.id.items)

    }
}