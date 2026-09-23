package Bandera

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .background(colorResource(R.color.AmarilloColombia))
        ) {
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(colorResource(R.color.AzulColombia))
        ){}
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(colorResource(R.color.RojoColombia))
        ){}
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    Surface {
        BanderaScreen()
    }
}