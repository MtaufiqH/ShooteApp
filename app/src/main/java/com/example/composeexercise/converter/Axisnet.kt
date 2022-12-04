package com.example.composeexercise

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ButtonAndText() {

    var counter by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello Axisnet $counter",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(onClick = { counter++ }) {
            Text(text = "Add Counter")

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AxisnetPrev() {
    ButtonAndText()
}