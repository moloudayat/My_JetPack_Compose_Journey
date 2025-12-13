package eu.tutorials.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

                    StylingTextField()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StylingTextField() {
    Box(
        Modifier.fillMaxSize().background(Color.White).padding(top = 40.dp),
        contentAlignment = Alignment.Center
    ) {
        var textState by remember { mutableStateOf("") }
    val myColor = Color(0xFFFF0000)
        TextField(value = textState, onValueChange = { textState = it },
            modifier = Modifier.padding(top = 20.dp),
            label = { Text(text = "your name") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
//                    tint = Color.Green
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.Send,
                    contentDescription = null
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = myColor.copy(0.5f),
                focusedIndicatorColor = Color.Red,
                cursorColor = myColor,
                focusedLabelColor = myColor,
                unfocusedLabelColor = myColor,
                focusedLeadingIconColor = myColor,
                unfocusedLeadingIconColor = myColor.copy(0.8f),
                focusedTrailingIconColor = myColor,
                unfocusedTrailingIconColor = myColor,
                unfocusedTextColor = myColor,
                focusedTextColor = myColor,
                containerColor = myColor.copy(0.2f)
//                containerColor = Color.Transparent
            ),
//            shape = RoundedCornerShape(25.dp)
//            shape = CutCornerShape(15.dp)
            shape = CutCornerShape(topStart = 15.dp, topEnd =15.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeExampleTheme {
        StylingTextField()
    }
}