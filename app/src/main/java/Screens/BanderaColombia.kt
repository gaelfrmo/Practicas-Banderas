package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

@Composable
fun BanderaColombia(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (Linea1,Linea2,Linea3) = createRefs()
        val lineSup = createGuidelineFromBottom(0.5f)
        val lineInf = createGuidelineFromBottom(0.25f)

        Box(
            modifier = Modifier
                .background(colorResource(R.color.AmarilloColombia))
                .constrainAs(Linea1) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(R.color.AzulColombia))
                .constrainAs(Linea2) {
                    top.linkTo(lineSup)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(R.color.RojoColombia))
                .constrainAs(Linea3) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(lineInf)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    BanderaColombia(modifier = Modifier.fillMaxSize())
}
