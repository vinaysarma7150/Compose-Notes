package com.example.jetpackcomposenotes.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardComponent(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp), // Outer padding

        verticalArrangement = Arrangement.Center, // Center vertically

        horizontalAlignment = Alignment.CenterHorizontally // Center horizontally
    ) {

        Card(
            modifier = Modifier.fillMaxWidth(), // Card full width

            elevation = CardDefaults.cardElevation(
                defaultElevation = 12.dp, // Normal shadow
                pressedElevation = 16.dp // Shadow when pressed
            ),

            shape = RoundedCornerShape(12.dp), // Rounded corners (very common)

            colors = CardDefaults.cardColors(
                containerColor = Color.White, // Background color
                contentColor = Color.Black // Default content color
            )
        ) {

            Row(
                modifier = Modifier.padding(12.dp), // Inner padding

                verticalAlignment = Alignment.CenterVertically, // Align items vertically

                horizontalArrangement = Arrangement.Start // Items start from left
            ) {

                Box(
                    modifier = Modifier
                        .size(90.dp) // Size of avatar
                        .background(Color.LightGray, CircleShape) // Circular background
                        .padding(8.dp), // Inner padding

                    contentAlignment = Alignment.Center // Center icon
                ) {

                    Icon(
                        imageVector = Icons.Default.Person, // Icon

                        contentDescription = null, // Accessibility (null if decorative)

                        modifier = Modifier.size(50.dp), // Icon size

                        tint = Color.DarkGray // Icon color
                    )
                }

                Spacer(modifier = Modifier.width(12.dp)) // Space between icon & text

                Column {

                    Text(
                        text = "Vinay Sharma", fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Android Developer | Kotlin | Java | Data Structures | System Design | AI",
                        fontSize = 14.sp
                    )
                }
            }
        }
    }

    /*
    ===================== CARD NOTES =====================

    Card →
        - Material UI container
        - Used for grouping content
        - Comes with elevation + shape + background

    ---------- CORE PROPERTIES ----------

    elevation →
        - Controls shadow
        - defaultElevation (normal)
        - pressedElevation (when clicked)

    shape →
        - RoundedCornerShape (most used)
        - CircleShape (rare for card)

    colors →
        containerColor → background
        contentColor → default text/icon color

    ---------- MODIFIER ----------

    fillMaxWidth() → most common
    padding() → spacing
    clickable() → make card interactive

    ---------- LAYOUT INSIDE CARD ----------

    Row / Column / Box →
        - Card is just a container
        - Layout must be handled inside

    ---------- COMMON USE CASES ----------

    - Profile cards
    - Product items
    - List items
    - Dashboard UI

    ---------- IMPORTANT NOTES ----------

    - Avoid using parent modifier inside children (use Modifier directly)
    - Keep spacing using Spacer()
    - Use consistent padding (8dp / 12dp / 16dp standard)
    - Card is built on Surface internally

    =====================================================
    */
}