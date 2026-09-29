package Bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

@Composable
fun BanderaAlemania(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (linea1, linea2, linea3) = createRefs()

        Box(
            modifier = Modifier
                .background(colorResource(R.color.NegroAlemania))
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
                .background(colorResource(R.color.RojoAlemania))
                .constrainAs(linea2) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(linea1.bottom)
                    bottom.linkTo(linea3.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(R.color.AmarilloAlemania))
                .constrainAs(linea3) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(linea2.bottom)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaAlemaniaPreview() {
    Surface {
        BanderaAlemania(modifier = Modifier.fillMaxSize())
    }
}
