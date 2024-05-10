package datlowashere.project.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import datlowashere.project.myapplication.model.Note
import datlowashere.project.myapplication.databinding.ItemNoteBinding

class NoteAdapter : ListAdapter<Note, NoteAdapter.ViewHolder>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Note>() {
        override fun areItemsTheSame(oldNote: Note, newNote: Note): Boolean {
            return oldNote._id == newNote._id
        }

        override fun areContentsTheSame(oldNote: Note, newNote: Note): Boolean {
            // Check if all properties are the same for both old and new Note objects
            return oldNote == newNote
        }
    }

    class ViewHolder(private val binding: ItemNoteBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(note: Note) {
            binding.currentNote = note
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemNoteBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = getItem(position)
        holder.bind(note)
    }
}
