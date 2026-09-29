package Bandera

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (linea1, linea2, linea3, escudo) = createRefs()

        Box(
            modifier = Modifier
                .background(colorResource(R.color.RojoEspana))
                .constrainAs(linea1) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(linea2.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(R.color.AmarilloEspana))
                .constrainAs(linea2) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(linea1.bottom)
                    bottom.linkTo(linea3.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.percent(0.5f)
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(R.color.RojoEspana))
                .constrainAs(linea3) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(linea2.bottom)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Image(
            painter = painterResource(R.drawable.logo_espana),
            contentDescription = "Escudo de España",
            modifier = Modifier
                .height(100.dp)
                .constrainAs(escudo) {
                    linkTo(start = linea2.start, end = linea2.end, bias = 0.3f)
                    top.linkTo(linea2.top)
                    bottom.linkTo(linea2.bottom)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    Surface {
        BanderaEspana(modifier = Modifier.fillMaxSize())
    }
}
