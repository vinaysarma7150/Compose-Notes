package com.example.jetpackcomposenotes

import WebViewComponent
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import com.example.jetpackcomposenotes.ui.theme.JetpackComposeNotesTheme


class MainActivity : ComponentActivity() {

    val url = "https://google.com"
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeNotesTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {Text("WebView Example")},
                        )
                    }


                ) {  innerPadding ->

                    Column(
                        modifier = Modifier.fillMaxSize()
                            .padding(innerPadding)

                    ) {
                    WebViewComponent(url = url)

                    }
                }
            }
        }
    }
}

