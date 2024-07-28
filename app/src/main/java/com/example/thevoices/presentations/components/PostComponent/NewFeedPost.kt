package com.example.thevoices.presentations.components.PostComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thevoices.R

@Composable
fun ProfileNewFeed(

) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
    {
        ProfileInfo()
        Spacer(modifier = Modifier.width(16.dp))
        AudioWaveform(duration = "4:12", isPlaying = true)
        Spacer(modifier = Modifier.height(8.dp))
        InteractionRow()
    }
}


@Composable
fun ProfileInfo(

){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.person),
            contentDescription = "Avatar",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Black, CircleShape)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Column {
            Text(text = "Luca Morrison", fontWeight = FontWeight.Bold)
            Text(text = "My story of moving to Japan", color = Color.Gray)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileNewFeedPreview() {
    ProfileNewFeed()
}