package Screens

import android.graphics.Path
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin

fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun BanderaIsraelPreview() {
    Surface {
        BanderaIsrael(modifier = Modifier.fillMaxSize())
    }
}
