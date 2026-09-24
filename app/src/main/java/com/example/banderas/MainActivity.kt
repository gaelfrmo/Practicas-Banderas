package com.example.banderas

import Bandera.BanderaScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize())
            { innerPadding ->
                BanderaScreen(modifier = Modifier.padding(innerPadding))

            }
        }
    }
}


@Composable
fun BanderaBrasil(modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun BanderaBrasilPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }

}

