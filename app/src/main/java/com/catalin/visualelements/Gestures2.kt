package com.catalin.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun TestGestures2() {
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    Column(modifier = Modifier.fillMaxSize(1f)) {
        Box(modifier = Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .size(100.dp)
            .background(Color.Red)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consumeAllChanges()
                    offsetX += dragAmount.x
                    offsetY += dragAmount.y
                }
            }
        ) {

        }
    }
}