package com.example.ei9m5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val welcomeMessage = getString(R.string.welcome_message)
    val buttonSubmitText = getString(R.string.button_submit)
    val errorMessage = getString(R.string.error_message)


    private val numbersList = listOf("one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, "two", 3.0, "four")
    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textViewResult: TextView = findViewById(R.id.textViewResult)
        val buttonFilterNumbers: Button = findViewById(R.id.buttonFilterNumbers)
        val buttonFilterNonNull: Button = findViewById(R.id.buttonFilterNonNull)
        val buttonFilterSort: Button = findViewById(R.id.buttonFilterSort)


        buttonFilterNumbers.setOnClickListener {
            val filteredNumbers = numbersList.filter { it.length > 3 }
            textViewResult.text = "Números filtrados: $filteredNumbers"
        }


        buttonFilterNonNull.setOnClickListener {
            val filteredNonNull = instanceList.filterNotNull()
            textViewResult.text = "Valores no nulos: $filteredNonNull"
        }


        buttonFilterSort.setOnClickListener {
            val sortedList = unsortedList.sorted()
            textViewResult.text = "Lista ordenada: $sortedList"
        }
    }
}
