
package com.devesh.ludox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                GameScreen()
            }
        }
    }
}

@Composable
fun GameScreen() {
    var dice by remember { mutableIntStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF151525))
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "MISSION LUDO X",
            color = Color.White,
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "🎲 $dice",
            color = Color.White,
            fontSize = 55.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            dice = (1..6).random()
        }) {
            Text("ROLL DICE")
        }
    }
}
