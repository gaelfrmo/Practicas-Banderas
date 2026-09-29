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
fun BanderaItalia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (linea1, linea2, linea3) = createRefs()

        Box(
            modifier = Modifier
                .background(colorResource(R.color.VerdeItalia))
                .constrainAs(linea1) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(linea2.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(R.color.BlancoItalia))
                .constrainAs(linea2) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(linea1.end)
                    end.linkTo(linea3.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(R.color.RojoItalia))
                .constrainAs(linea3) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(linea2.end)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaItaliaPreview() {
    Surface {
        BanderaItalia(modifier = Modifier.fillMaxSize())
    }
}
