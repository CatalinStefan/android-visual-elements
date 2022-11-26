package com.catalin.visualelements

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TestSideEffects() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val showProgress = remember { mutableStateOf(false) }
        val launchEffect = remember { mutableStateOf(false) }
        val context = LocalContext.current

        Button(onClick = {
            showProgress.value = true
            launchEffect.value = true
        }) {
            Text(text = "Start processing")
        }

        if (showProgress.value)
            CircularProgressIndicator()

        if (launchEffect.value) {
            val coroutineScope = rememberCoroutineScope()
            LaunchedEffect(key1 = Unit) {
                coroutineScope.launch {
                    delay(3000)
                    Toast.makeText(context, "Task completed", Toast.LENGTH_SHORT).show()
                    showProgress.value = false
                    launchEffect.value = false
                }
            }
        }
    }
}






