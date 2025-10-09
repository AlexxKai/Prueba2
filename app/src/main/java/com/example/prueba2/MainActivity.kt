package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview

//unidades de medida
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.prueba2.ui.theme.Prueba2Theme

//imagen desde internet, tambien modificar build.gradle.kts:app y en manifiest el xml
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

//imagen desde local
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IU()
        }
    }
}

@Composable
fun IU() {
//    Column(modifier = Modifier.padding(24.dp)) {
//        Text(text = "Hello,")
//        Text(text = name)
//    }
//
//    Row(
//        modifier = Modifier.fillMaxWidth(), // Rellena to-do el ancho
//        horizontalArrangement = Arrangement.Start, // Distribuye el espacio entre los elementos
//        verticalAlignment = Alignment.CenterVertically // Centra verticalmente los elementos
//    ) {
//        // Elementos hijos de Column de tipo Text
//        Text("Texto 1")
//        Text("Texto 2")
//    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(24.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Cyan),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "Desarrollo en Android",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                textDecoration = TextDecoration.Underline
            )
        }
        Spacer(Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = " DAM",
                fontSize = 13.sp,
                modifier = Modifier
                    .size(70.dp)
                    .background(color = Color.Yellow)
                    .border(3.dp, color = Color.Black)
                    .wrapContentSize(Alignment.CenterStart)
                    .padding(horizontal = 5.dp)
            )

            Text(
                text = "DAW",
                fontSize = 13.sp,
                modifier = Modifier
                    .size(70.dp)
                    .background(color = Color.Green, shape = CircleShape)
                    .border(3.dp, color = Color.Black, shape = CircleShape)
                    .wrapContentSize(Alignment.TopCenter)
                    .padding(top = 5.dp)
            )

//            Box(
//                modifier = Modifier
//                    .drawWithCache {
//                        val roundedPolygon = RoundedPolygon(
//                            numVertices = 200,
//                            radius = size.minDimension / 2,
//                            centerX = size.width / 2,
//                            centerY = size.height / 2,
//                            rounding = CornerRounding(
//                                size.minDimension / 10f,
//                                smoothing = 0.1f
//                            )
//                        )
//                        val roundedPolygonPath = roundedPolygon.toPath().asComposePath()
//                        onDrawBehind {
//                            drawPath(roundedPolygonPath, color = Color.Green)
//                        }
//                    }
//                    .fillMaxSize()
//            )

            Text(
                text = "ASIR ",
                fontSize = 13.sp,
                modifier = Modifier
                    .size(70.dp)
                    .background(color = Color.Magenta)
                    .border(3.dp, color = Color.Black)
                    .wrapContentSize(Alignment.BottomEnd)
                    .padding(bottom = 5.dp)
            )
        }

        Spacer(Modifier.height(10.dp))

        Row {
            Box(
                modifier = Modifier
                    .size(200.dp, 200.dp)
                    .background(Color.Gray)
                    .wrapContentSize(Alignment.Center)

            ) {
                Text(
                    text = "Texto en un box",
                    color = Color.White,
                    modifier = Modifier
                        .background(Color.DarkGray),
                )
            }
        }

        Image(
            painter=painterResource(id=R.drawable.yo),
            contentDescription = "Imagen cargada en local"
        )

        AsyncImage(
            model = "https://media.istockphoto.com/id/613872668/es/foto/jack-o-linterna.webp?s=2048x2048&w=is&k=20&c=PY3vLknAGzgXpq2W1V0IUM2UoLxinvP5gJf0opjaEvw=",
            contentDescription = "Imagen de"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Prueba2Theme {
        IU()
    }
}