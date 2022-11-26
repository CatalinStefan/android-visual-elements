package com.catalin.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp

@Composable
fun TestText() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "A simple hardcoded text")
        Text(text = stringResource(id = R.string.hello_text))
        Text(
            text = "Formatted text",
            color = Color.Red,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        val name = remember { mutableStateOf(TextFieldValue("")) }
//        var name by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text(text = "Name field") },
            placeholder = { Text(text = "Alex") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        val surname = remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(value = surname.value, onValueChange = { surname.value = it })
    }
}







