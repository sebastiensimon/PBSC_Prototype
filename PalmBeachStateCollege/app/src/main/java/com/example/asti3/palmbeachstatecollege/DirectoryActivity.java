package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DirectoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);

        String url = "http://www.palmbeachstate.edu/pf/Default.aspx";


        final WebView mWebView = (WebView) findViewById(R.id.webView7);
        WebView web = (WebView) findViewById(R.id.webView7);
        web.loadUrl(url);


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


            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                return true;
            }
        });
        mWebView.loadUrl("http://www.palmbeachstate.edu/pf/Default.aspx");


    }



}











