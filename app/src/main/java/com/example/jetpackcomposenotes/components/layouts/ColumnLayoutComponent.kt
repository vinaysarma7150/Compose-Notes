package com.example.jetpackcomposenotes.components.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ColumnLayoutComponent(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize(), // Makes Column take full screen size

        horizontalAlignment = Alignment.CenterHorizontally, // Align children horizontally

        verticalArrangement = Arrangement.SpaceEvenly // Distributes items vertically with equal spacing
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
    ===================== COLUMN NOTES =====================

    Column →
        - Places children vertically (top → bottom)
        - Opposite of Row

    ---------- ALIGNMENTS ----------

    horizontalAlignment → controls horizontal positioning of children

        Alignment.Start
        Alignment.CenterHorizontally (most used)
        Alignment.End

    ---------- ARRANGEMENTS ----------

    verticalArrangement → controls spacing between items

        Arrangement.Top → items at top (default)
        Arrangement.Bottom → items at bottom
        Arrangement.Center → items centered
        Arrangement.SpaceBetween → space between items (no edge spacing)
        Arrangement.SpaceAround → equal space around items
        Arrangement.SpaceEvenly → equal space everywhere

    ---------- MODIFIER ----------

    fillMaxHeight() → most common for Column
    fillMaxSize() → full screen
    padding() → spacing around Column
    width() → control Column width

    ---------- CHILD BEHAVIOR ----------

    - Children take only required height by default
    - To distribute space equally → use weight()

    Example:
        Text(
            text = "A",
            modifier = Modifier.weight(1f)
        )

    ---------- IMPORTANT NOTES ----------

    - Column is vertical → height matters more than width
    - Use weight() for equal distribution (VERY IMPORTANT)
    - Arrangement + Alignment together define layout behavior

    ========================================================
    */
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ColumnExample() {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text( text = "Login here", fontSize = 20.sp)
        OutlinedTextField( value = "", onValueChange = {}, label = {Text(text = "Username")})
        OutlinedTextField( value = "", onValueChange = {},label = {Text("Password")})
    }

}