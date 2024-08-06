package com.example.thevoices.presentations.components.PostComponent

import android.content.Context
import android.widget.Space
import androidx.compose.foundation.Canvas
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import androidx.media3.exoplayer.ExoPlayer
import com.example.thevoices.R
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import kotlin.random.Random

@Composable
fun AudioWaveform(
    //exoPlayer: ExoPlayer,
    percentPlayed: Float,
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
        val random = Random
        val barCount = 100
        val barHeights = List(barCount) { random.nextFloat() }

        val playedColor = Color.Green
//        val notPlayedColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.medium)
        val notPlayedColor = Color.Gray

        // Todo: Button to play/pause audio
        Icon(
            painter = painterResource(id = R.drawable.ic_media_play),
            contentDescription = "Play"
        )
        Spacer(modifier = Modifier.width(8.dp))


        Canvas(modifier = Modifier.fillMaxWidth().height(50.dp)) {
            val barWidth = size.width / barCount // Decrease the width of each bar
            // Remove space between bars

            for (i in barHeights.indices) {
                val barHeight = barHeights[i] * size.height / 2f
                val barTop = size.height / 2f - barHeight
                val barBottom = size.height / 2f + barHeight
                val barLeft = i * barWidth
                val barRight = barLeft + barWidth

                val isBarPlayed = i <= barCount * percentPlayed
                val barColor = if (isBarPlayed) playedColor else notPlayedColor

                // Draw upflip
                drawRect(
                    color = barColor,
                    topLeft = Offset(x = barLeft, y = barTop),
                    size = Size(width = barWidth, height = barHeight)
                )

                // Draw downflip
                drawRect(
                    color = barColor,
                    topLeft = Offset(x = barLeft, y = size.height / 2f),
                    size = Size(width = barWidth, height = barHeight)
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = duration, modifier = Modifier.align(Alignment.CenterVertically))
    }
}

fun saveWaveform(context: Context, audioId: String, barHeights: List<Float>) {
    val sharedPreferences = context.getSharedPreferences("waveforms", Context.MODE_PRIVATE)
    val gson = Gson()
    val json = gson.toJson(barHeights)
    sharedPreferences.edit {
        putString(audioId, json)
    }
}

fun loadWaveform(context: Context, audioId: String): List<Float>? {
    val sharedPreferences = context.getSharedPreferences("waveforms", Context.MODE_PRIVATE)
    val gson = Gson()
    val json = sharedPreferences.getString(audioId, null) ?: return null
    val type = object : TypeToken<List<Float>>() {}.type
    return gson.fromJson(json, type)
}

@Preview(showBackground = true)
@Composable
fun AudioWaveformPreview() {
    AudioWaveform(isPlaying = true, duration = "4:12", percentPlayed = 0.5f)
}