package com.example.multiscreen

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.multiscreen.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        const val KEY = "com.example.multiscreen.MainActivity.KEY"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //getActionBar()?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF000000")))

        binding.order.setOnClickListener {
            val orderPlaced1 = binding.order1.text.toString()
            val orderPlaced2 = binding.order2.text.toString()
            val orderPlaced3 = binding.order3.text.toString()
            val orderPlaced4 = binding.order4.text.toString()

            intent = Intent(this, Order::class.java)
            intent.putExtra("order1", orderPlaced1)
            intent.putExtra("order2", orderPlaced2)
            intent.putExtra("order3", orderPlaced3)
            intent.putExtra("order4", orderPlaced4)

            startActivity(intent)
        }
    }
}