package com.example.localbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class Airplanemodeon extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(isairplanemode(context.getApplicationContext())){
            Toast.makeText(context,"AirPlaneModeisOn",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context,"AirPlaneModeisOff",Toast.LENGTH_SHORT).show();

        }
    }

    private boolean isairplanemode(Context applicationContext) {
    return Settings.System.getInt(applicationContext.getContentResolver(),Settings.Global.AIRPLANE_MODE_ON,0)!=0;
    }


}
