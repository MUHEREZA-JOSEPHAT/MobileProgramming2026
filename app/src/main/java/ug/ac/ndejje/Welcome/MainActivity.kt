package ug.ac.ndejje.Welcome
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ug.ac.ndejje.Welcome.ui.theme.NdejjeWelcomeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NdejjeWelcomeAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    StudentInfo()
                }

            }
        }
    }
}

@Composable
fun StudentInfo(){
    Box(
        modifier = Modifier
            .height(30.dp)
            .fillMaxWidth()
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(

                    topStart = 2.dp,
                    topEnd = 2.dp,

                )
            )
    )
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

            Image(painter = painterResource(id = R.drawable.mellisa9),
                modifier = Modifier
                    .size(70.dp)
                    .border(2.dp, Color.Gray, RoundedCornerShape(80.dp))
                    .clip(RoundedCornerShape(60.dp)),
                contentScale = ContentScale.Crop,
                contentDescription = "my image")

        Text(
            text = "Mellisa Nandyowa",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Bachelor Of Information Technology",
                    style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.tertiary
        )

            Row() {
                Text(text = "REG NO.:",
                    fontWeight = FontWeight.ExtraBold,
                    style = MaterialTheme.typography.labelLarge

                )
                Text(text = " 24/2/314/D/683",
                    style = MaterialTheme.typography.bodyLarge,
                    fontFamily = FontFamily.Monospace

                )
            }
        Image(painter = painterResource(id = R.drawable.barcode),
            contentDescription = "The barcode")

    }
}

@Preview(showBackground = true)
@Composable
fun NdejjePreview(){
    NdejjeWelcomeAppTheme{
        StudentInfo()
    }
}
