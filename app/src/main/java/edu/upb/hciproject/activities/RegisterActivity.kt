package edu.upb.hciproject.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import edu.upb.hciproject.R
import java.util.regex.Pattern

class RegisterActivity : AppCompatActivity()  {
    //private lateinit var binding: ActivityLoginBinding
    lateinit var editTextEmail : TextView;
    lateinit var editTextPassword : TextView;
    lateinit var editTextCellphone : TextView
    lateinit var btRegister : View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        //binding = ActivityLoginBinding.inflate(LayoutInflater,ViewGroup?,false)
        //setContentView(binding.root)

        supportActionBar?.hide()

        btRegister = findViewById(R.id.btRegister)
        editTextEmail = findViewById(R.id.email)
        editTextCellphone = findViewById(R.id.cellphone)
        editTextPassword = findViewById(R.id.password)

        btRegister.setOnClickListener{goToLogin()}
    }

    private fun goToLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        Toast.makeText(this,"Datos guardados correctamente", Toast.LENGTH_SHORT).show()
        finish()
    }

    private fun validate(){
        val result = arrayOf(validateEmail(),validatePassword())

        if (false in result){
            return
        }

        val correo = editTextEmail.text.toString()
        val pass = editTextPassword.text.toString()
        if (correo == "e@gmail.com" && pass =="123"){
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
            finish()
            //Toast.makeText(this,"Exito", Toast.LENGTH_SHORT).show()
        } else{
            Toast.makeText(this,"Correo o password incorrectos", Toast.LENGTH_SHORT).show()
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