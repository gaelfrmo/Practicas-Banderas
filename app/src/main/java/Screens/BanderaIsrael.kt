package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(Color.White)) {
        Box(modifier = Modifier.weight(1f).fillMaxWidth())

        Box(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth()
                .background(colorResource(R.color.AzulIsrael))
        )
        Box(
            modifier = Modifier
                .weight(6f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            EstrellaDeDavid(
                modifier = Modifier.size(120.dp),
                color = colorResource(R.color.AzulIsrael)
            )
        }

        Box(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth()
                .background(colorResource(R.color.AzulIsrael))
        )
        Box(modifier = Modifier.weight(1f).fillMaxWidth())
    }
}

@Composable
fun EstrellaDeDavid(modifier: Modifier = Modifier, color: Color = Color(0xFF0038B8)) {
    Canvas(modifier = modifier) {
        val cx = size.width / 2f
        val cy = size.height / 2f
        val radius = size.minDimension / 2f
        val strokeWidth = 6.dp.toPx()

        val path1 = Path().apply {
            val a1 = Math.toRadians(-90.0)
            val a2 = Math.toRadians(30.0)
            val a3 = Math.toRadians(150.0)
            moveTo(cx + radius * cos(a1).toFloat(), cy + radius * sin(a1).toFloat())
            lineTo(cx + radius * cos(a2).toFloat(), cy + radius * sin(a2).toFloat())
            lineTo(cx + radius * cos(a3).toFloat(), cy + radius * sin(a3).toFloat())
            close()
        }

        val path2 = Path().apply {
            val a1 = Math.toRadians(90.0)
            val a2 = Math.toRadians(210.0)
            val a3 = Math.toRadians(330.0)
            moveTo(cx + radius * cos(a1).toFloat(), cy + radius * sin(a1).toFloat())
            lineTo(cx + radius * cos(a2).toFloat(), cy + radius * sin(a2).toFloat())
            lineTo(cx + radius * cos(a3).toFloat(), cy + radius * sin(a3).toFloat())
            close()
        }

        drawPath(path = path1, color = color, style = Stroke(width = strokeWidth))
        drawPath(path = path2, color = color, style = Stroke(width = strokeWidth))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaIsraelPreview() {
    Surface {
        BanderaIsrael(modifier = Modifier.fillMaxSize())
    }
}
