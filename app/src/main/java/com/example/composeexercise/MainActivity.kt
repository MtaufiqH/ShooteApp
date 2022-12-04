package com.example.composeexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeexercise.model.AlignYourBody
import com.example.composeexercise.model.AlignYourMind
import com.example.composeexercise.model.FavCollections
import com.example.composeexercise.myshoote.screen.HomeScreen
import com.example.composeexercise.myshoote.screen.LoginScreen
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

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Destinations.WELCOME.name){
                    composable(Destinations.WELCOME.name){
                        WelcomeScreen{
                            navController.navigate(Destinations.LOGIN.name)
                        }
                    }

                    composable(Destinations.LOGIN.name){
                        LoginScreen {
                            navController.navigate(Destinations.HOME.name)
                        }
                    }

                    composable(Destinations.HOME.name){
                        HomeScreen(
                            favCollections = collections,
                            alignYourBody = alignYourBody,
                            alignYourMind = mind
                        )
                    }
                }
            }
        }
    }
}

private enum class Destinations(name: String){
    WELCOME("welcome"),
    LOGIN("login"),
    HOME("home")
}

