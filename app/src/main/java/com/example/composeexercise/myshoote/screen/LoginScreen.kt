package com.example.composeexercise.myshoote.screen

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.R
import com.example.composeexercise.myshoote.utiliities.ShooteButton
import com.example.composeexercise.myshoote.utiliities.ShooteTextField
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

@Composable
fun LoginScreen(onButtonLoginClicked: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        LoginBackground()
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderText()

            Spacer(modifier = Modifier.height(32.dp))
            ShooteTextField(labelText = "Email Address")

            Spacer(modifier = Modifier.height(8.dp))
            ShooteTextField(labelText = "Password")

            Spacer(modifier = Modifier.height(8.dp))
            ShooteButton(onClickButton = onButtonLoginClicked, buttonText = R.string.log_in_title)

            SignUpLabel()
        }
    }

}

@Composable
private fun SignUpLabel() {
    val appendSignUpText = buildAnnotatedString {
        append("Don't have an account? ")
        withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
            append("Sign up")
        }
    }
    Text(text = appendSignUpText, modifier = Modifier.paddingFromBaseline(32.dp))
}

@Composable
private fun HeaderText() {
    Text(
        style = MaterialTheme.typography.h1,
        text = "Log in".uppercase(),
        modifier = Modifier.paddingFromBaseline(200.dp),
    )
}

@Composable
fun LoginBackground(modifier: Modifier = Modifier) {
    val isLight = MaterialTheme.colors.isLight
    val backgroundRes = if (isLight) {
        R.drawable.ic_light_login
    } else {
        R.drawable.ic_dark_login
    }

    Image(
        painterResource(id = backgroundRes),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}


@Preview(name = "light preview", uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LightPreviewLogin() {
    ComposeExerciseTheme {
        LoginScreen {}
    }
}

@Preview(name = "light preview", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkPreviewLogin() {
    ComposeExerciseTheme() {
        LoginScreen {}
    }

}