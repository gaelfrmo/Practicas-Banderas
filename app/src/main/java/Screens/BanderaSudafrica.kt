package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R


@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    val azulSudafrica = colorResource(id = R.color.azulSudafrica)
    val amarilloSudafrica = colorResource(id = R.color.amarilloSudafrica)
    val verdeSudafrica = colorResource(id = R.color.verdeSudafrica)
    val negroSudafrica = colorResource(id = R.color.negroSudafrica)
    val blancoSudafrica = colorResource(id = R.color.blancoSudafrica)

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (dibujoBandera) = createRefs()

        Canvas(
            modifier = Modifier
                .constrainAs(dibujoBandera) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        ) {
            val w = size.width
            val h = size.height

            val pathAzul = Path().apply {
                moveTo(0f, 0f)
                lineTo(w, 0f)
                lineTo(w, h * 0.30f)
                lineTo(w * 0.37f, h * 0.33f)
                close()
            }
            drawPath(path = pathAzul, color = azulSudafrica)

            val pathAmarillo = Path().apply {
                moveTo(w * 0.37f, h * 0.67f)
                lineTo(w, h * 0.70f)
                lineTo(w, h)
                lineTo(0f, h)
                close()
            }
            drawPath(path = pathAmarillo, color = amarilloSudafrica)

            val pathTrianguloAzulCentral = Path().apply {
                moveTo(w * 0.65f, h * 0.50f)
                lineTo(w, h * 0.38f)
                lineTo(w, h * 0.50f)
                close()
            }
            drawPath(path = pathTrianguloAzulCentral, color = azulSudafrica)

            val pathBlancoArriba = Path().apply {
                moveTo(0f, 0f)
                lineTo(0f, h * 0.08f)
                lineTo(w * 0.37f, h * 0.38f)
                lineTo(w, h * 0.12f)
                lineTo(w, h * 0.04f)
                close()
            }
            drawPath(path = pathBlancoArriba, color = blancoSudafrica)

            val pathBlancoAbajo = Path().apply {
                moveTo(0f, h)
                lineTo(0f, h * 0.92f)
                lineTo(w * 0.37f, h * 0.62f)
                lineTo(w, h * 0.88f)
                lineTo(w, h * 0.96f)
                close()
            }
            drawPath(path = pathBlancoAbajo, color = blancoSudafrica)

            val pathVerdeTopLeft = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.37f, h * 0.38f)
                lineTo(w * 0.28f, h * 0.50f)
                lineTo(0f, h * 0.20f)
                close()
            }
            drawPath(path = pathVerdeTopLeft, color = verdeSudafrica)

            val pathVerdeBottomLeft = Path().apply {
                moveTo(0f, h)
                lineTo(w * 0.37f, h * 0.62f)
                lineTo(w * 0.28f, h * 0.50f)
                lineTo(0f, h * 0.80f)
                close()
            }
            drawPath(path = pathVerdeBottomLeft, color = verdeSudafrica)

            val pathVerdeTopRight = Path().apply {
                moveTo(w * 0.55f, h * 0.50f)
                lineTo(w, h * 0.07f)
                lineTo(w, h * 0.27f)
                lineTo(w * 0.37f, h * 0.50f)
                close()
            }
            drawPath(path = pathVerdeTopRight, color = verdeSudafrica)

            val pathVerdeBottomRight = Path().apply {
                moveTo(w * 0.55f, h * 0.50f)
                lineTo(w, h * 0.93f)
                lineTo(w, h * 0.73f)
                lineTo(w * 0.37f, h * 0.50f)
                close()
            }
            drawPath(path = pathVerdeBottomRight, color = verdeSudafrica)

            val pathNegro = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.28f, h * 0.50f)
                lineTo(0f, h)
                close()
            }
            drawPath(path = pathNegro, color = negroSudafrica)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    Surface {
        BanderaSudafrica(modifier = Modifier.fillMaxSize())
    }
}
