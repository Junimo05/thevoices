package com.example.thevoices.presentations.components.PostComponent

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AudioWaveform(
    isPlaying: Boolean,
    duration: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Placeholder for waveform graphic
        Box(modifier = Modifier
            .weight(1f)
            .background(Color.Gray)){
            Text(text = "Waveform", modifier = Modifier.align(Alignment.Center))
        }
        Spacer(modifier = Modifier.width(8.dp))
        Icon(imageVector = Icons.Default.Face, contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = duration, modifier = Modifier.align(Alignment.CenterVertically))
    }
}