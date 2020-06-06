package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PalmBeachGardentTutorActivity extends AppCompatActivity {
    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palm_beach_gardent_tutor);

        mwebView = (WebView) findViewById(R.id.webView20);
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebView.loadUrl("https://pbs.mywconline.com/");
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










