package eu.tutorials.jetpackcomposeexample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val context = LocalContext.current
        var textNewValue by remember {
            mutableStateOf("")
        }
        var textNewValue2 by remember {
            mutableStateOf("")
        }

        val keyboardControler = LocalSoftwareKeyboardController.current
        val focusManager = LocalFocusManager.current

        Column(verticalArrangement = Arrangement.spacedBy(25.dp)) {
            TextField(
                value = textNewValue,
                onValueChange = {
                    textNewValue = it
                },
                label = {
                    Text(text = "Enter your Email")
                },
//                maxLines = 2,
                singleLine = true,
                modifier = Modifier.width(280.dp),
                placeholder = { Text(text = "abc@gmail.com") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Email, contentDescription = "email icon")
                },
                trailingIcon = {
                    IconButton(onClick = {
                        Toast.makeText(context, textNewValue, Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(imageVector = Icons.Outlined.Send, contentDescription = "send icon")
                    }
                }
            )
            OutlinedTextField(
                value = textNewValue2,
                onValueChange = { newText ->
                    textNewValue2 = newText
                },
                label = {
                    Text(text = "Enter your Phone")
                },
//                maxLines = 2,
                singleLine = true,
                modifier = Modifier.width(280.dp),
                placeholder = { Text(text = "09123456789") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Phone, contentDescription = "email icon")
                },
                trailingIcon = {
                    IconButton(onClick = {
                        Toast.makeText(context, textNewValue2, Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(imageVector = Icons.Outlined.Send, contentDescription = "send icon")
                    }
                },
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.Characters,
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Send
                ),
                keyboardActions = KeyboardActions(onSend = {
                    keyboardControler?.hide()
                    Toast.makeText(context, "Sent Button Clicked", Toast.LENGTH_SHORT).show()
                    focusManager.clearFocus()
                })
            )

            BasicTextField(
                value = textNewValue, onValueChange = { textNewValue = it },
                modifier = Modifier
                    .width(280.dp)
                    .background((Color.Yellow)),
                enabled = false
            )
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