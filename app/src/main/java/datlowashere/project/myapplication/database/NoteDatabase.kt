package datlowashere.project.myapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import datlowashere.project.myapplication.dao.NoteDao
import datlowashere.project.myapplication.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}