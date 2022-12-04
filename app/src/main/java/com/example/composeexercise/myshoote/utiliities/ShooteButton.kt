package com.example.composeexercise.myshoote.utiliities

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.R

@Composable
fun ShooteButton(
    modifier: Modifier = Modifier,
    onClickButton: () -> Unit,
    @StringRes buttonText: Int,
    buttonColor: Color = MaterialTheme.colors.primary
) {
    Button(
        onClick = onClickButton,
        modifier = modifier
            .height(72.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor),
        shape = MaterialTheme.shapes.medium

    ) {
        Text(text = stringResource(id = buttonText).uppercase())
    }
}

@Preview(name = "light preview")
@Composable
fun LightPreview() {
    ShooteButton(onClickButton = { /*TODO*/ }, buttonText = R.string.log_in_title)
}