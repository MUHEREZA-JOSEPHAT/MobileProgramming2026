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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
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
import androidx.compose.ui.res.stringResource
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
                    StudentIdCard()

            }
        }
    }
}

@Composable
fun StudentInfo(){
    val profileImage = painterResource(R.drawable.muhereza)
    val logoImage = painterResource(R.drawable.ndejje_image)

    Column(modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box {
            Image(painter = profileImage, contentDescription = "student_logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(RoundedCornerShape(percent = 10))

            )

            Image(painter = logoImage, contentDescription = "logo", modifier = Modifier
                .size(80.dp)
                .align(Alignment.BottomEnd)
                .padding(4.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = stringResource(R.string.studnet_name),
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = stringResource(R.string.programme),
                    style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.tertiary
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 20.dp
                                )

        )
            Row() {
                Text(text = stringResource(R.string.reg_nunmber),
                    fontWeight = FontWeight.ExtraBold,
                    style = MaterialTheme.typography.labelLarge

                )
                Text(text = stringResource(R.string.regno),
                    style = MaterialTheme.typography.bodyLarge,
                    fontFamily = FontFamily.Monospace

                )
            }


    }
}

@Composable
fun StudentIdCard(){


    ElevatedCard(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        shape = RoundedCornerShape(size = 16.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
        ),

    ) {
        StudentInfo()
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun NdejjePreview(){
    NdejjeWelcomeAppTheme{
        StudentIdCard()
    }
}
