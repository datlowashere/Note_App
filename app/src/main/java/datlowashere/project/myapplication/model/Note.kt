package datlowashere.project.myapplication.model

import java.io.Serializable

 data class Note(
    val _id: Int,
    val title: String,
    val time: Long,
    val content: String
) : Serializable
