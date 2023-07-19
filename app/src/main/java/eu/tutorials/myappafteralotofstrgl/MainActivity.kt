package eu.tutorials.myappafteralotofstrgl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btn)
        val img:ImageView = findViewById(R.id.imageView)

        btn.setOnClickListener {
            var randomNo = (1..6).random()
            var imageView: Int
            if ( randomNo == 1){
                imageView = R.drawable.dice1
            }
            else if (randomNo==2){
                imageView=R.drawable.dice2
            }
            else if (randomNo == 3){
                imageView=R.drawable.diec3
            }
            else if (randomNo == 4){
                imageView=R.drawable.dice4
            }
            else if (randomNo ==5) {
                imageView = R.drawable.dice5
            }
            else{
                imageView = R.drawable.dice6
            }
            img.setImageResource(imageView)
            Toast.makeText(this,"Rolled!!",Toast.LENGTH_SHORT).show()
        }


    }
}