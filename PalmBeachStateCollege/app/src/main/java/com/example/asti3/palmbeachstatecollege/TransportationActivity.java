package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TransportationActivity extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);
        mywebView = (WebView) findViewById(R.id.webView22);
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://www.1800234ride.com/pbsc/lakeworth/index.html");
        mywebView.setWebViewClient(new WebViewClient());
    }


    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack()) {
            mywebView.goBack();
        } else {
            super.onBackPressed();
        }
    }


}


