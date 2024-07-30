package com.example.thevoices.presentations.components.PostComponent

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thevoices.R

@Composable
fun AudioWaveform(
    isPlaying: Boolean,
    duration: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Placeholder for waveform graphic
        // Todo: Button to play/pause audio
        Icon(
            painter = painterResource(id = R.drawable.ic_media_play),
            contentDescription = "Play"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier
            .weight(1f)
            .background(Color.Gray)){
            Text(text = "Waveform", modifier = Modifier.align(Alignment.Center))
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = duration, modifier = Modifier.align(Alignment.CenterVertically))
    }
}

@Preview(showBackground = true)
@Composable
fun AudioWaveformPreview() {
    AudioWaveform(isPlaying = true, duration = "4:12")
}