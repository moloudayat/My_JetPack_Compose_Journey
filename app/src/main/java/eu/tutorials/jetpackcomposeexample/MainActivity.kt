package eu.tutorials.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import eu.tutorials.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeExampleTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {/*TODO*/ }) {
            Text(text = "Simple Button")
        }

        OutlinedButton(onClick = {/*TODO*/ }) {
            Text("Outlined Button")
        }

        IconButton(onClick = {/*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Face, contentDescription = "icon", tint = Color.Red)
        }

        TextButton(onClick = {/*TODO*/ }) {
            Text("Text Button")
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "icon",
                tint = Color.Red,
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
        }

        Button(onClick = {/*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = "icon", tint = Color.White)
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "ADD")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeExampleTheme {
        MyApp()
    }
}