package com.iago.practicando.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen2(navigateToScreen3: (String) -> Unit) {
    var textField by remember { mutableStateOf("") }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {navigateToScreen3("h")}) {
            Text("Pantalla 2")

        }
        OutlinedTextField(value = textField, onValueChange = {textField = it})


    }

}


@Preview(showSystemUi = true)
@Composable
private fun Prev() {
    Screen2({})

}