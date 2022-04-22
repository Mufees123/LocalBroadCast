package com.example.localbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Airplanemodeon a= new Airplanemodeon();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          
    }



    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter i = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(a,i);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(a);
    }
}