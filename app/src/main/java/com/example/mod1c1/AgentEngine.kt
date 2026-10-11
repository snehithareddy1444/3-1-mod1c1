package com.example.mod1c1

import android.content.Context

class AgentEngine(context: Context) {

    private val classifier = IntentClassifier()

    private val executor = ActionExecutor(context)

    fun process(userInput:String): ResponseModel{

        val detectedIntent = classifier.classify(userInput)

        return executor.execute(detectedIntent)

    }

}