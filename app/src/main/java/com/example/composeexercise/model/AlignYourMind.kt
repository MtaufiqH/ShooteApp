package com.example.composeexercise.model

import androidx.annotation.DrawableRes
import com.example.composeexercise.R

data class AlignYourMind(
    @DrawableRes val image: Int,
    val name: String
) {

    companion object {
        val items = listOf(
            AlignYourMind(R.drawable.meditate, "Meditate"),
            AlignYourMind(R.drawable.with_kids, "With kids"),
            AlignYourMind(R.drawable.aromatherapy, "Aromatherapy"),
            AlignYourMind(R.drawable.on_the_go, "On the go"),
            AlignYourMind(R.drawable.with_pets, "With pets"),
            AlignYourMind(R.drawable.high_stress, "High stress"),
        )
    }
}
