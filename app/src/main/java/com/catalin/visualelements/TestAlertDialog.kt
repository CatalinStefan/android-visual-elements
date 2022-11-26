package com.catalin.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

@Composable
fun TestAlertDialog() {
    val openDialog = remember { mutableStateOf(false) }
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "Open dialog")
        }

        if (openDialog.value)
            AlertDialog(onDismissRequest = { openDialog.value = false },
                title = { Text(text = "Hello") },
                text = { Text(text = "How are you?") },
                confirmButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "Good")
                    }
                },
                dismissButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "Bad")
                    }
                }
            )
    }
    
}





