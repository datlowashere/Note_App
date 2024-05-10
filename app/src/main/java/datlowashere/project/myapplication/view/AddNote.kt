package datlowashere.project.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import datlowashere.project.myapplication.databinding.ActivityAddNoteBinding

class AddNote : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener(View.OnClickListener {
            finish()
        })

    }
}