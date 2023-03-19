package com.example.multiscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_order)
        setContentView(R.layout.activity_order)


        val recyclerview = findViewById<RecyclerView>(R.id.showorder)
        val data = ArrayList<orderdata>()
        var m1 = intent.extras?.getString("order1") ?: "No message found"
        var m2 = intent.extras?.getString("order2") ?: "No message found"
        var m3 = intent.extras?.getString("order3") ?: "No message found"
        var m4 = intent.extras?.getString("order4") ?: "No message found"

        data.add(orderdata(m1))
        data.add(orderdata(m2))
        data.add(orderdata(m3))
        data.add(orderdata(m4))
        recyclerview.layoutManager = LinearLayoutManager(this )
        val adapter = dataAdapter(this, arrContact = data)
        recyclerview.adapter = adapter


    }
}