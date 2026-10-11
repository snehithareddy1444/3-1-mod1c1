package com.example.mod1c1

class IntentClassifier {

    fun classify(text: String): String {

        val input = text.lowercase().trim()

        return when {

            input.contains("hello") ||
                    input.contains("hi") ||
                    input.contains("good morning") ||
                    input.contains("hey") -> "GREETING"

            input.contains("google") ->
                "OPEN_GOOGLE"

            input.contains("camera") ->
                "OPEN_CAMERA"

            input.contains("settings") ->
                "OPEN_SETTINGS"

            input.contains("ai") ->
                "AI_INFO"

            input.contains("kotlin") ->
                "KOTLIN_INFO"

            input.contains("bye") ||
                    input.contains("exit") ->
                "EXIT"

            else ->
                "UNKNOWN"
        }
    }
}