package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var gameMode = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext,"Tic tac toe greets you", Toast.LENGTH_SHORT).show()

        val pvebtn = findViewById<Button>(R.id.pve_btn)
        pvebtn.setOnClickListener() {
            var intent = Intent(MainActivity@this, FirstFragment::class.java)
            gameMode = 0
            intent.putExtra("gamemode", gameMode)
            startActivity(intent)
        }
        val pvpbtn = findViewById<Button>(R.id.pvp_btn)
        pvpbtn.setOnClickListener() {
            var intent = Intent(this@MainActivity, FirstFragment::class.java)
            gameMode = 1
            intent.putExtra("gamemode", gameMode)
            startActivity(intent)
        }
    }
}