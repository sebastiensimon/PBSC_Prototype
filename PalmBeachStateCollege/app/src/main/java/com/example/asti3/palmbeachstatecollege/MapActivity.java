package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapActivity extends AppCompatActivity {
    private WebView mwebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        mwebView = (WebView) findViewById(R.id.webView18);
        String url = "http://www.palmbeachstate.edu/Locations/";


        final WebView mWebView = (WebView) findViewById(R.id.webView18);


        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView.getSettings().setSavePassword(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setSaveFormData(true);
        mWebView.getSettings().setSupportZoom(false);
        mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setSupportMultipleWindows(false);
        mWebView.getSettings().setLightTouchEnabled(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        mWebView.setWebViewClient(new WebViewClient() {

            public boolean shouldOverrideUrlLoading (WebView view, String url){

                return true;
            }
        });
        mWebView.loadUrl("file:///android_asset/Campuses/Campuses.html");

    }
}


