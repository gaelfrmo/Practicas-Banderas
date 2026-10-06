package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.R
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    val rojoTurquia = colorResource(id = R.color.RojoTurquia)
    val blancoTurquia = colorResource(id = R.color.BlancoTurquia)

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (lienzo) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(lienzo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            drawRect(color = rojoTurquia)

            val cy = size.height / 2f
            val rOut = size.height * 0.30f

            drawCircle(
                color = blancoTurquia,
                radius = rOut,
                center = Offset(size.width * 0.38f, cy)
            )

            drawCircle(
                color = rojoTurquia,
                radius = size.height * 0.24f,
                center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
            )
            val cxEstrella = size.width * 0.38f + size.height * 0.30f
            val rEstrellaExt = size.height * 0.12f
            val rEstrellaInt = size.height * 0.05f
            val pathEstrella = Path()
            val anguloInicial = -PI / 2 + 0.3

            for (i in 0 until 10) {
                val r = if (i % 2 == 0) rEstrellaExt else rEstrellaInt
                val angulo = anguloInicial + i * PI / 5
                val x = cxEstrella + r * cos(angulo).toFloat()
                val y = cy + r * sin(angulo).toFloat()

                if (i == 0) {
                    pathEstrella.moveTo(x, y)
                } else {
                    pathEstrella.lineTo(x, y)
                }
            }
            pathEstrella.close()

            drawPath(
                path = pathEstrella,
                color = blancoTurquia
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaTurquiaPreview() {
    Surface {
        BanderaTurquia(modifier = Modifier.fillMaxSize(),)
    }
}