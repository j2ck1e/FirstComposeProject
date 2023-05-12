package com.example.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeproject.ui.theme.InstagramProfileCard


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {
                Column(
                        modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colors.background)
                ) {
                    InstagramProfileCard()
                }

            }
        }
    }
}

@Preview
@Composable
fun TestImage() {
    Box(
            modifier = Modifier
                    .size(200.dp)
                    .background(Color.Cyan)
    ) {
        Image(painter = ColorPainter(Color.Yellow),
                modifier = Modifier
//        .fillMaxSize(),

                .background(Color.Green)
                .padding(25.dp)
                .size(100.dp)
                        .clip(CircleShape)
                .background(Color.Red)
                .padding(25.dp)
                ,


                contentDescription = "",
                contentScale = ContentScale.FillWidth)
    }
}



