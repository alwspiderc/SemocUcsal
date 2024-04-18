package com.example.semocucsal

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EventDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        val event = intent.getSerializableExtra("EVENT") as Event

        // recuperando os elementos da tela
        val imageView: ImageView = findViewById(R.id.event_item_image)
        val nameTextView: TextView = findViewById(R.id.event_item_name)
        val descriptionTextView: TextView = findViewById(R.id.event_item_description)
        val dateTextView: TextView = findViewById(R.id.event_item_date)
        val locationTextView: TextView = findViewById(R.id.event_item_location)
        val buttonSubscribe: Button = findViewById(R.id.event_item_subscribe)


        imageView.setImageResource(event.image)
        nameTextView.text = event.name
        descriptionTextView.text = event.description
        dateTextView.text = event.date
        locationTextView.text = event.location

        // faz com que o card ocupe a tela inteira quando tiver em detalhes
        val eventDetailLayout: ViewGroup = findViewById<ViewGroup>(R.id.event_detail_layout)
        val params = eventDetailLayout.layoutParams
        params.height = ViewGroup.LayoutParams.MATCH_PARENT
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        eventDetailLayout.layoutParams = params

        buttonSubscribe.setOnClickListener {
                buttonSubscribe.text = if (buttonSubscribe.text.toString().equals("Inscrever-se", ignoreCase = true)) "Inscrito" else "Inscrever-se"
        }
    }
}