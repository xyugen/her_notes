package com.pagzone.her_notes

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_note_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.note_list)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnMenu: Button = findViewById(R.id.menu_button)

        // Set click listener using lambda expression
        btnMenu.setOnClickListener{
            performAnimation(it)
        }
    }

    private fun performAnimation(view: View) {
        println("Performing animation")
    }
}