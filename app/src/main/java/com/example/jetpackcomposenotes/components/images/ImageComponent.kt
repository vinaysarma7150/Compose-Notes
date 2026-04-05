import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposenotes.R

@Preview(showBackground = true)
@Composable
fun ImageComponent(modifier: Modifier = Modifier) {

    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground), // Loads image from drawable

        contentDescription = "Sample Image", // Used for accessibility (important)

        modifier = modifier
            .size(120.dp) // Sets width & height
            .clip(RoundedCornerShape(12.dp)), // Clips image shape

        contentScale = ContentScale.Crop, // Scales image

        alignment = Alignment.Center // Alignment inside bounds

//        alpha = 0.8f // Controls transparency (0f - 1f)

//        colorFilter = ColorFilter.tint(Color.Red) // Applies tint color
    )

    /*
    ===================== IMAGE NOTES =====================

    Image →
        - Used to display images
        - Supports drawable, bitmap, network (via libraries)

    ---------- IMAGE SOURCES ----------

    painterResource(R.drawable.image) → from drawable

    rememberAsyncImagePainter(url) → from network (Coil library)

    BitmapPainter → from bitmap

    ---------- CORE PROPERTIES ----------

    painter → image source

    contentDescription →
        - for accessibility (screen readers)
        - use null if decorative

    ---------- SIZE & SHAPE ----------

    size() → sets width & height

    width() / height() → control individually

    clip() → shape of image
        RoundedCornerShape(12.dp)
        CircleShape

    ---------- CONTENT SCALE ----------

    ContentScale.Crop → fills and crops (most used)

    ContentScale.Fit → fits inside bounds (may leave empty space)

    ContentScale.FillBounds → stretches to fill

    ContentScale.Inside → keeps original size

    ---------- ALIGNMENT ----------

    alignment →
        Alignment.Center (default)
        Alignment.TopStart
        Alignment.BottomEnd

    ---------- EXTRA ----------

    alpha → transparency (0f to 1f)

    colorFilter → tint color

    ---------- IMPORTANT NOTES ----------

    - Always provide contentDescription (accessibility)
    - Use Crop for profile images / thumbnails
    - Use Fit when full image visibility is required
    - For network images → use Coil (AsyncImage)

    ======================================================
    */
}