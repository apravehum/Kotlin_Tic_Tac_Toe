package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.Button

class SecondFragment : AppCompatActivity() {

    var turn = 0
    var playerturn = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_second)

        var array = arrayOf (
            findViewById<Button>(R.id.btn1),
            findViewById<Button>(R.id.btn2),
            findViewById<Button>(R.id.btn3),
            findViewById<Button>(R.id.btn4),
            findViewById<Button>(R.id.btn5),
            findViewById<Button>(R.id.btn6),
            findViewById<Button>(R.id.btn7),
            findViewById<Button>(R.id.btn8),
            findViewById<Button>(R.id.btn9),
        )
        reset(array)


        var p1name = intent.getStringExtra("p1name").toString()
        var p2name = intent.getStringExtra("p2name").toString()
        val gameMode = intent.getIntExtra("gamemode", 0)

        val textViewP1 = findViewById<TextView>(R.id.textView4)
        val textViewP2 = findViewById<TextView>(R.id.textView5)
        val textViewInfo = findViewById<TextView>(R.id.textView7)
        textViewP1.text = p1name
        textViewP2.text = p2name
        textViewInfo.text = "Begin!"

        val reset = findViewById<Button>(R.id.button17)
        reset.setOnClickListener() {
            textViewInfo.text = "$p1name's turn"
            reset(array)
        }
        val playagain = findViewById<Button>(R.id.button18)
        playagain.setOnClickListener() {
            val i = Intent(SecondFragment@this, MainActivity::class.java)
            startActivity(i)
        }
    }

    fun click(view: View) {
        val textViewInfo = findViewById<TextView>(R.id.textView7)
        val textViewP1 = findViewById<TextView>(R.id.textView4).text
        val textViewP2 = findViewById<TextView>(R.id.textView5).text

        var array = arrayOf (
            findViewById<Button>(R.id.btn1),
            findViewById<Button>(R.id.btn2),
            findViewById<Button>(R.id.btn3),
            findViewById<Button>(R.id.btn4),
            findViewById<Button>(R.id.btn5),
            findViewById<Button>(R.id.btn6),
            findViewById<Button>(R.id.btn7),
            findViewById<Button>(R.id.btn8),
            findViewById<Button>(R.id.btn9),
        )

        var btn = view as Button
        var gameMode = intent.getIntExtra("gamemode", 0)
        if (gameMode == 1) {
            if (playerturn) {
                textViewInfo.text = "$textViewP1's turn"
                when(btn.id){
                    R.id.btn1 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn2 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn3 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn4 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn5 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn6 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn7 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn8 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                    R.id.btn9 -> if (btn.text.toString() == "") {
                        btn.text = "X"
                        playerturn = !playerturn
                    }
                }
            } else {
                textViewInfo.text = "$textViewP2's turn"
                when(btn.id){
                    R.id.btn1 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn2 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn3 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn4 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn5 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn6 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn7 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn8 -> if (btn.text.toString() == "") {
                        btn.text = "O"
                        playerturn = !playerturn
                    }
                    R.id.btn9 -> if (btn.text.toString() == "") {
                        btn.text = "o"
                        playerturn = !playerturn
                    }
                }
            }
            var flag = false
            for (b in array) {
                if (b.text.toString() == "") {
                    flag = true
                }
            }
            if (!flag) {
                disable(array, 2)
            }
        } else {
            textViewInfo.text = "$textViewP1's turn"
            playerturn = true
            when(btn.id){
                R.id.btn1 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn2 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn3 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn4 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn5 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn6 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn7 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn8 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
                R.id.btn9 -> if (btn.text.toString() == "") {
                    btn.text = "X"
                    playerturn = !playerturn
                }
            }
            if (playerturn) {
                playerturn = !playerturn
                return
            }
            var flag = false
            for (b in array) {
                if (b.text.toString() == "") {
                    flag = true
                }
            }
            while (flag) {
                val rnd = (0..8).random()
                var count = 0
                for (b in array) {
                    Log.i("---------", "$count, $rnd")
                    if (count == rnd && b.text.toString() == "") {
                        b.text = "O"
                        flag = false
                        break
                    }
                    count++
                }
                if (!flag) {
                    flag = true
                    break
                }
            }
            if (!flag) {
                (disable(array, 2))
                return
            }
        }

        if (array[0].text.toString() == "1" && array[1].text.toString() == "1" && array[2].text.toString() == "1") {
            disable(array, 0)
        } else if (array[3].text.toString() == "1" && array[4].text.toString() == "1" && array[5].text.toString() == "1") {
            disable(array, 0)
        } else if (array[6].text.toString() == "1" && array[7].text.toString() == "1" && array[8].text.toString() == "1") {
            disable(array, 0)
        } else if (array[0].text.toString() == "1" && array[3].text.toString() == "1" && array[6].text.toString() == "1") {
            disable(array, 0)
        } else if (array[1].text.toString() == "1" && array[4].text.toString() == "1" && array[7].text.toString() == "1") {
            disable(array, 0)
        } else if (array[2].text.toString() == "1" && array[5].text.toString() == "1" && array[8].text.toString() == "1") {
            disable(array, 0)
        } else if (array[0].text.toString() == "1" && array[4].text.toString() == "1" && array[8].text.toString() == "1") {
            disable(array, 0)
        } else if (array[6].text.toString() == "1" && array[4].text.toString() == "1" && array[2].text.toString() == "1") {
            disable(array, 0)
        } else if (array[0].text.toString() == "2" && array[1].text.toString() == "2" && array[2].text.toString() == "2") {
            disable(array, 1)
        } else if (array[3].text.toString() == "2" && array[4].text.toString() == "2" && array[5].text.toString() == "2") {
            disable(array, 1)
        } else if (array[6].text.toString() == "2" && array[7].text.toString() == "2" && array[8].text.toString() == "2") {
            disable(array, 1)
        } else if (array[0].text.toString() == "2" && array[3].text.toString() == "2" && array[6].text.toString() == "2") {
            disable(array, 1)
        } else if (array[1].text.toString() == "2" && array[4].text.toString() == "2" && array[7].text.toString() == "2") {
            disable(array, 1)
        } else if (array[2].text.toString() == "2" && array[5].text.toString() == "2" && array[8].text.toString() == "2") {
            disable(array, 1)
        } else if (array[0].text.toString() == "2" && array[4].text.toString() == "2" && array[8].text.toString() == "2") {
            disable(array, 1)
        } else if (array[6].text.toString() == "2" && array[4].text.toString() == "2" && array[2].text.toString() == "2") {
            disable(array, 1)
        }
    }

    fun reset(array: Array<Button>) {
        turn = 0
        for (b in array) {
            b.isClickable = true
            b.text = ""
        }
    }

    fun disable(array: Array<Button>, winner: Int) {
        if (winner == 0) {
            val textViewInfo = findViewById<TextView>(R.id.textView7)
            val textViewP1 = findViewById<TextView>(R.id.textView4).text
            textViewInfo.text = "$textViewP1 won!!!"
            playerturn = true
        } else  if (winner == 1){
            val textViewInfo = findViewById<TextView>(R.id.textView7)
            val textViewP2 = findViewById<TextView>(R.id.textView5).text
            textViewInfo.text = "$textViewP2 won!!!"
            playerturn = true
        } else {
            val textViewInfo = findViewById<TextView>(R.id.textView7)
            textViewInfo.text = "DRAW"
            playerturn = true
        }
        for (b in array) {
            b.isClickable = false
        }
    }
}