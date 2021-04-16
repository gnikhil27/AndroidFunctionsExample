package nik.iant.functionsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun Factorial(num1: Int) :Int
    {
        if(num1 < 2)
            return 1
        else
            return num1 * Factorial(num1-1)
    }
    fun getValue(): Int {
        val myTxt= findViewById<EditText>(R.id.txtNum)
        var i :Int = 0
        try {
            i = myTxt.text.toString()?.toIntOrNull()!!
        }catch (ex : Exception) {
            Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
        }
        return i
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            var ans = findViewById<TextView>(R.id.txtAns)
            var but1 = findViewById<Button>(R.id.button)
            but1.setOnClickListener {
                val i = getValue()
                Toast.makeText(this,"{$i}", Toast.LENGTH_LONG).show()
                ans.setText(Factorial(i).toString())

            }
        }
        catch (ex: java.lang.Exception)
        {
            Toast.makeText(this,"Error: "+ex.message, Toast.LENGTH_LONG).show()
        }
    }
}