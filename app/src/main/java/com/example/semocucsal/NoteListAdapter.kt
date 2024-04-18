package com.example.semocucsal

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteListAdapter(private val events: List<Event>, private val context: Context) : RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(event:Event) {
            val imageView: ImageView = itemView.findViewById(R.id.event_item_image)
            val nameTextView: TextView = itemView.findViewById(R.id.event_item_name)
            val dateTextView: TextView = itemView.findViewById(R.id.event_item_date)
            val locationTextView: TextView = itemView.findViewById(R.id.event_item_location)
            val buttonSubscribe: Button = itemView.findViewById(R.id.event_item_subscribe)

            imageView.setImageResource(event.image)
            nameTextView.text = event.name
            dateTextView.text = event.date
            locationTextView.text = event.location

            itemView.setOnClickListener {
                val intent = Intent(context, EventDetailActivity::class.java)
                intent.putExtra("EVENT", event)
                context.startActivity(intent)
            }

            buttonSubscribe.visibility = View.INVISIBLE

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_event_detail, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = events[position]
        holder.bindView(event)
    }
}