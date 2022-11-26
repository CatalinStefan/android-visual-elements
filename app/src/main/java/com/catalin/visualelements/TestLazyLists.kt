package com.catalin.visualelements

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TestLazyLists() {

    val names = listOf("Anna", "Bob", "Carol", "David")
//    LazyColumn {
//        item { Text(text = "Header of the list", modifier = Modifier.height(100.dp)) }
//        items(names) {
//            Text(text = "User: $it", modifier = Modifier.height(100.dp))
//            Divider()
//        }
//        items(10) { Text(text = "User number $it", modifier = Modifier.height(100.dp)) }
//    }

//    LazyRow {
//        item { Text(text = "Header of the list", modifier = Modifier.height(100.dp)) }
//        items(names) {
//            Text(text = "User: $it", modifier = Modifier.height(100.dp))
//            Divider()
//        }
//        items(10) { Text(text = "User number $it", modifier = Modifier.height(100.dp)) }
//    }

    val imgList = listOf(
        R.drawable.img1_tokyo,
        R.drawable.img2_london,
        R.drawable.img3_paris,
        R.drawable.img4_newyork,
        R.drawable.img5_singapore,
        R.drawable.img6_bali
    )
    val gridImages = arrayListOf<Int>()
    for (i in 0..100) {
        gridImages.add(imgList.random())
    }

    LazyVerticalGrid(cells = GridCells.Adaptive(100.dp)) {
        items(gridImages) {
            val painterRes = painterResource(id = it)
            Image(
                painter = painterRes, contentDescription = null,
                modifier = Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
        }
    }

}




