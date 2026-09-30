package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R

@Composable
fun BanderaSuiza(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .background(colorResource(R.color.RojoSuiza))
    ) {
        Box(
            Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.2f)
                .fillMaxHeight(0.62f)
                .background(colorResource(R.color.BlancoSuiza))
        )
        Box(
            Modifier
                .align(Alignment.Center)
                .fillMaxHeight(0.2f)
                .fillMaxWidth(0.62f)
                .background(colorResource(R.color.BlancoSuiza))
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BanderaSuizaPreview() {
    Surface {
        BanderaSuiza(modifier = Modifier.fillMaxSize())
    }
}