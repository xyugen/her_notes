package com.pagzone.her_notes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_note_list)

        // Apply padding to handle system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.note_list)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize buttons
        val btnMenu: Button = findViewById(R.id.menu_button)
        val btnAdd: Button = findViewById(R.id.add_button)

        // Set click listeners
        btnAdd.setOnClickListener { onClick(it, this) }
    }

    private fun onClick(view: View, context: Context) {
        when (view.id) {
            R.id.add_button -> {
                val intent = Intent(context, AddNoteActivity::class.java)
                startActivity(intent)
            }
        }
    }
}