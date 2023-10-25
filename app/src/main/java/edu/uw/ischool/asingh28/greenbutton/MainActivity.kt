package edu.uw.ischool.asingh28.greenbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click = findViewById<Button>(R.id.button1)

        click.setOnClickListener {
            pushCount++
            click.text = "You have pushed me $pushCount time${if (pushCount == 1) "" else "s"}!"
        }
    }
}
