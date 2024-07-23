package com.example.thevoices.utils.playback

import java.io.File

interface AudioPlayer {
    fun playFile(file: File)
    fun stopPlaying()
}