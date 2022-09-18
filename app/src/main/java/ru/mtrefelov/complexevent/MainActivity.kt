package ru.mtrefelov.complexevent

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val textView: TextView = findViewById(R.id.textView)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        findViewById<Button>(R.id.button_save).setOnClickListener {
            if (checkBox.isChecked) {
                textView.text = editText.text
                progressBar.incrementProgressBy(10)
            }
        }
    }
}