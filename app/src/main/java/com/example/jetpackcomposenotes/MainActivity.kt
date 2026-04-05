package com.example.jetpackcomposenotes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.jetpackcomposenotes.components.textComponents.TextComponent
import com.example.jetpackcomposenotes.ui.theme.JetpackComposeNotesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeNotesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
                    TextComponent()
                }
            }
        }
    }
}

