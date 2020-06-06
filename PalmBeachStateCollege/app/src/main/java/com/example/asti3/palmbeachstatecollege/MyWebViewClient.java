package com.example.asti3.palmbeachstatecollege;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.content.ContentValues.TAG;

/**
 * Created by asti3 on 12/4/2017.
 */

public class MyWebViewClient  extends WebViewClient {

    public boolean shuldOverrideKeyEvent (WebView view, KeyEvent event) {

        return true;
    }

    public boolean shouldOverrideUrlLoading (WebView view, String url) {
        if (Uri.parse(url).getHost().equals("http://www.palmbeachstate.edu/admissions/default.aspx")) {
            // This is my web site, so do not override; let my WebView load the page
            return false;
        }

        // reject anything other
        return true;
    }
}