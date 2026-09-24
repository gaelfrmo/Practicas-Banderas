package com.example.banderas

import Bandera.BanderaScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                BanderaScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun BanderaEEUU(modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun BanderaEEUUPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}
