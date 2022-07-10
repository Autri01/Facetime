package com.example.facetime.models;

import android.webkit.JavascriptInterface;

import com.example.facetime.activities.CallActivity;

public class InterfaceJava {

    CallActivity callActivity;

    public  InterfaceJava(CallActivity callActivity){
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void  onPeerConnected(){
        callActivity.onPeerConnected();
    }
}
