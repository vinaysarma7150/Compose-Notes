package com.example.jetpackcomposenotes.components.textComponents

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldComponent(modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") } // Holds input state

    OutlinedTextField(
        value = text, // Current value

        onValueChange = { text = it }, // Updates value on typing

        label = { Text("Label") }, // Floating label

        placeholder = { Text("Enter text") }, // Hint text

        leadingIcon = {
            Text("*") // Start icon
        },

        trailingIcon = {
            Text("#") // End icon
        },

        singleLine = true, // Single line input

        modifier = modifier, // External modifier support

        enabled = true, // Enable/disable field

        readOnly = false, // Read-only mode

        isError = false, // Error state UI

        shape = RoundedCornerShape(8.dp), // Most commonly used shape

        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.Blue, // Text color when focused
            unfocusedTextColor = Color.Black, // Text color when unfocused
            focusedBorderColor = Color.Blue, // Border when focused
            unfocusedBorderColor = Color.Gray // Border when unfocused
        )
    )

    /*
    ================= OUTLINED TEXTFIELD NOTES =================

    ---------- DIFFERENCE FROM TextField ----------

    TextField →
        - Filled background style
        - Has container color

    OutlinedTextField →
        - Border-based style
        - No filled background (clean UI)
        - MOST USED in forms

    ---------- CORE PROPERTIES ----------

    value → current text

    onValueChange → called when user types

    label → floating label

    placeholder → hint when empty

    leadingIcon / trailingIcon → icons

    ---------- INPUT CONTROL ----------

    singleLine →
        true → single line
        false → multi-line

    readOnly →
        true → cannot edit

    enabled →
        false → disables field

    isError →
        true → shows error UI (red border)

    ---------- SHAPE ----------

    RoundedCornerShape(8.dp) → standard in production

    ---------- COLORS ----------

    OutlinedTextFieldDefaults.colors()

    Common:
        focusedTextColor
        unfocusedTextColor
        focusedBorderColor
        unfocusedBorderColor
        cursorColor
        errorBorderColor

    ---------- MODIFIER ----------

    fillMaxWidth() → most used
    padding() → spacing

    ---------- IMPORTANT NOTES ----------

    - Always hoist state in reusable components
    - OutlinedTextField is preferred in forms (login, signup)
    - Use isError for validation feedback
    - Keep UI simple, avoid heavy logic in onValueChange

    ===========================================================
    */
}