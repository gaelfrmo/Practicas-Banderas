package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaEEUU(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (franjas, cuadroAzul) = createRefs()
        val lineAzulAltura = createGuidelineFromTop(7f / 13f)
        val lineAzulAncho = createGuidelineFromStart(0.4f)

        Column(
            modifier = Modifier.constrainAs(franjas) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            repeat(13) { index ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(
                            if (index % 2 == 0) colorResource(id = R.color.rojo_EUA) else Color.White
                        )
                )
            }
        }

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.azul_EUA))
                .constrainAs(cuadroAzul) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(lineAzulAltura)
                    end.linkTo(lineAzulAncho)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                },
            contentAlignment = Alignment.Center
        ) {
            Row(modifier = Modifier.fillMaxSize()) {
                repeat(11) { index ->
                    val cantEstrellas = if (index % 2 == 0) 6 else 5
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        repeat(cantEstrellas) {
                            Text(text = "★", color = Color.White, fontSize = 6.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEEUUPreview() {
    BanderasTheme {
        Surface {
            BanderaEEUU()
        }
    }
}
