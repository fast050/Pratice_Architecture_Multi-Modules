package com.praticeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mylibrary.model.ModelProject
import com.praticeproject.ui.theme.PraticeProjectTheme
import org.koin.android.ext.android.inject
import org.koin.androidx.compose.getViewModel
import org.koin.java.KoinJavaComponent.inject

class MainActivity : ComponentActivity() {
    private val viewModel by inject<ViewModelProject>()

    val s = ModelProject("adsf")

    override fun onCreate(savedInstanceState: Bundle?) {
        viewModel.getData()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PraticeProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = viewModel.text.collectAsState().value,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello ${name}!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PraticeProjectTheme {
        Greeting("Android")
    }
}