package com.example.taskreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.taskreport.model.HomeModel
import com.example.taskreport.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var name:String
   lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
    }
    fun populateData(){
        getFnIntent()
            val arr  =ArrayList<HomeModel>()

//        arr.add(R.drawable.post_task,name,"Post Data")
        arr.add(HomeModel(R.drawable.post_task,name,"Post Task"))
        arr.add(HomeModel(R.drawable.view_task,name,"View Task"))

        //adapter set
    }
    fun getFnIntent(){
       val bundle : Bundle? = intent.extras
         name = bundle?.get("PostName") as String
    }
}