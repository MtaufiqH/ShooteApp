package com.example.composeexercise.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.composeexercise.R

// font
private val kulimParkLight = FontFamily(Font(R.font.kulim_park_light))
private val kulimParkRegular = FontFamily(Font(R.font.kulim_park_regular))
private val latoBold = FontFamily(Font(R.font.lato_bold))
private val latoRegular = FontFamily(Font(R.font.lato_regular))

val Typography = Typography(
    h1 = TextStyle(
        fontSize = 28.sp,
        letterSpacing = 1.15.sp,
        fontFamily = kulimParkLight
    ),

    h2 = TextStyle(
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        fontFamily = kulimParkRegular
        // caps
    ),


    body1 = TextStyle(
        fontSize = 14.sp,
        fontFamily = latoRegular,
    ),

    h3 = TextStyle(
        fontSize = 14.sp,
        fontFamily = latoBold,
    ),

    button = TextStyle(
        fontSize = 14.sp,
        fontFamily = latoBold,
        letterSpacing = 1.15.sp
        // caps
    ),

    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = kulimParkRegular,
        letterSpacing = 1.15.sp,
        //caps
    )
)