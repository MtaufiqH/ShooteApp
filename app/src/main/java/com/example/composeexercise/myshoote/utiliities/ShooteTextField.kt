package com.example.composeexercise.myshoote.utiliities

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ShooteTextField(
    labelText: String,
    modifier: Modifier = Modifier,
    leadingIcon: ImageVector? = null
) {
    TextField(
        value = "",
        label = { Text(text = labelText) },
        onValueChange = {},
        modifier = modifier.fillMaxWidth().heightIn(min = 56.dp),
        leadingIcon = {
            leadingIcon?.let {
                Icon(
                    imageVector = leadingIcon,
                    modifier = Modifier.size(18.dp),
                    contentDescription = null,
                )
            }
        },

        colors = TextFieldDefaults.textFieldColors(backgroundColor = MaterialTheme.colors.surface)
    )
}