package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoxTutorActivity extends AppCompatActivity {
    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lox_tutor);
        mwebView = (WebView) findViewById(R.id.webView17);
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebView.loadUrl("https://loxahatchee.mywconline.com/");
        mwebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (mwebView.canGoBack()) {
            mwebView.goBack();
        } else {
            super.onBackPressed();
        }
    }


}




