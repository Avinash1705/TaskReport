package com.example.taskreport.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.taskreport.HomeActivity
import com.example.taskreport.R
import com.example.taskreport.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil. setContentView(this,R.layout.activity_login)

        supportActionBar?.title ="Login"
    }
    fun TempLogin(){

    }

    fun FnHome(view: android.view.View) {
        if(binding.etName.text .equals("avi")){
            var intent:Intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("PostName",binding.etName.text)
            startActivity(intent)
        }
        else{
            Toast.makeText(applicationContext, "LOgin went wrong", Toast.LENGTH_SHORT).show()
        }
    }
}