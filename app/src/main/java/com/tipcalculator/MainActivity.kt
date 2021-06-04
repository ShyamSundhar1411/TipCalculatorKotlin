package com.tipcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        infoTextView.visibility = View.INVISIBLE
        Calculate.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipper = tipEditText.text.toString().toDouble()
            val tip = bill * (tipper/100)
            val total = bill+tip
            infoTextView.visibility = View.VISIBLE
            val result = "Tip : ${formatdeci(tip)} Total : ${formatdeci(total)}"
            infoTextView.text = result
        }
    }
    fun formatdeci(n1 : Double): String {
        return "\$"+String.format("%.2f",n1)
    }
}