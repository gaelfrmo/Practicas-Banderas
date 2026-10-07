package com.example.banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaPapua(modifier: Modifier = Modifier) {
    val rojo = Color(0xFFD21034)
    val negro = Color(0xFF000000)
    val amarillo = Color(0xFFFFCE00)
    val blanco = Color(0xFFFFFFFF)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        // 1. Triángulo Rojo (Superior Derecho)
        val pathRojo = Path().apply {
            moveTo(0f, 0f)
            lineTo(w, 0f)
            lineTo(w, h)
            close()
        }
        drawPath(path = pathRojo, color = rojo)

        // 2. Triángulo Negro (Inferior Izquierdo)
        val pathNegro = Path().apply {
            moveTo(0f, 0f)
            lineTo(w, h)
            lineTo(0f, h)
            close()
        }
        drawPath(path = pathNegro, color = negro)

        // 3. Función auxiliar para dibujar estrellas
        fun drawStar(cx: Float, cy: Float, radius: Float) {
            val innerRadius = radius * 0.38f
            val starPath = Path().apply {
                for (i in 0 until 10) {
                    val r = if (i % 2 == 0) radius else innerRadius
                    val angle = Math.toRadians((i * 36 - 90).toDouble())
                    val x = cx + r * cos(angle).toFloat()
                    val y = cy + r * sin(angle).toFloat()
                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }
            drawPath(path = starPath, color = blanco)
        }

        // 4. Cruz del Sur (5 estrellas en la sección negra)
        val rGrande = h * 0.045f
        val rPequena = h * 0.025f

        drawStar(w * 0.22f, h * 0.60f, rGrande)
        drawStar(w * 0.22f, h * 0.90f, rGrande)
        drawStar(w * 0.08f, h * 0.75f, rGrande)
        drawStar(w * 0.36f, h * 0.75f, rGrande)
        drawStar(w * 0.29f, h * 0.83f, rPequena)

        // 5. Silueta del Ave del Paraíso (Sección roja)
        val avePath = Path().apply {
            val cx = w * 0.72f
            val cy = h * 0.30f
            moveTo(cx, cy)
            cubicTo(cx - 30f, cy - 40f, cx - 80f, cy - 20f, cx - 110f, cy - 60f)
            cubicTo(cx - 70f, cy - 10f, cx - 40f, cy - 10f, cx - 20f, cy + 10f)
            cubicTo(cx + 20f, cy - 30f, cx + 60f, cy - 50f, cx + 100f, cy - 70f)
            cubicTo(cx + 50f, cy - 20f, cx + 20f, cy - 10f, cx, cy)
            close()
        }
        drawPath(path = avePath, color = amarillo)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaPapuaPreview() {
    Surface {
        BanderaPapua(modifier = Modifier.fillMaxSize())
    }
}
