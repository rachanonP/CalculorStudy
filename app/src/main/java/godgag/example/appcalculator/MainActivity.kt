package godgag.example.appcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initial()
    }

    private fun initial() {
        num1.addTextChangedListener(editTextOnChangeListener)
        num2.addTextChangedListener(editTextOnChangeListener)
    }

    val editTextOnChangeListener = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            onCalculatorPlus()
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

    }

    private fun onCalculatorPlus() {
        val numberFirst = num1.text.toString()
        val numberSecond = num2.text.toString()
        if (!numberFirst.isEmpty() && !numberSecond.isEmpty()) {
            val result = numberFirst.toInt() + numberSecond.toInt()
            resultCalculator.text = result.toString()
        }
    }


}
