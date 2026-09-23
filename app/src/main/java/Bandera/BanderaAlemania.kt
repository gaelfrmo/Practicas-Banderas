package Bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier){
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(colorResource(R.color.NegroAlemania)),
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(colorResource(R.color.RojoAlemania)),
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(colorResource(R.color.DoradoAlemania)),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaAlemaniaVista() {
    BanderasTheme {
        BanderaScreen()
    }
}