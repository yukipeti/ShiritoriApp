package com.example.shiritoriapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun OutputText(textList: List<String>) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        textList.forEach {
            Text(
                text = it,
                modifier = Modifier
                    .background(
                        color = Color(231, 224, 236),
                        shape = RoundedCornerShape(16.dp),
                    )
                    .padding(all = 8.dp)
            )
        }
    }
}