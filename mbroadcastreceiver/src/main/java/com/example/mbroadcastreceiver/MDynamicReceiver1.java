package com.example.mbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MDynamicReceiver1 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "MDynamicReceiver1收到："+intent.getStringExtra("msg").toString(), Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
