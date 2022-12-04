package com.example.composeexercise

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexercise.converter.GreetingItem
import com.example.composeexercise.converter.GreetingItem2
import com.example.composeexercise.model.User

@Composable
fun AligmentExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ) {
        ButtonExampel()
        ButtonExampel()
        ButtonExampel()

    }
}


@Composable
fun RowAligment() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ButtonExampel()
        ButtonExampel()
        ButtonExampel()
    }
}

@Composable
fun ButtonExampel() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "example")
    }

}


@Composable
fun ContentCard() {
    Row(modifier = Modifier
        .clickable { }
        .padding(4.dp), verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(id = R.drawable.jetpack_compose),
            contentDescription = "avatar", modifier = Modifier
                .padding(4.dp)
                .border(
                    2.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
                .clip(CircleShape)
                .size(60.dp),
            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp)
        ) {
            Text(text = "Taufiq Hidayat, S.Kom", fontWeight = FontWeight.Bold)
            Text(text = "Online")

        }

        Icon(
            imageVector = Icons.Filled.Check,
            contentDescription = "is check",
            modifier = Modifier.offset(x = 1.dp, 30.dp)
        )
    }
}


@Composable
fun GreetingList(names: List<String>) {
    if (names.isNotEmpty()) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            items(names) { name ->
                GreetingItem(name = name)
            }

            items(names) { names ->
                GreetingItem2(name = names)
            }
        }
    } else {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "No people no great!")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AligmentPreview() {
    val item = User.sampleName
    GreetingList(names = item)
}