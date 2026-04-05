import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComponent(modifier: Modifier = Modifier) {

    Button(
        onClick = {
            // Handle button click
        },

        modifier = modifier
            .fillMaxWidth() // Button takes full width

//            .height(50.dp) // Custom height

        ,

        enabled = true, // Enable/disable button

        shape = RoundedCornerShape(8.dp), // Button shape

        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue, // Background color
            contentColor = Color.White // Text/Icon color
        ),

        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp, // Normal elevation
            pressedElevation = 8.dp // Elevation when pressed
        )
    ) {

        Text(
            text = "Click Me" // Button text
        )

//        Icon(Icons.Default.Favorite, contentDescription = null) // Optional icon

//        Spacer(modifier = Modifier.width(8.dp)) // Space between icon & text

//        Text("Like") // Text with icon
    }

    /*
    ===================== BUTTON NOTES =====================

    Button →
        - Used for user actions (click events)
        - Comes from Material3

    ---------- CORE PROPERTIES ----------

    onClick → action when button is clicked

    enabled →
        true → clickable
        false → disabled (faded UI)

    ---------- CONTENT ----------

    Button content is a composable block:
        - Text
        - Icon
        - Row (for complex layouts)

    ---------- MODIFIER ----------

    fillMaxWidth() → most used
    height() → custom height
    padding() → outer spacing

    ---------- SHAPE ----------

    RoundedCornerShape(8.dp) → standard
    CircleShape → round button

    ---------- COLORS ----------

    ButtonDefaults.buttonColors()

    containerColor → background color
    contentColor → text/icon color

    ---------- ELEVATION ----------

    buttonElevation()

    defaultElevation → normal
    pressedElevation → when pressed

    ---------- COMMON PATTERN ----------

    Icon + Text:

        Row {
            Icon(...)
            Spacer(Modifier.width(8.dp))
            Text(...)
        }

    ---------- OTHER BUTTON TYPES ----------

    OutlinedButton → border only

    TextButton → no background (minimal)

    ElevatedButton → higher elevation

    FilledTonalButton → lighter filled button

    ---------- IMPORTANT NOTES ----------

    - Keep onClick lightweight
    - Use enabled = false for validation states
    - Prefer consistent shapes across app
    - Use icons for better UX

    =======================================================
    */
}