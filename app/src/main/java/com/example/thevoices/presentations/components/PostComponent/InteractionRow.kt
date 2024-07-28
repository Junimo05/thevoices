package com.example.thevoices.presentations.components.PostComponent

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InteractionRow(
    //listInteraction
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = Icons.Default.Favorite, contentDescription = "Loop")
        Text(text = "2k", modifier = Modifier.padding(start = 4.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Icon(imageVector = Icons.Default.Menu, contentDescription = "Heart")
        Text(text = "204", modifier = Modifier.padding(start = 4.dp))
    }
}