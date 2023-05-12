package com.example.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeproject.R


@Composable
fun InstagramProfileCard() {
    Card(
            modifier = Modifier.padding(8.dp),
            backgroundColor = MaterialTheme.colors.background,
            shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
            border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Column(Modifier.padding(16.dp)) {
        Row(
                modifier = Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                    modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .padding(2.dp),
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = ""
            )
            UserStatistic(title = "Posts", value = "6,950")
            UserStatistic(title = "Followers", value = "436M")
            UserStatistic(title = "Following", value = "76")
        }


            Text(text = "Instagram", fontFamily = FontFamily.Cursive, fontSize = 32.sp)
            Text(text = "#YoursToMake", fontSize = 14.sp)
            Text(text = "www.facebook.com/emotional_heals", fontSize = 14.sp)
            Button(onClick = {}) {
                Text(text = "Follow")
            }

        }
    }
}


@Composable
private fun UserStatistic(
        title: String,
        value: String,
) {
    Column(
            modifier = Modifier
                    .height(80.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
                text = value,
                fontFamily = FontFamily.Cursive,
                fontSize = 24.sp

        )
        Text(
                text = title,
                fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewThemeLight() {
    FirstComposeProjectTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewThemeDark() {
    FirstComposeProjectTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}