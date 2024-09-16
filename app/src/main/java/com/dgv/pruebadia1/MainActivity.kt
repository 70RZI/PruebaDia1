package com.dgv.pruebadia1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dgv.pruebadia1.ui.theme.PruebaDia1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebaDia1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Firstview(
                        name = "70RZI",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Firstview(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier){
        Row(modifier = modifier.fillMaxWidth(), horizontalArrangement =  Arrangement.SpaceAround){
            Text("Elemento 1")
            Text("Elemento 2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstviewPreview() {
    PruebaDia1Theme {
        Firstview("Android")
    }
}