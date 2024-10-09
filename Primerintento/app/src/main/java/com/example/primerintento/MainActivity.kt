 package com.example.primerintento
 import android.widget.Toast
import android.os.Bundle
 import android.widget.Button
 import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
  import android.widget.EditText
 import com.google.android.material.textfield.TextInputEditText


 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val inputText = findViewById<TextInputEditText>(R.id.inputName)
        val btnSend = findViewById<Button>(R.id.button)

        btnSend.setOnClickListener {
            val text = inputText.text.toString()
            val message = modelo.createMessage(text)
            showMessage(message)
        }

    }
     fun showMessage(message: String) {
         Toast.makeText(this, message, Toast.LENGTH_LONG).show()
     }
}