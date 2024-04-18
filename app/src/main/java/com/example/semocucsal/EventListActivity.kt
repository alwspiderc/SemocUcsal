package com.example.semocucsal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class EventListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)

        val recyclerView = findViewById<RecyclerView>(R.id.event_list_recyclerview)
        val buttonSubscribe: Button = findViewById(R.id.event_item_button_subcribe)
        recyclerView.adapter = NoteListAdapter(events(), this)
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager

        buttonSubscribe.setOnClickListener {
            val intent = Intent(this, SubmitActivity::class.java)
            startActivity(intent)
        }
    }


    private fun events(): List<Event> {
        return listOf(
            Event(1, R.drawable.image1,"What is Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and text galley of type and scrambled it to make a type specimen book. It has typesetting, remaining essentially unchanged. and mor.", "01/01/2023", "written by Cicero in 45 BC"),
            Event(2, R.drawable.image2, "What is Lorem Ipsum","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.","02/02/2023", "written by Cicero in 45 BC"),
            Event(3, R.drawable.image3, "What is Lorem Ipsum","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.","03/03/2023", "written by Cicero in 45 BC"),
            Event(4, R.drawable.image4, "What is Lorem Ipsum","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.","04/04/2023", "written by Cicero in 45 BC"),
            Event(5, R.drawable.image5, "What is Lorem Ipsum","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.","05/05/2023", "written by Cicero in 45 BC"),
        )
    }
}