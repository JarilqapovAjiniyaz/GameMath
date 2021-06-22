package uz.texnopos.arifmetika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val List : ArrayList<Int> = arrayListOf(-1,-2,-3,1,2)
        val List1 : ArrayList<Int> = arrayListOf(-1,-2,-3,-4,1)
        List.shuffle()
        List1.shuffle()
        val ameller = Random.nextInt(0,4)
        var tipi = ""
        var durisJuwap = 0
        var aniqlawshi = 0
        var index = 0
        if(ameller == 0){
        tipi = "+"
        }
        else if(ameller == 1){
            tipi = "-"
        }
        else if(ameller == 2){
            tipi = "*"
        }
        if(ameller == 3){
            tipi = "/"
        }



        textView2.text = Random.nextInt(0,1000).toString()
        textView1.text = Random.nextInt(0,1000).toString()
        texView3.text = tipi
        if(tipi.equals("/")){
            textView2.text = Random.nextInt(1,100).toString()
            textView1.text = (Random.nextInt(1,10) * textView2.text.toString().toInt()).toString()
        }


        if(tipi == "+"){
        durisJuwap = textView1.text.toString().toInt() + textView2.text.toString().toInt()
        }
        else  if(tipi == "-"){
            durisJuwap = textView1.text.toString().toInt() - textView2.text.toString().toInt()
        }
        else  if(tipi == "*"){
            durisJuwap = textView1.text.toString().toInt() * textView2.text.toString().toInt()
        }
        else  if(tipi == "/"){
            durisJuwap = textView1.text.toString().toInt() / textView2.text.toString().toInt()
        }
        val orinButton = Random.nextInt(0,4)
        
        //////////////////////////////////
        if(durisJuwap >= 0 ) {
            if (orinButton == 0) {
                index = 5
                button1.text = durisJuwap.toString()
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button2.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)

                aniqlawshi = Random.nextInt(0, index)
                index -= 1
                button3.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button4.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
            }
            //////////////////////////
            else if (orinButton == 1) {
                button2.text = durisJuwap.toString()
                index = 5
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button1.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)

                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button3.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button4.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
            }
            //////////////////////////////////
            else if (orinButton == 2) {
                index = 5
                button3.text = durisJuwap.toString()
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button1.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)

                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button2.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button4.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
            }
            ////////////////
            if (orinButton == 3) {
                index = 5
                button4.text = durisJuwap.toString()
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button1.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)

                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button2.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
                aniqlawshi = Random.nextInt(0, index)
                index = index - 1
                button3.text = (List[aniqlawshi] + durisJuwap).toString()
                List.removeAt(aniqlawshi)
            }
        }
        else {

                if (orinButton == 0) {
                    index = 5
                    button1.text = durisJuwap.toString()
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button2.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)

                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button3.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button4.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                }
                //////////////////////////
                else if (orinButton == 1) {
                    index = 5
                    button2.text = durisJuwap.toString()
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button1.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)

                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button3.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button4.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                }
                //////////////////////////////////
                else if (orinButton == 2) {
                    index = 5
                    button3.text = durisJuwap.toString()
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button1.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)

                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button2.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1

                    button4.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                }
                ////////////////
                if (orinButton == 3) {
                    index = 5
                    button4.text = durisJuwap.toString()
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button1.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)

                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button2.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                    aniqlawshi = Random.nextInt(0, index)
                    index = index - 1
                    button3.text = (List1[aniqlawshi] + durisJuwap).toString()
                    List1.removeAt(aniqlawshi)
                }

        }
        button1.setOnClickListener {
        if(button1.text.equals(durisJuwap.toString())){
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
        else{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        }

        button2.setOnClickListener {
            if(button2.text.equals(durisJuwap.toString())){
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)

            }
            else{
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
        }
        button3.setOnClickListener {
            if(button3.text.equals(durisJuwap.toString())){
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)

            }
            else{
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
        }
        button4.setOnClickListener {
            if(button4.text.equals(durisJuwap.toString())){
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)

            }
            else{
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
            }
        }
        button5.setOnClickListener {

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        }

    }
}