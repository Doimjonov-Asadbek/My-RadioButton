package app.test.myradiobutton

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rg = findViewById<RadioGroup>(R.id.rg)
        rg.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.black -> window.decorView.setBackgroundColor(Color.parseColor("#FF000000"))
                R.id.red -> window.decorView.setBackgroundColor(Color.parseColor("#FF0000"))
                R.id.yellow -> window.decorView.setBackgroundColor(Color.parseColor("#FFF203"))
            }
        })

    }
}