package com.example.semocucsal

import android.media.Image
import java.io.Serializable

data class Event(
    val id: Int,
    val image: Int,
    val name: String,
    val date: String,
    val location: String
) : Serializable