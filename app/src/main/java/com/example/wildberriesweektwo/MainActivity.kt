package com.example.wildberriesweektwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wildberriesweektwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
    комментарии написал во втором приложении
    */
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("Live circle", "onCreate Activity 1")

        with(binding){
            button.setOnClickListener {
                val myIntent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(myIntent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Live circle", "onStart Activity 1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Live circle", "onResume Activity 1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Live circle", "onPause Activity 1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Live circle", "onStop Activity 1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Live circle", "onRestart Activity 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Live circle", "onDestroy Activity 1")
    }
}