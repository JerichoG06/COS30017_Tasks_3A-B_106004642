package com.jerich06g.pokemon_gen6

// A Data class is Kotlin's way of making a simple model object
// It will auto-generate equals(), hashCode(), toString(), and copy () for free
data class Pokemon(
    val name: String,
    val pokedex: Int,
    val type: String,
    val evoLevel: String,
    val location: String,
    val image: String  //path inside assets/
)