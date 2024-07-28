package com.example.thevoices.presentations.components.PostComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
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
fun PostDetail() {
    /*...*/
}

@Composable
fun ProfileDetail(

){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
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
        Text(text = "Luca Morrison", fontWeight = FontWeight.Bold)
        Text(text = "My story of moving to Japan", color = Color.Gray)

        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Follow")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Message")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileDetailPreview() {
    ProfileDetail()
}