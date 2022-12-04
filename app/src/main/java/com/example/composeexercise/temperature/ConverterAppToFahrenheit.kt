package com.example.composeexercise.temperature

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ConverterApplication(modifier: Modifier = Modifier) {
    Column {
        StateFulConverterScreen()
        ConverterApp()
        TwoWayConverter()
    }
}

@Preview(showBackground = true)
@Composable
fun ConverterPreview() {
    ConverterApplication()
}