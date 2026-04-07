package com.example.jetpackcomposenotes.ui.scenes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier, onClick :() -> Unit  = {}) {
    var userName by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    Column(
        modifier = modifier.fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login here", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier.height(16.dp))
        OutlinedTextField(
            value = userName,
            onValueChange = {userName = it},
            label = { Text("Username", color = Color.Black)},
            modifier = modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Black,
            )
        )
        Spacer(modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("Password", color = Color.Black) },
            modifier = modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Black,
            )

        )
        Spacer(modifier.height(12.dp))

        Button(onClick = { onClick() },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 12.dp,
                pressedElevation = 16.dp
            ),
            enabled = userName.isNotEmpty() && password.isNotEmpty()
        ) {
            Text(text = "LOGIN")
        }

    }
}