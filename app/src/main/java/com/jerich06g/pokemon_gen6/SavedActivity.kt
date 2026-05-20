package com.jerich06g.pokemon_gen6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SavedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)

        // Wire toolbar and enable back arrow
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.savedToolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        // Read last clicked Pokemon name from SharedPreferences
        // defaultValue shows if nothing has been clicked
        val prefs = getSharedPreferences(MainActivity.PREFS_NAME, MODE_PRIVATE)
        val lastName = prefs.getString(MainActivity.KEY_LAST_CLICKED, "None yet")

        findViewById<TextView>(R.id.savedPokemonName).text = lastName
    }

    // Make back arrow in toolbar work
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}