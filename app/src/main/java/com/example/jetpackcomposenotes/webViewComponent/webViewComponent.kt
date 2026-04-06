package com.example.jetpackcomposenotes.webViewComponent

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewComponent(
    url: String,
    modifier: Modifier = Modifier,
    onExit: () -> Unit = {} // called when no more back stack
) {
    var webView: WebView? by remember { mutableStateOf(null) }
    // 🔥 Handle device back press
    BackHandler {
        if (webView?.canGoBack() == true) {
            webView?.goBack()
        } else {
            onExit()
        }
    }
    AndroidView(
        modifier = modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {

                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )

                settings.apply {
                    javaScriptEnabled = true
                    domStorageEnabled = true
                }

                webViewClient = WebViewClient()

                loadUrl(url)

                webView = this // store reference
            }
        },
        update = {}
    )
    // 🔥 Cleanup (important)
    DisposableEffect(Unit) {
        onDispose {
            webView?.destroy()
        }
    }
}