package Bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier){
        Column(modifier = Modifier){
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF75AADB)))

            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.White))

            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF75AADB)))


        }
        Box(modifier = Modifier
            .align(Alignment.Center)
            .size(50.dp)
            .clip(CircleShape)
            .background(Color(0xFFF6B40E)))

    }

}


@Preview(showBackground = true)
@Composable
fun BanderaArgentinaPreview() {
    Surface {
    BanderaScreen()

    }
}