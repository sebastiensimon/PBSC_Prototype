package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        String url = "https://www.facebook.com/PalmBeachStateCollege";
        WebView web = (WebView) findViewById(R.id.webView10);
        web.loadUrl(url);

        final WebView mWebView = (WebView) findViewById(R.id.webView10);
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
        mWebView.setWebViewClient(new WebViewClient()

        {
            @Override
            public void onPageFinished(WebView view, String url) {
                mWebView.loadUrl("javascript:(function() { " +


                        "document.getElementById('catapult-cookie-bar').style.display='none'; " +


                        "})()");
            }
        });
        mWebView.loadUrl("https://www.facebook.com/PalmBeachStateCollege");

    }

        }
