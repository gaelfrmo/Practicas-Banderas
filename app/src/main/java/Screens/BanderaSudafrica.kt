package Screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()){
        
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    Surface {
        BanderaSudafrica(modifier = Modifier.fillMaxSize())
    }
}
