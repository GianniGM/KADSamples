package com.example.giannig.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IdRes
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val textView by bind<TextView>(R.id.text_hello_kotlin)

    //Functions can have generic parameters which are specified
    // using angle brackets before the function name
    @Suppress("UNCHECKED_CAST")
    private fun <T : View>  bind(@IdRes res: Int): Lazy<T> {
        return lazy { findViewById(res) as T }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setText(getString(R.string.welcome_string))
    }

    fun setText(str: String){
        textView.text = "hello $str"
    }
}
