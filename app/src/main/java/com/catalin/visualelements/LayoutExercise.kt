package com.catalin.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LayoutExercise() {
    Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(80.dp)
                    .background(Color.Red)
            ) {}
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(80.dp)
                    .background(Color.Green)
            ) {}
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(80.dp)
                    .background(Color.Blue)
            ) {}
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.6f),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(80.dp)
                    .background(Color(0xffffff00))
            ) { }
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(80.dp)
                    .background(Color(0xffffaa00))
            ) { }
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(80.dp)
                    .background(Color(0xffff00ff))
            ) { }
        }

        Box(
            modifier = Modifier
                .fillMaxSize(1f)
                .background(Color(0xff0055ff)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(0.8f)
                    .background(Color(0xff0099ff)),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(0.7f)
                        .background(Color(0xff00ccff)),
                    contentAlignment = Alignment.Center
                ) {}
            }
        }
    }
}