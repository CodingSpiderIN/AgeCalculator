package `in`.codingspider.agecalculator

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var today_date: EditText
    lateinit var dob: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        today_date = findViewById(R.id.todayDate)
        val sdf = SimpleDateFormat("dd/MM/yyyy")
        today_date.setText(sdf.format(Date()))
        dob = findViewById(R.id.date_of_birth)
        dob.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(
                this,
                { view, year, monthOfYear, dayOfMonth ->
                    val dat = (dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)
                    dob.setText(dat)
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
            datePickerDialog.datePicker.maxDate=System.currentTimeMillis()
        }
    }
}