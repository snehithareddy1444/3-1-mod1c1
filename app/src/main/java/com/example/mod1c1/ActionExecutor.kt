package com.example.mod1c1

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.provider.MediaStore

class ActionExecutor(private val context: Context) {

    fun execute(intentName: String): ResponseModel {

        return when(intentName){

            "GREETING" -> {

                ResponseModel(
                    "GREETING",
                    "Hello 👋\nHow can I assist you today?"
                )
            }

            "OPEN_GOOGLE" -> {

                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com")
                )

                context.startActivity(intent)

                ResponseModel(
                    "OPEN_GOOGLE",
                    "Opening Google..."
                )
            }

            "OPEN_CAMERA" -> {

                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

                if(cameraIntent.resolveActivity(context.packageManager)!=null){

                    context.startActivity(cameraIntent)
                }

                ResponseModel(
                    "OPEN_CAMERA",
                    "Opening Camera..."
                )
            }

            "OPEN_SETTINGS" -> {

                val settingsIntent = Intent(Settings.ACTION_SETTINGS)

                context.startActivity(settingsIntent)

                ResponseModel(
                    "OPEN_SETTINGS",
                    "Opening Settings..."
                )
            }

            "AI_INFO" -> {

                ResponseModel(
                    "AI_INFO",
                    "Artificial Intelligence (AI) enables machines to perform tasks that normally require human intelligence such as learning, reasoning, and decision making."
                )
            }

            "KOTLIN_INFO" -> {

                ResponseModel(
                    "KOTLIN_INFO",
                    "Kotlin is Google's officially recommended programming language for Android application development."
                )
            }

            "EXIT" -> {

                ResponseModel(
                    "EXIT",
                    "Goodbye 👋 Have a great day!"
                )
            }

            else -> {

                ResponseModel(
                    "UNKNOWN",
                    "Sorry, I didn't understand your request."
                )
            }
        }

    }
}