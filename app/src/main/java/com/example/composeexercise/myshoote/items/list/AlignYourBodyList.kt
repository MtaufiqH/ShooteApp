package com.example.composeexercise.myshoote.items.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.model.AlignYourBody
import com.example.composeexercise.myshoote.items.AlignYourBodyRow
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

@Composable
fun AlignYourBodyList(modifier: Modifier = Modifier, alignYourBody: List<AlignYourBody>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(alignYourBody) { items ->
            AlignYourBodyRow(alignYourBody = items)
        }
    }
}

@Preview
@Composable
fun AlignYourBodyListPreview() {
    ComposeExerciseTheme {
        AlignYourBodyList(alignYourBody = AlignYourBody.items)
    }
}