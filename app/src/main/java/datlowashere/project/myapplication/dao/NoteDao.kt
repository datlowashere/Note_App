package datlowashere.project.myapplication.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import datlowashere.project.myapplication.model.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note): Long

    @Query("SELECT * FROM notes ORDER BY time DESC")
    fun getAllNotes(): List<Note>

    @Query("SELECT * FROM notes WHERE _id = :noteId")
    fun getNoteById(noteId: Int): Note?

    @Update
    fun update(note: Note)

    @Query("DELETE FROM notes WHERE _id = :noteId")
    fun deleteById(noteId: Int)
}
