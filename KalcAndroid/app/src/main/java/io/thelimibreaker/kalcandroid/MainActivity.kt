package io.thelimibreaker.kalcandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.thelimitbreaker.kparser.ExpressionParser

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val parser = ExpressionParser()

    }
}
