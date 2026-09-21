package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaArgentina(modifier: Modifier = Modifier) {
Box(modifier = modifier){
    Column(modifier = Modifier){
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color(0xFF75AADB)))

        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.White))

        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color(0xFF75AADB)))


        }
        Box(modifier = Modifier
            .align(Alignment.Center)
            .size(50.dp)
            .clip(CircleShape)
            .background(Color(0xFFF6B40E)))

            }

        }


@Preview(showBackground = true)
@Composable
fun BanderaArgentinaPreview() {
    Surface {
        BanderaArgentina(modifier = Modifier.fillMaxSize())
    }
}
