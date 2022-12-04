package com.example.composeexercise.model

import androidx.annotation.DrawableRes
import com.example.composeexercise.R

data class AlignYourBody(
    @DrawableRes val image: Int,
    val name: String
) {

    companion object {
        val items = listOf(
            AlignYourBody(R.drawable.inversions, "Inversion"),
            AlignYourBody(R.drawable.quick_yoga, "Quick yoga"),
            AlignYourBody(R.drawable.stretching, "Stretching"),
            AlignYourBody(R.drawable.tabata, "Tabata"),
            AlignYourBody(R.drawable.hiit, "HIIT"),
            AlignYourBody(R.drawable.pre_natal_yoga, "Pre-natal yoga"),
        )
    }
}
