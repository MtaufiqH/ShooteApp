package com.example.composeexercise.myshoote.utiliities

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

@Composable
fun HomeBottomNavigation(modifier: Modifier = Modifier) {
    BottomAppBar(
        modifier = modifier,
        cutoutShape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
        backgroundColor = MaterialTheme.colors.background,
        elevation = 24.dp
    ) {
        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.Spa, contentDescription = null) },
            label = { Text(text = "Home".uppercase()) },
            selected = true,
            onClick = {},
        )

        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null) },
            label = { Text(text = "Profile".uppercase()) },
            selected = false,
            onClick = {})
    }
}

@Preview
@Composable
fun HomeBottomNavigationPreview() {
    ComposeExerciseTheme {
        HomeBottomNavigation()
    }
}