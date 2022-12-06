package com.ezenwoke.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var tvOne = findViewById<TextView>(R.id.tvOne)
        var tvTwo = findViewById<TextView>(R.id.tvTwo)
        var tvThree = findViewById<TextView>(R.id.tvThree)
        var tvFour= findViewById<TextView>(R.id.tvFour)
        var tvFive = findViewById<TextView>(R.id.tvFive)
        var tvSix = findViewById<TextView>(R.id.tvSix)
        var tvSeven = findViewById<TextView>(R.id.tvSeven)
        var tvEight = findViewById<TextView>(R.id.tvEight)
        var tvNine = findViewById<TextView>(R.id.tvNine)
        var tvZero = findViewById<TextView>(R.id.tvZero)
        var tvPlus = findViewById<TextView>(R.id.tvPlus)
        var tvMinus = findViewById<TextView>(R.id.tvMinus)
        var tvMul = findViewById<TextView>(R.id.tvMul)
        var tvDivide = findViewById<TextView>(R.id.tvDivide)
        var tvDot = findViewById<TextView>(R.id.tvDot)
        var tvBack = findViewById<TextView>(R.id.tvBack)
        var tvEquals = findViewById<TextView>(R.id.tvEquals)
        var tvExpression = findViewById<TextView>(R.id.tvExpression)
        var tvClear = findViewById<TextView>(R.id.tvClear)
        var tvResult = findViewById<TextView>(R.id.tvResult)*/


        /*Number Buttons*/
        tvOne.setOnClickListener {
            evaluateExpression("1", clear = true)
        }

        tvTwo.setOnClickListener {
            evaluateExpression("2", clear = true)
        }

        tvThree.setOnClickListener {
            evaluateExpression("3", clear = true)
        }
        tvFour.setOnClickListener {
            evaluateExpression("4", clear = true)
        }

        tvFive.setOnClickListener {
            evaluateExpression("5", clear = true)
        }

        tvSix.setOnClickListener {
            evaluateExpression("6", clear = true)
        }

        tvSeven.setOnClickListener {
            evaluateExpression("7", clear = true)
        }

        tvEight.setOnClickListener {
            evaluateExpression("8", clear = true)
        }

        tvNine.setOnClickListener {
            evaluateExpression("9", clear = true)
        }

        tvZero.setOnClickListener {
            evaluateExpression("0", clear = true)
        }

        /*Operators*/

        tvPlus.setOnClickListener {
            evaluateExpression("+", clear = true)
        }

        tvMinus.setOnClickListener {
            evaluateExpression("-", clear = true)
        }

        tvMul.setOnClickListener {
            evaluateExpression("*", clear = true)
        }

        tvDivide.setOnClickListener {
            evaluateExpression("/", clear = true)
        }

        tvDot.setOnClickListener {
            evaluateExpression(".", clear = true)
        }

        tvClear.setOnClickListener {
            tvExpression.text = ""
            tvResult.text = ""
        }

        tvEquals.setOnClickListener {
            val text = tvExpression.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                tvResult.text = longResult.toString()
            } else {
                tvResult.text = result.toString()
            }
        }

        tvBack.setOnClickListener {
            val text = tvExpression.text.toString()
            if(text.isNotEmpty()) {
                tvExpression.text = text.drop(1)
            }

            tvResult.text = ""
        }
    }

    /*Function to calculate the expressions using expression builder library*/


    fun evaluateExpression(string: String, clear: Boolean) {
        var expression:Expression
        if(clear) {
            tvResult.text = ""
            tvExpression.append(string)
        } else {
            tvExpression .append(tvResult.text)
            tvExpression.append(string)
            tvResult.text = ""
        }
    }
}

