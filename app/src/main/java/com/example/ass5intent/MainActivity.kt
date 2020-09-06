package com.example.ass5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Send_DATA.setOnClickListener {
            checkSeLectGender()
            onClickShowDetailToPageEmployeeAc()
        }



    }
// onClickShowDetailToPageEmployeeAc
    private fun checkSeLectGender(): CharSequence? {
        val selectID = RadioGroup_Gender.checkedRadioButtonId
        val selectValue = findViewById<RadioButton>(selectID).text
    return selectValue
    }

    fun onClickShowDetailToPageEmployeeAc() {
        var non:String = ""
        val intent = Intent(this,  EmployeeActivity::class.java)
        var putExtra = intent.putExtra(
            "keySendData",
            Employee(
                Edt_Name.text.toString(),
                checkSeLectGender() as String,
                Edt_Email.text.toString(),
                Edt_Salary.text.toString().toInt()
            )
        )

        startActivity(intent)
    }



    fun ResetForm(v: View){
        Edt_Name.text.clear()
        Edt_Email.text.clear()
        Edt_Salary.text.clear()
        RadioGroup_Gender.clearCheck()
    }


}
