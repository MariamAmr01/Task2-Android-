package com.mariam.secondapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignIn : AppCompatActivity() {

    lateinit var editname2: EditText
    lateinit var editpass2: EditText
    lateinit var button2 : Button
    lateinit var tosignup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        editname2= findViewById(R.id.edit_name1)
        editpass2= findViewById(R.id.edit_pass1)
        button2= findViewById(R.id.btn_signin)
        tosignup=findViewById(R.id.text_to_signup)


        var userName2 = editname2.text
        var password2 = editpass2.text

        button2.setOnClickListener {

            if(userName2.isNotEmpty() && password2.isNotEmpty())
            {
                val newActivity1= Intent (this, AfterSignIn::class.java)
                startActivity(newActivity1)
            }
            else
            {
                Toast.makeText(this,"Please fill in all information", Toast.LENGTH_SHORT).show()
            }

        }
        tosignup.setOnClickListener{
            val signUp = Intent (this, MainActivity::class.java)
            startActivity(signUp)

        }

    }
}