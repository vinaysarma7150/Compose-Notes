package com.example.jetpackcomposenotes.components.textComponents

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun TextFieldComponent(modifier: Modifier = Modifier) {

    var name by remember { mutableStateOf("") } // Holds current text state (recomposes on change)

    TextField(
        value = name, // Current text value

        onValueChange = { name = it }, // Updates state when user types

        label = { Text("This is a label") }, // Floating label inside TextField

        placeholder = { Text("This is a placeholder") }, // Hint when text is empty

        leadingIcon = {
            Text(text = "*") // Icon at start
        },

        trailingIcon = {
            Text(text = "#") // Icon at end
        },

        singleLine = true, // Restricts input to single line

        shape = CircleShape, // Shape of TextField (rounded / circle)

        modifier = modifier, // Allows external modification

        enabled = true, // Enables/disables input

        readOnly = false, // If true → user cannot edit but can copy

        isError = false, // Shows error state (red underline etc.)

        maxLines = 1, // Max lines allowed (used when singleLine = false)

        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Blue, // Text color when focused
            unfocusedTextColor = Color.Red, // Text color when not focused
            focusedContainerColor = Color.Yellow, // Background when focused
            unfocusedContainerColor = Color.Green // Background when not focused
        )
    )

    /*
    ===================== TEXTFIELD NOTES =====================

    ---------- STATE ----------

    var text by remember { mutableStateOf("") }

    - remember → stores state across recomposition
    - mutableStateOf → makes value observable
    - when value changes → UI recomposes

    ---------- CORE PROPERTIES ----------

    value → current text

    onValueChange → callback when user types

    label →
        - floating label inside TextField
        - moves up when typing

    placeholder →
        - shown when value is empty
        - disappears when user types

    leadingIcon → icon at start

    trailingIcon → icon at end

    ---------- INPUT CONTROL ----------

    singleLine →
        true → single line input
        false → multi-line input

    maxLines → limits number of lines

    readOnly →
        true → cannot edit (used for display fields)

    enabled →
        false → disables interaction

    isError →
        true → shows error UI (red underline, etc.)

    ---------- SHAPE ----------

    shape →
        RoundedCornerShape(8.dp) → most used
        CircleShape → fully rounded
        CutCornerShape → cut edges

    ---------- COLORS ----------

    TextFieldDefaults.colors()

    Common:
        focusedTextColor
        unfocusedTextColor
        focusedContainerColor
        unfocusedContainerColor
        cursorColor
        focusedIndicatorColor
        unfocusedIndicatorColor

    ---------- MODIFIER ----------

    modifier →
        fillMaxWidth()
        padding()
        height()

    ---------- IMPORTANT NOTES ----------

    - Always hoist state in reusable components (don’t keep inside)
    - Use singleLine = true for forms (name, email, etc.)
    - Use isError for validation UI
    - Avoid heavy logic inside onValueChange
    - Prefer RoundedCornerShape in production (CircleShape is rare)

    ==========================================================
    */
}