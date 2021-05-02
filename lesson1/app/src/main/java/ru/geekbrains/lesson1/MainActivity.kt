package ru.geekbrains.lesson1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<View>(R.id.textView1) as TextView

        val button = findViewById<View>(R.id.buttonTwo)

        val DataClass = DataClass("DataClass", 1)
        val Object = DataClass.copy(string = "DataClassCopy", number = 2)

        button.setOnClickListener{
            textView1.text = "${Object.string} ${Object.number}" + " " + "${DataClass.string} ${DataClass.number}"
        }

    }

    fun oneButton(view: View) {
        val button = Toast.makeText(this, "Посмотрите в консоль", Toast.LENGTH_SHORT)
        button.show()
        forEach()
        range()
        rangeReverse()
        rangeReverseWithStep()
    }

    private fun forEach() {
        val arrayList = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (i in arrayList) {
            Log.d("Цикл forEach", i.toString())
        }
    }

    private fun range() {
        for (i in 1..50) {
            Log.d("Диапазон", i.toString())
        }
    }

    private fun rangeReverse() {
        for (i in 100 downTo 50) {
            Log.d("Обратный диапазон", i.toString())
        }
    }


    @SuppressLint("LongLogTag")
    private fun rangeReverseWithStep() {
        for (i in 50 downTo 0 step 5) {
            Log.d("Обратный диапазон с шагом", i.toString())
        }
    }
}
