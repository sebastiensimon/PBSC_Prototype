package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PantherwebActivity extends AppCompatActivity {
    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantherweb);
        mwebView = (WebView) findViewById(R.id.webView21);
        String url = "https://www.palmbeachstate.edu/pantherweb/";


        final WebView mWebView = (WebView) findViewById(R.id.webView21);


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

            @Override
            public void onPageFinished(WebView view, String url) {
                mWebView.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('header home_header')[0].style.display='none'; " +
                        "document.getElementsByClassName('glyphicon glyphicon-menu-hamburger')[0].style.display='none'; " +
                        "document.getElementsByClassName('searchBottomLinks_index searchBottomLinks_internal')[0].style.display='none'; " +
                        "document.getElementsByClassName('list-unstyled list-inline')[0].style.display='none'; " +
                        "document.getElementsByClassName('row')[0].style.display='none'; "+
                        "document.getElementsByClassName('header home_header')[0].style.display='none'; " +
                        "document.getElementsById('header-inner')[0].style.display='none'; " +
                        "document.getElementsById('fixed-header')[0].style.display='none'; " +
                        "document.getElementsByClassName('collapse navbar-collapse')[0].style.display='none'; " +
                        "document.getElementsByClassName('navbar navbar-inverse sidebars')[0].style.display='none'; " +
                        "document.getElementsByClassName('footer')[0].style.display='none'; " +
                        "document.getElementsByClassName('footer2')[0].style.display='none'; " +
                        "document.getElementsByClassName('container')[0].style.display='none'; " +
                        "document.getElementsByClassName('acad-slider')[0].style.display='none'; " +



                        "})()");
            }
        });
        mWebView.loadUrl("file:///android_asset/Pantherweb/pantherweb.html");

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

//My goal is trying to remove some HTML elements in my application and I have some issues when trying to process it
// When I run it take a couple seconds to remove the elements
//Litz Sebastien Simon


