package com.catalin.visualelements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun TestScrollable() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        val tf = remember { mutableStateOf(TextFieldValue("")) }

        Text(text = "Terms and conditions", fontWeight = FontWeight.Bold)
        Text(text = stringResource(id = R.string.lorem_ipsum))
        TextField(value = tf.value, onValueChange = { tf.value = it })
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
    }
}