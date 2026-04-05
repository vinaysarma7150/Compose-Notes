import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun IconComponent(modifier: Modifier = Modifier) {

    Icon(
        imageVector = Icons.Default.Favorite, // Built-in material icon

        contentDescription = "Favorite Icon", // Accessibility description

        modifier = modifier
            .size(40.dp) // Size of the icon
//            .clickable { } // Make icon clickable (very common)
        ,

        tint = Color.Red // Icon color (tint)
    )

    /*
    ===================== ICON NOTES =====================

    Icon →
        - Used to display vector icons
        - Lightweight compared to Image

    ---------- ICON SOURCES ----------

    Icons.Default.* →
        - Built-in Material icons
        Example:
            Icons.Default.Favorite
            Icons.Default.Home
            Icons.Default.Settings

    Icons.Filled / Outlined / Rounded →
        - Different styles of icons

    painterResource(R.drawable.icon) →
        - Custom drawable icon

    ---------- CORE PROPERTIES ----------

    imageVector → for vector icons (most used)

    painter → for drawable icons

    contentDescription →
        - for accessibility
        - use null if decorative

    ---------- MODIFIER ----------

    size() → controls icon size

    padding() → spacing around icon

    clickable() → makes icon interactive

    ---------- TINT ----------

    tint →
        - applies color to icon
        - default = LocalContentColor

    tint = Color.Unspecified →
        - keeps original icon color

    ---------- IMPORTANT NOTES ----------

    - Icon is just a wrapper over Image (optimized for vectors)
    - Use Icon for UI icons, Image for photos
    - Always provide contentDescription for accessibility
    - Use clickable() for actions (buttons, toolbar icons)

    =====================================================
    */
}