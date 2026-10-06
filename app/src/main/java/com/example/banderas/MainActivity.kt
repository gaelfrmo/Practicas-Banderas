package com.example.banderas

import Screens.BanderaTurquia
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanderasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    BanderaTurquia()
                }
            }
        }
    }
}
