package com.example.jetpackcomposenotes.components.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun RowLayoutComponent(modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .fillMaxSize(), // Makes Row take full screen size

        verticalAlignment = Alignment.CenterVertically, // Align children vertically inside Row

        horizontalArrangement = Arrangement.SpaceEvenly // Distributes items horizontally with equal spacing
    ) {

        Text(
            text = "Apple",
            fontSize = 30.sp // Text size
        )

        Text(
            text = "Banana",
            fontSize = 30.sp
        )

        Text(
            text = "Grape",
            fontSize = 30.sp
        )
    }

    /*
    ===================== ROW NOTES =====================

    Row →
        - Places children horizontally (left → right)
        - Opposite of Column

    ---------- ALIGNMENTS ----------

    verticalAlignment → controls vertical positioning of children

        Alignment.Top
        Alignment.CenterVertically (most used)
        Alignment.Bottom

    ---------- ARRANGEMENTS ----------

    horizontalArrangement → controls spacing between items

        Arrangement.Start → items at start (default)
        Arrangement.End → items at end
        Arrangement.Center → items centered
        Arrangement.SpaceBetween → space between items (no edge spacing)
        Arrangement.SpaceAround → equal space around items
        Arrangement.SpaceEvenly → equal space everywhere (most balanced)

    ---------- MODIFIER ----------

    fillMaxWidth() → most common for Row
    fillMaxSize() → full screen
    padding() → spacing around Row
    height() → control Row height

    ---------- CHILD BEHAVIOR ----------

    - Children take only required width by default
    - To distribute space equally → use weight()

    Example:
        Text(
            text = "A",
            modifier = Modifier.weight(1f)
        )

    ---------- IMPORTANT NOTES ----------

    - Row is horizontal → width matters more than height
    - Use weight() for equal distribution (VERY IMPORTANT)
    - Avoid hardcoding sizes when possible
    - Arrangement + Alignment together control full layout

    =====================================================
    */
}