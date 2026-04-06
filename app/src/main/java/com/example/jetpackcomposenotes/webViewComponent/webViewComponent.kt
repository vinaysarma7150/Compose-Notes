import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewComponent(
    url: String,
    modifier: Modifier = Modifier,
    onExit: () -> Unit = {} // Called when no back stack left
) {

    var webView: WebView? by remember { mutableStateOf(null) }
    // Holds WebView reference across recompositions

    BackHandler {
        // Handles device/system back press

        if (webView?.canGoBack() == true) {
            webView?.goBack() // Navigate back inside WebView history
        } else {
            onExit() // Exit screen when no history left
        }
    }

    AndroidView(
        modifier = modifier.fillMaxSize(), // Makes WebView full screen

        factory = { context ->
            // Creates the WebView (called once)

            WebView(context).apply {

                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )

                settings.apply {
                    javaScriptEnabled = true // Enables JS (required for most sites)
                    domStorageEnabled = true // Enables local storage (important for modern sites)
                }

                webViewClient = WebViewClient()
                // Prevents opening browser (keeps navigation inside app)

                loadUrl(url) // Loads initial URL

                webView = this // Save reference for back handling
            }
        },

        update = {
            // Called on recomposition (use to update URL if needed)

            // Example:
            // if (it.url != url) it.loadUrl(url)
        }
    )

    DisposableEffect(Unit) {
        // Runs when composable leaves composition

        onDispose {
            webView?.destroy() // Cleans up WebView (VERY IMPORTANT to avoid memory leaks)
        }
    }

    /*
    ===================== WEBVIEW NOTES =====================

    AndroidView →
        - Used to embed traditional Android Views in Compose
        - Required for WebView (no native Compose WebView yet)

    ---------- CORE FLOW ----------

    factory →
        - Creates the View (called once)

    update →
        - Updates View on recomposition

    ---------- WEBVIEW SETTINGS ----------

    javaScriptEnabled →
        true → required for most websites

    domStorageEnabled →
        true → enables local/session storage

    webViewClient →
        - Keeps navigation inside app
        - Without it → opens external browser

    ---------- BACK HANDLING ----------

    canGoBack() → checks WebView history

    goBack() → navigates back inside WebView

    BackHandler →
        - Overrides system back press
        - Used for navigation control

    ---------- CLEANUP ----------

    destroy() →
        - Must call to avoid memory leaks
        - Done inside DisposableEffect

    ---------- IMPORTANT NOTES ----------

    - Always use WebViewClient (avoid external browser)
    - Always clean up WebView (destroy)
    - Be careful with JavaScript (security risk)
    - Avoid recreating WebView unnecessarily

    ========================================================
    */
}