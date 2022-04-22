package com.example.localbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Vibrator;
import  android.os.VibrationEffect;
import android.widget.Toast;

public class Screenon extends BroadcastReceiver {
    @Override

    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "SCREEN_ON", Toast.LENGTH_SHORT).show();
    }
}
