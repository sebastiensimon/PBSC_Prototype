package com.example.asti3.palmbeachstatecollege;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BlackboardActivity extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackboard);
        mywebView = (WebView) findViewById(R.id.webView4);
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://play.google.com/store/apps/details?id=com.blackboard.android.bbstudent&hl=en");
    }
}


