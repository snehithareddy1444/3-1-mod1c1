package com.example.mod1c1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var output: TextView

    private lateinit var agent: AgentEngine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editMessage)
        button = findViewById(R.id.btnSend)
        output = findViewById(R.id.txtOutput)

        agent = AgentEngine(this)

        button.setOnClickListener {

            val input = editText.text.toString()

            if(input.isNotEmpty()){

                val response = agent.process(input)

                output.text =
                    "Intent : ${response.intent}\n\nResponse : ${response.message}"

                editText.text.clear()

            }else{

                output.text = "Please enter a message."

            }

        }

    }
}