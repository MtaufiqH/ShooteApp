package com.example.composeexercise.myshoote.screen

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.R
import com.example.composeexercise.myshoote.utiliities.ShooteButton
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        WelcomeBackground()
        ButtonColumn(
            modifier = Modifier
                .align(Center)
        )

    }

}

@Composable
private fun ButtonColumn(modifier: Modifier) {
    Column(
        horizontalAlignment = CenterHorizontally,
        modifier = modifier
            .padding(horizontal = 16.dp),
    ) {
        ShooteLogo()
        Spacer(modifier = Modifier.height(32.dp))
        ShooteButton(
            onClickButton = {},
            buttonText = R.string.sign_up_title
        )
        Spacer(modifier = Modifier.height(8.dp))
        ShooteButton(
            onClickButton = {},
            buttonText = R.string.log_in_title,
            buttonColor = MaterialTheme.colors.secondary
        )
    }
}

@Composable
private fun ShooteLogo() {
    val isLightMode = MaterialTheme.colors.isLight
    val logoImage = if (isLightMode) {
        R.drawable.ic_light_logo
    } else {
        R.drawable.ic_dark_logo
    }
    Image(
        painterResource(id = logoImage),
        contentDescription = stringResource(R.string.shoote_logo_cd)
    )
}

@Composable
private fun WelcomeBackground() {
    val isLightMode = MaterialTheme.colors.isLight
    val backgroundResource = if (isLightMode) {
        R.drawable.ic_light_welcome
    } else {
        R.drawable.ic_dark_welcome
    }


    Image(
        painterResource(id = backgroundResource),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

@Preview(name = "day mode", uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LightPreview() {
    ComposeExerciseTheme {
        WelcomeScreen()
    }
}

@Preview(name = "dark mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkPreview() {
    ComposeExerciseTheme {
        WelcomeScreen()
    }
}