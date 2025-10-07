package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.graphics.shapes.CornerRounding
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import com.example.prueba2.ui.theme.Prueba2Theme

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
            Box(
                Modifier
                    .size(40.dp)
                    .background(Color.Yellow)
                    .border(2.dp, Color.Black)
            ) {
                Text("DAM")
            }
            Canvas (Modifier){
                scale(scaleX = 10f, scaleY = 10f) {
                    drawCircle(Color.Green, radius = 2.dp.toPx())
                }
            }

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

            Box(
                Modifier
                    .background(Color.Magenta)
                    .border(2.dp, Color.Black)
                    .size(40.dp)
            ) {
                Text("ASIR")
            }
        }

    Spacer(Modifier.height(10.dp))

        Row {
            Box(
                modifier = Modifier
                    .size(200.dp, 200.dp)
                    .background(Color.Gray)

            ) {
                Text(
                    modifier=Modifier.background(Color.DarkGray),
                    text = "Texto en un box",
                    color=Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Prueba2Theme {
        IU()
    }
}