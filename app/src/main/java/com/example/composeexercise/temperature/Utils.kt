package com.example.composeexercise.temperature

import android.graphics.fonts.FontFamily
import android.graphics.fonts.FontStyle
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

object Utils {
    fun String.convertToFahrenheit(): String {
        val fahrenheit = (this.toDoubleOrNull()?.let {
            (it * 9 / 5) + 32
        })
        return fahrenheit.toString()
    }

    fun String.convertToCelcius(): String {
        val celcius = (this.toDoubleOrNull()?.let {
            (it - 32) * 5 / 9
        })
        return celcius.toString()
    }
}