package com.nalek0.notifications

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.nalek0.notifications.ui.theme.NotificationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
private fun App() {
    NotificationsTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopBar() },
        ) { innerPadding ->
            Content(Modifier.padding(innerPadding))
        }
    }
}

@Preview(widthDp = 500)
@Composable
fun TopBar() {
    Box(Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.primary)) {
        Text(
            text = "Notifications",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 38.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun Content(modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier.align(Alignment.Center)) {
            Button(
                onClick = { },
            ) {
                Text(text = "Show notification")
            }
        }
    }
}

@Preview(widthDp = 500, heightDp = 700, showBackground = true)
@Composable
private fun ContentPreview() {
    Content(Modifier)
}
