package com.mahdi20.singleton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // use from singleton class
        SingletonExample.getInstance().sayHello()

        SingletonExample.getInstance().sayBye()


    }
}
