package com.mahdi20.singleton;

import android.util.Log;

public class SingletonExample {

    private String TAG = "########";
    private static SingletonExample instance = new SingletonExample();


    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        return instance;
    }


    public void sayHello() {
        Log.i(TAG, "hello");
    }

    public void sayBye() {
        Log.i(TAG, "bye");
    }

}
