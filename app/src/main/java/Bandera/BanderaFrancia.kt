package Bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


    @Composable
    fun BanderaScreen (modifer: Modifier = Modifier) {
        Box(modifier = Modifier){
            Row(modifier = Modifier.fillMaxSize()){
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorResource(id = R.color.Rojo)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){ }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorResource(R.color.Blanco)),
                    ) { }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorResource(R.color.Rojo)),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){ }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun BanderaFranciaPreview() {
        BanderasTheme {
            BanderaScreen()
        }
    }

