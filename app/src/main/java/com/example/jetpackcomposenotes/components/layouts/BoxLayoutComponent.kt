package com.example.jetpackcomposenotes.components.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun BoxLayoutComponent(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .fillMaxSize() // Box takes full available size
    ) {

        Text(
            text = "Note 1",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.TopEnd) // Position at top-right
        )

        Text(
            text = "Note 2",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.CenterStart) // Center vertically, left side
        )

        Text(
            text = "Note 3",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomEnd) // Bottom-right
        )
    }

    /*
    ===================== BOX NOTES =====================

    Box →
        - Stacks children on top of each other (Z-axis)
        - Similar to FrameLayout in XML

    ---------- DEFAULT BEHAVIOR ----------

    - Children are placed starting from top-start
    - Without alignment → all items overlap

    ---------- ALIGNMENT ----------

    Modifier.align() → used to position each child inside Box

    Common Alignments:
        Alignment.TopStart (default)
        Alignment.TopCenter
        Alignment.TopEnd

        Alignment.CenterStart
        Alignment.Center
        Alignment.CenterEnd

        Alignment.BottomStart
        Alignment.BottomCenter
        Alignment.BottomEnd

    ---------- MODIFIER ----------

    fillMaxSize() → full screen
    fillMaxWidth() / fillMaxHeight()
    padding() → spacing inside Box

    ---------- IMPORTANT CONCEPT ----------

    - Box allows overlapping UI (VERY IMPORTANT)
    - Last child is drawn on top

    Example:
        Text("A")
        Text("B") → B appears above A

    ---------- COMMON USE CASES ----------

    - Badges (cart count on icon)
    - Image with text overlay
    - Floating buttons on top of UI
    - Loading indicator over screen

    ---------- IMPORTANT NOTES ----------

    - Use align() inside BoxScope only
    - Order of children matters (z-index behavior)
    - For complex layering → use zIndex()

    =====================================================
    */
}