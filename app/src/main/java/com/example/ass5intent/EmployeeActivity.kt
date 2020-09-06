package com.example.ass5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_employee.*

class EmployeeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("keySendData")
        Text_Employee_Name.text = "Employee Name : ${newEmployee?.Name}"
        Text_Gender.text = "Gender : ${newEmployee?.Gender}"
        Text_Email.text = "E-Mail : ${newEmployee?.Email}"
        Text_Salary.text = "Salary : ${newEmployee?.Salary}"

    }

    fun ExitPageEmployee(view:View){
        finish()
    }
}
