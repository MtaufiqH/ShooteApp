package com.example.composeexercise.model

import androidx.annotation.DrawableRes
import com.example.composeexercise.R

data class FavCollections(
    val name: String,
    @DrawableRes val image: Int
) {

    companion object {
        val favCollections = listOf(
            FavCollections("Short Mantras", R.drawable.short_mantras),
            FavCollections("Nature Meditations", R.drawable.nature_meditations),
            FavCollections("Stress and Anxiety", R.drawable.stress_and_anxiety),
            FavCollections("Self-massage", R.drawable.self_massage),
            FavCollections("Overwhelmed", R.drawable.overwhelmed),
            FavCollections("Nightly wind down", R.drawable.short_mantras),
        )
    }
}
