package com.example.thevoices.presentations.View

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.thevoices.utils.playback.AndroidAudioPlayer
import com.example.thevoices.utils.record.AndroidAudioRecorder
import java.io.File

@Composable
fun RecordScreen(
    navController: NavController,
    context: Context

){
    val recorder by lazy {
        AndroidAudioRecorder(context = context)
    }
    val player by lazy{
        AndroidAudioPlayer(context = context)
    }
    var audioFile: File? = null


}