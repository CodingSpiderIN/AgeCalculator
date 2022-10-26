package `in`.codingspider.agecalculator

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var today_date: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        today_date = findViewById(R.id.todayDate)

        val sdf = SimpleDateFormat("dd/MM/yyyy")




        today_date.setText ( sdf.format(Date()))

    }
}