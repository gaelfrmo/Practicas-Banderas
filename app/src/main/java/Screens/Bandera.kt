package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (Linea1, Linea2, Linea3, escudo) = createRefs()

        Box(
            modifier = Modifier
                .background(colorResource(R.color.VerdeMexico))
                .constrainAs(Linea1) {
                    start.linkTo(parent.start)
                    end.linkTo(Linea2.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(R.color.BlancoMexico))
                .constrainAs(Linea2) {
                    start.linkTo(Linea1.end)
                    end.linkTo(Linea3.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(R.color.RojoMexico))
                .constrainAs(Linea3) {
                    start.linkTo(Linea2.end)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Image(
            painter = painterResource(R.drawable.bandera_de_mexico),
            contentDescription = "Null",
            modifier = Modifier
                .height(120.dp)
                .constrainAs(escudo) {
                    start.linkTo(Linea2.start)
                    end.linkTo(Linea2.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaMexicovista() {
    BanderasTheme {
        BanderaMexico()
    }
}
