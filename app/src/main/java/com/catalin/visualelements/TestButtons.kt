package com.catalin.visualelements

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
fun TestButtons() {
    val context = LocalContext.current
    val btnImage = painterResource(id = R.drawable.ic_user)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show() },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Red,
                contentColor = Color.Green
            )
        ) {
            Image(painter = btnImage, contentDescription = null)
            Text(text = "Profile")
        }
    }
}




