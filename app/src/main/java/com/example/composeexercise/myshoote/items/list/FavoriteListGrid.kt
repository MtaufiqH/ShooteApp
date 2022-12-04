package com.example.composeexercise.myshoote.items.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeexercise.model.FavCollections
import com.example.composeexercise.myshoote.items.FavoriteCollectionRow

@Composable
fun FavoriteCollectionGrid(
    modifier: Modifier,
    favCollections: List<FavCollections>
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.height(120.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(favCollections) { itemFavorite ->
            FavoriteCollectionRow(text = itemFavorite.name, image = itemFavorite.image)
        }

    }
}