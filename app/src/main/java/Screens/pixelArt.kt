package Screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R


@Composable
fun pixelArtScreen() {
    val T = colorResource(R.color.transparente)
    val K = colorResource(R.color.negro)
    val W = colorResource(R.color.blanco)
    val G = colorResource(R.color.gris_ojo)

    val N = colorResource(R.color.naranja_principal)
    val S = colorResource(R.color.naranja_sombra)
    val C = colorResource(R.color.naranja_cachete)
    val Y = colorResource(R.color.amarillo_panza)

    val F = colorResource(R.color.amarillo_llama)
    val R = colorResource(R.color.rojo_llama)
    val pixelcolores = listOf(
        //     1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21
        listOf(T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, K, T, T, T), // 1
        listOf(T, T, T, T, T, K, K, K, T, T, T, T, T, T, T, T, K, R, K, T, T), // 2
        listOf(T, T, T, K, K, N, N, N, K, T, T, T, T, T, T, T, K, R, R, K, T), // 3
        listOf(T, T, K, N, N, N, N, S, K, T, T, T, T, T, T, T, K, R, R, K, T), // 4
        listOf(T, T, K, N, N, N, N, S, S, K, T, T, T, T, T, K, R, R, N, R, K), // 5
        listOf(T, K, N, N, N, N, C, N, S, S, K, T, T, T, T, K, R, N, F, R, K), // 6
        listOf(T, K, N, N, N, N, W, K, S, S, K, T, T, T, T, K, R, F, F, R, K), // 7
        listOf(K, N, N, N, N, N, G, K, S, S, K, T, T, T, T, T, K, F, R, R, K), // 8
        listOf(K, N, N, N, N, N, K, K, S, S, K, T, T, T, T, T, K, R, R, K, T), // 9
        listOf(T, K, C, N, N, N, S, S, S, S, S, K, T, T, T, T, T, K, R, K, T), // 10
        listOf(T, T, K, K, S, S, S, S, S, S, S, K, T, T, T, T, K, S, K, T, T), // 11
        listOf(T, T, T, K, Y, Y, S, S, K, S, S, S, K, T, K, K, S, S, K, T, T), // 12
        listOf(T, T, T, K, Y, Y, S, K, S, N, S, S, S, K, S, S, S, K, T, T, T), // 13
        listOf(T, T, T, K, Y, Y, S, K, S, S, K, S, S, S, K, S, K, T, T, T, T), // 14
        listOf(T, T, K, S, Y, Y, Y, K, K, S, K, S, S, S, S, K, T, T, T, T, T), // 15
        listOf(T, T, K, W, S, S, Y, Y, S, S, S, S, W, S, K, T, T, T, T, T, T), // 16
        listOf(T, T, T, K, K, K, K, K, K, S, S, W, S, K, T, T, T, T, T, T, T), // 17
        listOf(T, T, T, T, T, T, T, T, T, K, W, K, K, T, T, T, T, T, T, T, T), // 18
        listOf(T, T, T, T, T, T, T, T, T, K, K, K, T, T, T, T, T, T, T, T, T), // 19
        listOf(T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T), // 20
        listOf(T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T)  // 21

    )
    val pixelSize = 14.dp
    Column {
        pixelcolores.forEach { rowColors ->
            Row {
                rowColors.forEach { pixelColor ->
                    Box(
                        modifier = Modifier
                            .size(pixelSize)
                            .background(pixelColor)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PixelArtPreview() {
    pixelArtScreen()
}