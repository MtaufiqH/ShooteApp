package com.example.composeexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composeexercise.model.AlignYourBody
import com.example.composeexercise.model.AlignYourMind
import com.example.composeexercise.model.FavCollections
import com.example.composeexercise.myshoote.screen.HomeScreen
import com.example.composeexercise.myshoote.screen.WelcomeScreen
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExerciseTheme {
                val collections = FavCollections.favCollections
                val alignYourBody = AlignYourBody.items
                val mind = AlignYourMind.items
                WelcomeScreen()
                HomeScreen(
                    favCollections = collections,
                    alignYourBody = alignYourBody,
                    alignYourMind = mind
                )
            }
        }
    }
}

