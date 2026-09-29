package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

val RombosShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}

@Composable
fun BanderaBrasil(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja1, caja2, caja3) = createRefs()

        val linea1 = createGuidelineFromTop(1f)

        Box(
            modifier = Modifier
                .background(colorResource(R.color.VerdeBrasil))
                .constrainAs(caja1) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(linea1)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .fillMaxSize(0.75f)
                .clip(RombosShape)
                .background(colorResource(R.color.AmarilloBrasil))
                .constrainAs(caja2) {
                    centerTo(parent)
                }
        )

        Image(
            painter = painterResource(R.drawable.escudo_brasil),
            contentDescription = "Escudo de Brasil",
            modifier = Modifier
                .rotate(100f)
                .size(250.dp)
                .constrainAs(caja3) {
                    centerTo(caja2)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaBrasilPreview() {
    Surface {
        BanderaBrasil(modifier = Modifier.fillMaxSize())
    }
}
