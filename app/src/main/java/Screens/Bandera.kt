package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banderas.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bandera_de_mexico)
    Row(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(colorResource(id=R.color.VerdeMexico)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(R.string.M), color = Color.Black, fontSize = 90.sp)
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(colorResource(R.color.BlancoMexico)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.height(100.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(colorResource(R.color.RojoMexico)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text =stringResource(R.string.E), color = Color.Black, fontSize = 90.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaMexicoPreview() {
    BanderaScreen()
}

