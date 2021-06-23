package uz.texnopos.arifmetika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
      companion object{
      const val LEVENT_COUNT = 10
      const val RIGHT_ANSWERS_COUNT = "rightAnswersCount"
      }
    private var currentLevelCount = 1
    private var rightAnswers = 0
    private var wrongAnswers = 0
    private var correctAnswer = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer = MyCounter(70000, 1000,)
        timer.start()
        generateQuestion()
        ///
        button1.setOnClickListener {
        if(correctAnswer == button1.text.toString().toInt()){
            rightAnswers++
        }
        else{
            wrongAnswers++
        }
        if(currentLevelCount == LEVENT_COUNT){
        val intent = Intent(this,MainActivity3::class.java)
        intent.putExtra(RIGHT_ANSWERS_COUNT,rightAnswers)
        startActivity(intent)
        }
        else{  generateQuestion()}
        }
        ///
        button2.setOnClickListener {
            if(correctAnswer == button2.text.toString().toInt()){
                rightAnswers++
            }
            else{
                wrongAnswers++
            }
            if(currentLevelCount == LEVENT_COUNT){
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
            else{  generateQuestion()}
        }
        ///
        button3.setOnClickListener {
            if(correctAnswer == button3.text.toString().toInt()){
                rightAnswers++
            }
            else{
                wrongAnswers++
            }
            if(currentLevelCount == LEVENT_COUNT){
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
            else{  generateQuestion()}
        }
        ///
        button4.setOnClickListener {
            if(correctAnswer == button4.text.toString().toInt()){
                rightAnswers++
            }
            else{
                wrongAnswers++
            }
            if(currentLevelCount == LEVENT_COUNT){
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
            else{  generateQuestion()}
        }
        //////////////////////
        }
private fun generateQuestion(){
    val firstList: ArrayList<Int> = arrayListOf(-1, -2, -3, 1, 2)
    val secondList: ArrayList<Int> = arrayListOf(-1, -2, -3, -4, 1)
    firstList.shuffle()
    secondList.shuffle()
    val operations = Random.nextInt(0, 4)
    var type = ""

    var aniqlawshi = 0
    var index = 0
    if (operations == 0) {
        type = "+"
    } else if (operations == 1) {
        type = "-"
    } else if (operations == 2) {
        type = "*"
    }
    if (operations == 3) {
        type = "/"
    }



    textView2.text = Random.nextInt(0, 1000).toString()
    textView1.text = Random.nextInt(0, 1000).toString()
    texView3.text = type
    if (type == "/") {
        textView2.text = Random.nextInt(1, 100).toString()
        textView1.text = (Random.nextInt(1, 10) * textView2.text.toString().toInt()).toString()
    }


    when (type) {
        "+" -> {
            correctAnswer =
                textView1.text.toString().toInt() + textView2.text.toString().toInt()
        }
        "-" -> {
            correctAnswer =
                textView1.text.toString().toInt() - textView2.text.toString().toInt()
        }
        "*" -> {
            correctAnswer =
                textView1.text.toString().toInt() * textView2.text.toString().toInt()
        }
        "/" -> {
            correctAnswer =
                textView1.text.toString().toInt() / textView2.text.toString().toInt()
        }
    }
    val orinButton = Random.nextInt(0, 4)

    // This is comment
    if (correctAnswer >= 0) {
        if (orinButton == 0) {
            index = 5
            button1.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button2.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button3.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button4.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
        }
        //////////////////////////
        else if (orinButton == 1) {
            button2.text = correctAnswer.toString()
            index = 5
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button1.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button3.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button4.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
        }
        //////////////////////////////////
        else if (orinButton == 2) {
            index = 5
            button3.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button1.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button2.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button4.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
        }
        ////////////////
        if (orinButton == 3) {
            index = 5
            button4.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button1.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button2.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button3.text = (firstList[aniqlawshi] + correctAnswer).toString()
            firstList.removeAt(aniqlawshi)
        }
    } else {

        if (orinButton == 0) {
            index = 5
            button1.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button2.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button3.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button4.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
        }
        //////////////////////////
        else if (orinButton == 1) {
            index = 5
            button2.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button1.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button3.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button4.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
        }
        //////////////////////////////////
        else if (orinButton == 2) {
            index = 5
            button3.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button1.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index -= 1
            button2.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index -= 1

            button4.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
        }
        ////////////////
        if (orinButton == 3) {
            index = 5
            button4.text = correctAnswer.toString()
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button1.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)

            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button2.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
            aniqlawshi = Random.nextInt(0, index)
            index = index - 1
            button3.text = (secondList[aniqlawshi] + correctAnswer).toString()
            secondList.removeAt(aniqlawshi)
        }

    }
}





    inner class MyCounter(millisInFuture: Long, countDownInterval: Long) :
        CountDownTimer(millisInFuture, countDownInterval) {
        override fun onFinish() {

            tv.text = "Timer Completed"
        }

        override fun onTick(millisUntilFinished: Long) {
            tv.textSize = 50f
            tv.text = (millisUntilFinished / 1000).toString() + ""

        }


    }
}