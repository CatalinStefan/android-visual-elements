package com.catalin.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DogsList() {
    LazyColumn {
        item {
            Text(
                text = "Most popular dog breeds",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(4.dp)
            )
        }
        items(getDogs()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(4.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xffeeeeee))
            ) {
                val painter = painterResource(id = it.imageId)
                Image(
                    painter = painter,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier
                    .padding(4.dp)
                    .weight(2f)) {
                    Text(text = it.name, fontWeight = FontWeight.Bold)
                    Text(text = it.desc, fontSize = 10.sp)
                }
            }
        }
    }
}





