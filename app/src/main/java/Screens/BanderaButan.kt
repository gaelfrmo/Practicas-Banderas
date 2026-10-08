package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.R

@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    val yellowColor = colorResource(id = R.color.butan_yellow)
    val orangeColor = colorResource(id = R.color.butan_orange)

    ConstraintLayout(
        modifier = modifier
    ) {
        val (fondoCanvas, dragonImage) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(fondoCanvas) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val width = size.width
            val height = size.height

            val pathYellow = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f)
                lineTo(0f, height)
                close()
            }
            drawPath(path = pathYellow, color = yellowColor)

            val pathOrange = Path().apply {
                moveTo(width, 0f)
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }
            drawPath(path = pathOrange, color = orangeColor)
        }

        Image(
            painter = painterResource(id = R.drawable.dragon_butan),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(0.6f)
                .constrainAs(dragonImage) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaButanPreview() {
    Surface {
        BanderaButan(modifier = Modifier.fillMaxSize())
    }
}


