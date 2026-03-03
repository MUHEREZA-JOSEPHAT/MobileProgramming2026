package ug.ac.ndejje.Welcome
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
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

    }
}

@Preview(showBackground = true)
@Composable
fun NdejjePreview(){
    NdejjeWelcomeAppTheme{
        StudentInfo()
    }
}
