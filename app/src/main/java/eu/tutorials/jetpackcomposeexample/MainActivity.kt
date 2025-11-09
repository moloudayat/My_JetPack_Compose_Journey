package eu.tutorials.jetpackcomposeexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var count = remember {
        mutableStateOf(0)
    }

    var anotherCount by remember {
        mutableStateOf(0)
    }

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState) // ✅ Make it scrollable
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

        Button(
            onClick = {/*TODO*/ },
            shape = RoundedCornerShape(topStart = 8.dp, bottomEnd = 8.dp)
        ) {
            Text(text = "Rounded Corner Button")
        }

        Button(
            onClick = {/*TODO*/ },
            shape = CutCornerShape(topEnd = 8.dp, bottomStart = 28.dp)
        ) {
            Text(text = "Cut Corner Button")
        }

        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.size(100.dp),
            shape = CircleShape
        ) {
            Text(text = "Circle Button")
        }

        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.size(60.dp),
            shape = CircleShape
        ) {
            Icon(
                imageVector = Icons.Filled.Add, contentDescription = "icon", tint = Color.White,
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
        }

        Button(
            onClick = {/*TODO*/ },
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 6.dp
            ),
            shape = CutCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xfffedbd0),
                contentColor = Color.Gray
            ),
            border = BorderStroke(1.dp, color = Color(0xFFA2645F))
        ) {
            Text(text = "Simple Button")
        }

        Spacer(modifier = Modifier.size(25.dp))
        Button(onClick = {
            count.value++
            Log.d("Count", "${count.value}")
        }) {
            Text(text = "count = ${count.value}")
        }
        Text(text = "count = ${count.value}")

        Spacer(modifier = Modifier.size(25.dp))
        Button(onClick = {
            anotherCount++
            Log.d("Another Count", "${anotherCount}")
        }) {
            Text(text = "Another Count = ${anotherCount}")
        }
        Text(text = "Another Count = ${anotherCount}")


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeExampleTheme {
        MyApp()
    }
}