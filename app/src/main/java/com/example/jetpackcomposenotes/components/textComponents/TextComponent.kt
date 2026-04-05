package com.example.jetpackcomposenotes.components.textComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TextComponent() {

    Text(
        text = "This is a text component", // Text to display

        color = Color.Red, // Text color

        fontSize = 30.sp, // Text size (use sp)

        fontFamily = FontFamily.Cursive, // Font family

        fontWeight = FontWeight.Bold, // Bold text

        fontStyle = FontStyle.Italic, // Italic style

        letterSpacing = 2.sp, // Space between characters

        lineHeight = 34.sp, // Space between lines

        textAlign = TextAlign.Center, // Text alignment inside width

        modifier = Modifier
            .fillMaxWidth() // Needed for alignment
            .padding(8.dp), // Outer spacing

        maxLines = 2, // Max number of lines

        minLines = 1, // Minimum lines reserved

        overflow = TextOverflow.Ellipsis, // "..." when overflow

        softWrap = true, // Allows text to wrap to next line

        style = TextStyle(
            background = Color.Yellow, // Background behind text
            textDecoration = TextDecoration.Underline // Underline text
        )
    )

    /*
    ----------- MOST USED ATTRIBUTES -----------

    text → String to display

    color → Text color

    fontSize → Size in sp

    fontWeight → Bold, Medium, etc.

    fontStyle → Italic / Normal

    fontFamily → Font type (Serif, SansSerif, Cursive)

    letterSpacing → Space between characters

    lineHeight → Space between lines (important for readability)

    textAlign → Start / Center / End / Justify

    maxLines → Limit lines (VERY IMPORTANT in lists)

    minLines → Reserve minimum height

    overflow →
        Ellipsis → "..." (most used)
        Clip → cuts text
        Visible → allows overflow

    softWrap →
        true → wraps text (default)
        false → keeps in single line

    style (TextStyle) →
        background → background color
        textDecoration →
            Underline
            LineThrough

    modifier →
        fillMaxWidth() → take full width
        padding() → spacing
        clickable() → make text clickable (very common)

    ----------- IMPORTANT NOTES -----------

    - Always pass modifier from parent in reusable components
    - Use sp for text, dp for layout
    - textAlign works only with width constraint
    - Use maxLines + overflow in lists (prevents UI break)
    */
}