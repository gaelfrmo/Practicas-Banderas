package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

@Composable
fun BanderaArgentina(modifier: Modifier = Modifier.fillMaxSize()) {
    ConstraintLayout(modifier = modifier){
        val (Caja1, Caja2,Caja3,escudo) = createRefs()
        val Linea1 = createGuidelineFromTop(0.33f)
        val linea2 = createGuidelineFromTop(0.66f)
        Box(
            modifier = Modifier
                .background(colorResource(R.color.AzulArgentina))
                .constrainAs(Caja1) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(Linea1)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints

            }
        )
        Box(modifier = modifier
            .background(colorResource(R.color.BlancoArgentina))
            .constrainAs(Caja2) {
                top.linkTo(Linea1)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(linea2)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        )
        Image(painter = painterResource(R.drawable.escudo_argetina),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
                .constrainAs(escudo) {
                start.linkTo(parent.start)
                bottom.linkTo(linea2)
                top.linkTo(Linea1)
                end.linkTo(parent.end)
            }
        )
        Box(modifier = modifier
            .background(colorResource(R.color.AzulArgentina))
            .constrainAs(Caja3) {
                top.linkTo(linea2)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaArgentinaPreview() {
    Surface {
        BanderaArgentina(modifier = Modifier.fillMaxSize())
    }
}