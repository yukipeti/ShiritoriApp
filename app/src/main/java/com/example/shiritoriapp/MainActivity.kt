package com.example.shiritoriapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import com.example.shiritoriapp.ui.theme.ShiritoriAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShiritoriAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    InputText()
                }
            }
        }
    }
}

@Composable
fun InputText() {
    val inputValue = rememberSaveable { mutableStateOf("") }
    Box(contentAlignment = Alignment.BottomCenter) {
        TextField(
            value = inputValue.value,
            onValueChange = { inputValue.value = it },
        )
    }

}
