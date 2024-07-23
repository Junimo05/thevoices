package com.example.thevoices.utils.record

import java.io.File


interface AudioRecorder {
    fun startRecording(outputFile: File)
    fun stopRecording()
}