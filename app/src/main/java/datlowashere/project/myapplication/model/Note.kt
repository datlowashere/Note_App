package datlowashere.project.myapplication.model
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity(tableName = "notes")

 data class Note(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    val title: String,
    val time: Long,
    val content: String
) : Serializable
