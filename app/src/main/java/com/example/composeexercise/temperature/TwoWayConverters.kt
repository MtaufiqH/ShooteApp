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
import com.example.composeexercise.temperature.Utils.convertToCelcius
import com.example.composeexercise.temperature.Utils.convertToFahrenheit

@Composable
fun TwoWayConverter(modifier: Modifier = Modifier) {

    var celciusState by remember { mutableStateOf("")}
    var fahrenheitState by remember { mutableStateOf("")}

    Column(modifier = modifier.padding(dimensionResource(id = R.dimen.large_padding))) {
        Text(
            text = stringResource(id = R.string.two_way_converter),
            style = MaterialTheme.typography.h5
        )

        GeneralOutlinedTextField(
            scale = Scale.CELCIUS,
            input = celciusState,
            onChangeEvent = {
                celciusState = it
                fahrenheitState = it.convertToFahrenheit()
            }
        )

        GeneralOutlinedTextField(
            scale = Scale.FAHRENHEIT,
            input = fahrenheitState,
            onChangeEvent = {
                fahrenheitState = it
                celciusState = it.convertToCelcius()
            })
    }
}

@Composable
fun GeneralOutlinedTextField(
    scale: Scale,
    input: String,
    onChangeEvent: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        OutlinedTextField(
            value = input,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = stringResource(id = R.string.enter_temperature, scale.scaleName)) },
            onValueChange = onChangeEvent
        )
    }

}

enum class Scale(val scaleName: String) {
    CELCIUS("Celcius"),
    FAHRENHEIT("Fahrenheit")
}

@Preview
@Composable
fun TwoWayConverterPreview() {
    TwoWayConverter()
}