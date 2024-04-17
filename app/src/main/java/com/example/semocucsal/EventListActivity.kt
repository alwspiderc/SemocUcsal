package com.example.semocucsal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class EventListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)

        val recyclerView = findViewById<RecyclerView>(R.id.event_list_recyclerview)
        recyclerView.adapter = NoteListAdapter(events(), this)
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    private fun events(): List<Event> {
        return listOf(
            Event(1, R.drawable.semoc_logo,"Event 1", "sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka", "01/01/2023", "Location 1"),
            Event(2, R.drawable.semoc_logo, "Event 2","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","02/02/2023", "Location 2"),
            Event(3, R.drawable.semoc_logo, "Event 3","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","03/03/2023", "Location 3"),
            Event(4, R.drawable.semoc_logo, "Event 4","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","04/04/2023", "Location 4"),
            Event(5, R.drawable.semoc_logo, "Event 5","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","05/05/2023", "Location 5"),
            Event(6, R.drawable.semoc_logo, "Event 6","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","06/06/2023", "Location 6"),
            Event(7, R.drawable.semoc_logo, "Event 7","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","07/07/2023", "Location 7"),
            Event(8, R.drawable.semoc_logo, "Event 8","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","08/08/2023", "Location 8"),
            Event(9, R.drawable.semoc_logo, "Event 9","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","09/09/2023", "Location 9"),
            Event(10, R.drawable.semoc_logo, "Event 10","sdjhjakhdjkshdjasdkjashdjkashdjk dkshdkjsahda asdkjhsjkdashdjk asjkdhasjkdhasjk sdskjahdjad dakjhdakjs dajshdjka","10/10/2023", "Location 10")
        )
    }
}