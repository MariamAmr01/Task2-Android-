package com.mariam.secondapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editname: EditText
    lateinit var editmail: EditText
    lateinit var editpass: EditText
    lateinit var tosignin: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editname= findViewById(R.id.edit_name)
        editmail=findViewById(R.id.edit_mail)
        editpass= findViewById(R.id.edit_pass)
        button= findViewById(R.id.btn_signup)
        tosignin=findViewById(R.id.text_to_signin)

        var userName = editname.text
        var email = editmail.text
        var password = editpass.text

        button.setOnClickListener {

            if(userName.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty())
            {
                val newActivity= Intent (this, SecondActivity::class.java)
                startActivity(newActivity)
            }
            else
            {
                Toast.makeText(this,"Please fill in all information", Toast.LENGTH_SHORT).show()
            }

        }
        tosignin.setOnClickListener{
            val signIn = Intent (this, SignIn::class.java)
            startActivity(signIn)

        }

    }
}