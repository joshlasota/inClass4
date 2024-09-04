package com.example.inclass4

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorGroup = findViewById<RadioGroup>(R.id.colorGroup)
        val editText = findViewById<EditText>(R.id.editText)
        val buttonVisibilitySwitch = findViewById<Switch>(R.id.buttonVisibilitySwitch)

        val colorView = findViewById<View>(R.id.colorView)
        val displayText = findViewById<TextView>(R.id.displayText)
        val actionButton = findViewById<Button>(R.id.actionButton)

        // Change Background Color
        colorGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.colorRed -> colorView.setBackgroundColor(Color.RED)
                R.id.colorGreen -> colorView.setBackgroundColor(Color.GREEN)
                R.id.colorBlue -> colorView.setBackgroundColor(Color.BLUE)
            }
        }

        // Change Text
        editText.setOnEditorActionListener { v, _, _ ->
            displayText.text = v.text.toString()
            true
        }

        // Toggle Button Visibility
        buttonVisibilitySwitch.setOnCheckedChangeListener { _, isChecked ->
            actionButton.visibility = if (isChecked) View.VISIBLE else View.GONE
        }
    }
}
