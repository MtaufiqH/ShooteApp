package com.example.composeexercise.myshoote.screen

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.model.AlignYourBody
import com.example.composeexercise.model.AlignYourMind
import com.example.composeexercise.model.FavCollections
import com.example.composeexercise.myshoote.items.list.AlignYourBodyList
import com.example.composeexercise.myshoote.items.list.AlignYourMindList
import com.example.composeexercise.myshoote.items.list.FavoriteCollectionGrid
import com.example.composeexercise.myshoote.utiliities.HomeBottomNavigation
import com.example.composeexercise.myshoote.utiliities.ShooteTextField
import com.example.composeexercise.ui.theme.ComposeExerciseTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    favCollections: List<FavCollections>,
    alignYourBody: List<AlignYourBody>,
    alignYourMind: List<AlignYourMind>,
) {
    Scaffold(
        bottomBar = { HomeBottomNavigation() },
        floatingActionButton = {
            FloatingActionButton(onClick = {}, backgroundColor = MaterialTheme.colors.primary) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null)
            }
        }, floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {
        Surface(
            Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(56.dp))
                ShooteTextField(
                    labelText = "Search",
                    leadingIcon = Icons.Default.Search,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                FavoriteCollectionSection(modifier = modifier, favCollections)
                AlignYourBodySection(items = alignYourBody)
                AlignYourMindSection(items = alignYourMind)
            }
        }
    }
}


@Composable
fun FavoriteCollectionSection(modifier: Modifier = Modifier, favCollections: List<FavCollections>) {
    Column {
        Text(
            text = "Favorite Collections".uppercase(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))
        FavoriteCollectionGrid(modifier, favCollections)
    }
}

@Composable
fun AlignYourBodySection(modifier: Modifier = Modifier, items: List<AlignYourBody>) {

    Column(modifier = modifier) {
        Text(
            text = "Align Your Body".uppercase(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        AlignYourBodyList(alignYourBody = items)
    }
}

@Composable
fun AlignYourMindSection(modifier: Modifier = Modifier, items: List<AlignYourMind>) {
    Column(modifier = modifier) {
        Text(
            text = "Align Your Mind".uppercase(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        AlignYourMindList(alignYourMind = items)

    }
}

@Preview(name = "light preview", uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LightPreviewHome() {
    ComposeExerciseTheme {
        val fav = FavCollections.favCollections
        val align = AlignYourBody.items
        val mind = AlignYourMind.items
        HomeScreen(favCollections = fav, alignYourBody = align, alignYourMind = mind)
    }

}

@Preview(name = "light preview", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkPreviewHome() {
    ComposeExerciseTheme {
        val fav = FavCollections.favCollections
        val align = AlignYourBody.items
        val mind = AlignYourMind.items
        HomeScreen(favCollections = fav, alignYourBody = align, alignYourMind = mind)
    }
}