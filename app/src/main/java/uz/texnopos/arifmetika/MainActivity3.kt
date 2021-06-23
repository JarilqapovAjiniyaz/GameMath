package uz.texnopos.arifmetika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var rightAnswerCount = intent.getIntExtra(MainActivity.RIGHT_ANSWERS_COUNT,0)
        textView5.text = "$rightAnswerCount/${MainActivity.LEVENT_COUNT}"
    }
}