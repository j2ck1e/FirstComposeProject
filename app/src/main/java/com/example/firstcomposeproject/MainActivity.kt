package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfo(name = "j2ck1e", age = 37)
        }
    }
}

@Preview
@Composable
fun UserInfoPreview() {
    UserInfo(name = "j2ck1e", age = 37)
}

@Composable
fun UserInfo(name: String, age: Int) {
    Column {
        repeat(10) { Text("Hello $name, you are $age years old") }

    }
}
