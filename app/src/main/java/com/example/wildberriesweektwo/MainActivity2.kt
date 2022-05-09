package com.example.wildberriesweektwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "Second activity"
        createAlertDialog()
        Log.d("Live circle", "onCreate Activity 2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Live circle", "onStart Activity 2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Live circle", "onResume Activity 2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Live circle", "onPause Activity 2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Live circle", "onStop Activity 2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Live circle", "onRestart Activity 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Live circle", "onDestroy Activity 2")
    }

    private fun createAlertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Оценка выполнения")
        builder.setMessage("Поставь зачет/незачет приложению")
        builder.setPositiveButton("Зачет"){dialogInterface, i->
            Toast.makeText(this, "УРА! ПОБЕДА!", Toast.LENGTH_LONG).show()
        }
        builder.setNegativeButton("Незачет"){dialogInterface, i->
            Toast.makeText(this, "Грусть, тоска!", Toast.LENGTH_LONG).show()
        }
        builder.show()
    }
}












