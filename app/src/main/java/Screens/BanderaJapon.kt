package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.R

@Composable
fun BanderaJapon(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier) {
        Box(modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.Blancojapon))
        ){
            Box(modifier = modifier
                .align(Alignment.Center)
                .size(150.dp)
                .clip(CircleShape)
                .background(colorResource(R.color.Rojojapon))
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BanderaJaponPreview() {
    Surface {
        BanderaJapon()
    }
}
