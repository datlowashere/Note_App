package datlowashere.project.myapplication.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import datlowashere.project.myapplication.repository.NoteRepository

class NoteViewModelFactory (
    private val repository: NoteRepository) : ViewModelProvider.Factory{
    @Suppress("UNCHECKED_CAST")

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NoteViewModel::class.java)){
            return NoteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class!")
    }
    }

