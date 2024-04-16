package com.example.semocucsal

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EventDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        val event = intent.getSerializableExtra("EVENT") as Event

        val imageView: ImageView = findViewById(R.id.event_item_image)
        val nameTextView: TextView = findViewById(R.id.event_item_name)
        val dateTextView: TextView = findViewById(R.id.event_item_date)
        val locationTextView: TextView = findViewById(R.id.event_item_location)

        imageView.setImageResource(event.image)
        nameTextView.text = event.name
        dateTextView.text = event.date
        locationTextView.text = event.location
    }
}