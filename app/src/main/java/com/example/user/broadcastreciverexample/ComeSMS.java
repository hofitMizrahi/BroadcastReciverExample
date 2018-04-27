package com.example.user.broadcastreciverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class ComeSMS extends BroadcastReceiver {

    // called when recive an action from the broadcast
    @Override
    public void onReceive(Context context, Intent intent) {

        int a = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);

        Toast.makeText(context, String.valueOf(a), Toast.LENGTH_SHORT).show();
    }
}
