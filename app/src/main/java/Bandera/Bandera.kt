package Bandera

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.logo_espana)
    Column(modifier=modifier.fillMaxSize()) {
        Box(
            Modifier.weight(1f)
                .fillMaxWidth()
                .background(colorResource(R.color.RojoEspana))
        )
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(colorResource(R.color.AmarilloEspana)),
            contentAlignment = Alignment.CenterStart
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .padding(32.dp),
                contentScale = ContentScale.Fit
            )
        }
        Box(
            Modifier.weight(1f)
                .fillMaxWidth()
                .background(colorResource(R.color.RojoEspana))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaVista() {
    BanderasTheme {
        BanderaScreen()
    }
}