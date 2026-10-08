package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R


@Composable
fun pixelArtScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        val p = 14.dp
        val N = colorResource(R.color.negro)
        val T = colorResource(R.color.transparente)
        val C = colorResource(R.color.cafe)
        val A = colorResource(R.color.amarillo)
        val B = colorResource(R.color.blanco)
        val R = colorResource(R.color.azul)

        Column {
            // fila numero1
            Row {
                Box(modifier = Modifier.size(p).background(T))//1
                Box(modifier = Modifier.size(p).background(T))//2
                Box(modifier = Modifier.size(p).background(T))//3
                Box(modifier = Modifier.size(p).background(T))//4
                Box(modifier = Modifier.size(p).background(T))//5
                Box(modifier = Modifier.size(p).background(T))//6
                Box(modifier = Modifier.size(p).background(T))//7
                Box(modifier = Modifier.size(p).background(T))//8
                Box(modifier = Modifier.size(p).background(T))//9
                Box(modifier = Modifier.size(p).background(T))//10
                Box(modifier = Modifier.size(p).background(T))//11
                Box(modifier = Modifier.size(p).background(T))//12
                Box(modifier = Modifier.size(p).background(T))//13
                Box(modifier = Modifier.size(p).background(T))//14
                Box(modifier = Modifier.size(p).background(T))//15
                Box(modifier = Modifier.size(p).background(T))//16
                Box(modifier = Modifier.size(p).background(T))//17
                Box(modifier = Modifier.size(p).background(T))//18
                Box(modifier = Modifier.size(p).background(T))//19
                Box(modifier = Modifier.size(p).background(T))//20
                Box(modifier = Modifier.size(p).background(T))//21
                Box(modifier = Modifier.size(p).background(T))//22
                Box(modifier = Modifier.size(p).background(T))//23
                Box(modifier = Modifier.size(p).background(T))//24
                Box(modifier = Modifier.size(p).background(T))//25
                Box(modifier = Modifier.size(p).background(T))//26
            }

            // fila numero 2
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 3
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 4
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 5
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 6
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(B))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(B))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 7
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 8
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 9
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 10
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 11
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 12

            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }
            // fila numero 13
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }


            // fila numero 14

            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 15

            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 16
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 17
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 18
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(C))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(A))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 19
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 20
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(R))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }

            // fila numero 21
            Row {
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(N))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
                Box(modifier = Modifier.size(p).background(T))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PixelArtPreview() {
    pixelArtScreen()
}