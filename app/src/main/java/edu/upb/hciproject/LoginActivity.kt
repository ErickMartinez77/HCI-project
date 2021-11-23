package edu.upb.hciproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity()  {
    //private lateinit var binding: ActivityLoginBinding
    lateinit var editTextEmail : TextView;
    lateinit var editTextPassword : TextView;
    lateinit var btLogin : View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //binding = ActivityLoginBinding.inflate(LayoutInflater,ViewGroup?,false)
        //setContentView(binding.root)

        supportActionBar?.hide()

        btLogin = findViewById(R.id.btLogin)
        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)

        btLogin.setOnClickListener{validate()}
        //btLogin.setOnClickListener{
        //    val correo = editTextEmail.text.toString()
        //    val pass = editTextPassword.text.toString()
        //    if (correo == "e@gmail.com" && pass =="123"){
        //        //val intent = Intent(this, LoginActivity::class.java)
        //        //startActivity(intent)
        //        //finish()
        //        Toast.makeText(this,"Exito", Toast.LENGTH_SHORT).show()
        //    } else{
        //        Toast.makeText(this,"NICOOOOOOP", Toast.LENGTH_SHORT).show()
        //    }
        //}
    }

    private fun validate(){
        val result = arrayOf(validateEmail(),validatePassword())

        if (false in result){
            return
        }

        val correo = editTextEmail.text.toString()
        val pass = editTextPassword.text.toString()
        if (correo == "e@gmail.com" && pass =="123"){
            //val intent = Intent(this, LoginActivity::class.java)
            //startActivity(intent)
            //finish()
            Toast.makeText(this,"Exito", Toast.LENGTH_SHORT).show()
        } else{
            Toast.makeText(this,"NICOOOOOOP", Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateEmail():Boolean {
        val email = editTextEmail.text.toString()
        return if (email.isEmpty()){
            editTextEmail.error = "No puede estar vacio"
            false
        } else if(!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.error = "Ingresa un correo valido"
            false
        } else {
            editTextEmail.error = null
            true
        }
    }

    private fun validatePassword():Boolean{
        val password = editTextPassword.text.toString()
        val passwordRegex = Pattern.compile(
            "^" +
                    "(?=.*[0-9])"+
                    "(?=.*[a-z])"+
                    "(?=.*[A-Z])"+
                    "(?=.*[@#$%^&+=])"+
                    "(?=\\S+$)"+
                    ".{4,}"+
                    "$"
        )
        return if (password.isEmpty()) {
            editTextPassword.error = "No puede estar vacio"
            false
        } //else if (!passwordRegex.matcher(password).matches()){
          //  editTextPassword.error = "Pasword es debil"
          //  false
         else {
            editTextPassword.error = null
            true
        }
        //develop
    }
}