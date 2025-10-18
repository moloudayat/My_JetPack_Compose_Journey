package eu.tutorials.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import eu.tutorials.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                MyApp()
                MyApp2()
                MyApp3()
                MyApp4()
            }
        }
    }
}


@Composable
fun MyApp() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Subscribe", fontSize = 28.sp)
        Text(text = "Please", fontSize = 28.sp)
        Text(text = "Mahdi", fontSize = 28.sp)
    }
}

@Composable
fun MyApp2() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "Subscribe", fontSize = 28.sp)
        Text(text = "Please", fontSize = 28.sp)
        Text(text = "Mahdi", fontSize = 28.sp)
    }
}

@Composable
fun MyApp3() {
    Box(
        modifier = Modifier
            .background(Color.Red)
            .width(300.dp)
            .height(300.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .width(250.dp)
                .height(250.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .width(100.dp)
                    .height(100.dp),
            ) {
                Text(text = "Subscribe", fontSize = 30.sp)
            }
        }
    }
}

@Composable
fun MyApp4() {
    Column {
        Text(
            text = "Subscribe", modifier = Modifier
                .padding(16.dp)
                .background(Color.Cyan)
                .padding(10.dp)
        )
        Box(
            modifier = Modifier
                .padding(50.dp)
                .size(150.dp)
                .rotate(45f)
                .alpha(0.4f)
                .background(Color.Blue)
        ) {}
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeExampleTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            MyApp()
            MyApp2()
            MyApp3()
            MyApp4()
        }
    }
}