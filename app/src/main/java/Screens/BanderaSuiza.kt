package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.R

@Composable
fun BanderaSuiza(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.RojoSuiza))
    ) {
        val (brazoVertical, brazoHorizontal) = createRefs()

        Box(
            modifier = Modifier
                .size(width = 60.dp, height = 200.dp)
                .background(colorResource(id = R.color.BlancoSuiza))
                .constrainAs(brazoVertical) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Box(
            modifier = Modifier
                .size(width = 200.dp, height = 60.dp)
                .background(colorResource(id = R.color.BlancoSuiza))
                .constrainAs(brazoHorizontal) {
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
fun BanderaSuizaPreview() {
    Surface {
        BanderaSuiza()
    }
}