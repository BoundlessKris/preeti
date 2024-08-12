package com.example.cal_2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var Num1: EditText?=null
    private var Num2:EditText?=null
    private var add: Button?=null
    private var sub:Button?=null
    private var mul:Button?=null
    private var div:Button?=null
    private var mod:Button?=null
    private var result: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Num1=findViewById<View>(R.id.number1) as EditText
        Num2=findViewById<View>(R.id.number2) as EditText
        add=findViewById<View>(R.id.btn_add) as Button
        sub=findViewById<View>(R.id.btn_sub) as Button
        mul=findViewById<View>(R.id.btn_mul) as Button
        div=findViewById<View>(R.id.btn_div) as Button
        mod=findViewById<View>(R.id.btn_mod) as Button
        result=findViewById<View>(R.id.resultview) as TextView

        add!!.setOnClickListener {
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val sum:Int
            sum = n1+n2
            result!!.text = "$sum"
        }
        sub!!.setOnClickListener {
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val subs:Int
            subs = n1-n2
            result!!.text = "$subs"
        }

        mul!!.setOnClickListener {
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val mult:Int
            mult = n1*n2
            result!!.text = "$mult"
        }

        div!!.setOnClickListener {
            val n1=Num1!!.text.toString().toFloat()
            val n2=Num2!!.text.toString().toFloat()
            val divis:Float
            divis = n1/n2
            result!!.text = "$divis"
        }
        mod!!.setOnClickListener {
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val modulas:Int
            modulas=n1%n2
            result!!.text="$modulas"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}