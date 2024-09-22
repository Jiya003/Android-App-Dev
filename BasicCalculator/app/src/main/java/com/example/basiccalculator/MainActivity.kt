package com.example.basiccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccalculator.ui.theme.BasicCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        val input1:EditText=findViewById(R.id.input1)
        val input2:EditText=findViewById(R.id.input2)
        var resView:TextView=findViewById(R.id.textView)

        val addButton:Button=findViewById(R.id.button)
        val subButton:Button=findViewById(R.id.button2)
        val mulButton:Button=findViewById(R.id.button3)
        val divButton:Button=findViewById(R.id.button4)

        addButton.setOnClickListener{
            val num1=input1.text.toString().toDoubleOrNull()
            val num2=input2.text.toString().toDoubleOrNull()

            if(num1!=null && num2!=null){
                var result=num1+num2
                resView.text="Result: $result"
            }else{
                resView.text="Can't Add"
            }
        }

        subButton.setOnClickListener{
            val num1=input1.text.toString().toDoubleOrNull()
            val num2=input2.text.toString().toDoubleOrNull()

            if(num1!=null && num2!=null){
                var result=num1-num2
                resView.text="Result: $result"
            }else{
                resView.text="Can't Sub"
            }
        }

        mulButton.setOnClickListener{
            val num1=input1.text.toString().toDoubleOrNull()
            val num2=input2.text.toString().toDoubleOrNull()

            if(num1!=null && num2!=null){
                var result=num1*num2
                resView.text="Result: $result"
            }else{
                resView.text="Can't Multiply"
            }
        }

        divButton.setOnClickListener{
            val num1=input1.text.toString().toDoubleOrNull()
            val num2=input2.text.toString().toDoubleOrNull()

            if(num1!=null && num2!=null){
                if(num2!=0.0) {
                    var result = num1 / num2
                    resView.text = "Result: $result"
                }else{
                    resView.text="Divisor can't be zero"
                }
            }else{
                resView.text="Can't Divide"
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicCalculatorTheme {
        Greeting("Android")
    }
}
*/
