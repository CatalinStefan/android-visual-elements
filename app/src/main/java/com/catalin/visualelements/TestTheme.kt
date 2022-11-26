package com.catalin.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun TestTheme() {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(100.dp)
            .background(MaterialTheme.colors.primary)
        ) {}

        Box(modifier = Modifier
            .padding(8.dp)
            .size(100.dp)
            .clip(MaterialTheme.shapes.small)
            .background(MaterialTheme.colors.primary)
        ) {
            Text(text = "Theming", style = MaterialTheme.typography.h4)
        }
    }
}