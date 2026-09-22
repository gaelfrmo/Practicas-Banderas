package com.example.banderascompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Composable
fun BanderaJapon(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize().background(Color.White)){
        Box(modifier = Modifier
            .align (Alignment.Center)
            .size(200.dp)
            .clip(CircleShape)
            .background(Color.Red))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaJaponPreview() {
    Surface {
        BanderaJapon(modifier = Modifier.fillMaxSize())
    }
}
