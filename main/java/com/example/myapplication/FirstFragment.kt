package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstFragment : AppCompatActivity() {

    var turn = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)

        val teksts = findViewById<TextView>(R.id.textview_first)
        val gameMode = intent.getIntExtra("gamemode", 0)
        val i = Intent(FirstFragment@this, SecondFragment::class.java)
        i.putExtra("gamemode", gameMode)


        if (gameMode == 0) {
            val teksts = findViewById<TextView>(R.id.textview_first)
            teksts.text = "Input player name"
        } else if (gameMode == 1) {
            if (turn == 0) {
                val teksts = findViewById<TextView>(R.id.textview_first)
                teksts.text = "Input first player name"
            }
        }

        val next = findViewById<Button>(R.id.button_first)
        next.setOnClickListener() {
            if (gameMode == 0) {

                val editName = findViewById<EditText>(R.id.editTextTextPersonName)
                var p1name = editName.text.toString()
                var p2name = "PC"

                i.putExtra("p1name", p1name.toString())
                i.putExtra("p2name", p2name.toString())
                startActivity(i)

            } else if (gameMode == 1) {
                if (turn == 0) {
                    val teksts = findViewById<TextView>(R.id.textview_first)
                    val editName = findViewById<EditText>(R.id.editTextTextPersonName)
                    var p1name = editName.text.toString()

                    i.putExtra("p1name", p1name.toString())
                    teksts.text = "Input second player name"
                    editName.setText("")
                    turn++
                } else {
                    val editName = findViewById<EditText>(R.id.editTextTextPersonName)
                    var p2name = editName.text.toString()

                    i.putExtra("p2name", p2name.toString())
                    teksts.text = "Input second player name"
                    startActivity(i)
                }
            }
        }
    }
}