package com.example.composeexercise.myshoote.items

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.model.AlignYourBody
import com.example.composeexercise.model.AlignYourMind
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

@Composable
fun AlignYourMindRow(modifier: Modifier = Modifier, alignYourMind: AlignYourMind) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = alignYourMind.image),
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )

        Text(
            text = alignYourMind.name,
            style = MaterialTheme.typography.h3,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
        )
    }

}

@Preview(name = "light preview", uiMode = UI_MODE_NIGHT_NO)
@Composable
fun AlignYourMindPreview() {
    ComposeExerciseTheme {
        AlignYourMindRow(alignYourMind = AlignYourMind.items.first())
    }
}

