package eu.tutorials.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import eu.tutorials.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApp()
        }
    }
}

@Composable
fun FirstApp() {
    Surface(
        modifier = Modifier
            .height(250.dp)
            .width(250.dp)
            .padding(16.dp),
        shape = CutCornerShape(18.dp),
        color = Color.Green,
        border= BorderStroke(2.dp, color = Color.Red),
        shadowElevation = 8.dp
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Subscribe Please", fontSize = 32.sp, modifier=Modifier.padding(10.dp))
            Test1()
            Test2()
        }
    }
}

@Composable
fun Test1() {
    Text(text = "test1", fontSize = 32.sp)
}

@Composable
fun Test2() {
    Text(text = "test2", fontSize = 32.sp)
}

@Preview(showBackground = true, name = "android geek")
@Composable
fun AppPreview() {
    JetPackComposeExampleTheme {
        FirstApp()
    }
}