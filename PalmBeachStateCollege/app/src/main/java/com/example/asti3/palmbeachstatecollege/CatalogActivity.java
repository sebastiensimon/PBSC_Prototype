package com.example.asti3.palmbeachstatecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CatalogActivity extends AppCompatActivity {
    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        mwebView = (WebView) findViewById(R.id.webView6);
        String url = "https://www.palmbeachstate.edu/catalog/current/search.aspx";


        final WebView mWebView = (WebView) findViewById(R.id.webView6);


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
        mWebView.setWebViewClient(new WebViewClient(){
        @Override
        public void onPageFinished(WebView view, String url) {
            mWebView.loadUrl("javascript:(function() { " +

                    "document.getElementsByClassName('header_wrapper')[0].style.display='none'; " +
                    "document.getElementsByClassName('footer-contact')[0].style.display='none'; " +
                    "document.getElementsByClassName('navbar-header')[0].style.display='none'; " +
                    "document.getElementsByClassName('footer-social')[0].style.display='none'; " +
                    "document.getElementById('footer_bottom').style.display='none'; " +
                    "document.getElementById('footer_content').style.display='none'; " +
                    "document.getElementById('core_mobile_menu').style.display='none'; " +
                    "document.getElementById('catapult-cookie-bar').style.display='none'; " +


                    "})()");
        }
    });
        mWebView.loadUrl("https://www.palmbeachstate.edu/catalog/current/search.aspx");

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
