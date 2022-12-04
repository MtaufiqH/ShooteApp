package com.example.composeexercise.temperature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeexercise.R
import com.example.composeexercise.temperature.Utils.convertToFahrenheit


@Composable
fun StatelessConverter(
    input: String,
    output: String,
    modifier: Modifier = Modifier,
    onChangeEvent: (String) -> Unit
) {
    Column(modifier = modifier.padding(dimensionResource(id = R.dimen.large_padding))) {
        Text(
            text = stringResource(id = R.string.stateless_converter),
            style = MaterialTheme.typography.h5
        )

        OutlinedTextField(
            value = input,
            label = { Text(text = stringResource(id = R.string.enter_celsius)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = onChangeEvent
        )

        Text(text = stringResource(id = R.string.temperature_fahrenheit, output))
    }

}

@Composable
fun ConverterApp(modifier: Modifier = Modifier) {
    var input by remember { mutableStateOf("") }
    var output by remember { mutableStateOf("") }
    StatelessConverter(input = input, output = output, onChangeEvent = { newState ->
        input = newState
        output = newState.convertToFahrenheit()
    })
}

@Preview(showBackground = true)
@Composable
fun StateLessPreview() {
    ConverterApp()

}