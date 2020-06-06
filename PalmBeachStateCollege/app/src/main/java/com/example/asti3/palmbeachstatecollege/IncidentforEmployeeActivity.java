package com.example.asti3.palmbeachstatecollege;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.io.File;


public class IncidentforEmployeeActivity extends AppCompatActivity {

    final Activity activity = this;

    public Uri imageUri;

    private static final int FILECHOOSER_RESULTCODE   = 2888;
    private ValueCallback<Uri> mUploadMessage;
    private Uri mCapturedImageURI = null;

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incidentfor_employee);
        myWebView = (WebView) findViewById(R.id.webView12);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setCacheMode(webSettings.LOAD_NO_CACHE);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        myWebView.loadUrl("https://cm.maxient.com/reportingform.php?PalmBeachState&layout_id=13");
        myWebView.setWebViewClient(new WebViewClient());
    }

    // openFileChooser for Android 3.0+
    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType){
        /**updated, out of the IF **/
        mUploadMessage = uploadMsg;
        /**updated, out of the IF **/



        try{
            File imageStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "AndroidExampleFolder");
            if (!imageStorageDir.exists()) {
                imageStorageDir.mkdirs();
            }
            File file = new File(imageStorageDir + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg");
            mCapturedImageURI = Uri.fromFile(file); // save to the private variable

            final Intent captureIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            captureIntent.putExtra(MediaStore.EXTRA_OUTPUT, mCapturedImageURI);
            // captureIntent.putExtra(MediaStore.EXTRA_SCREEN_ORIENTATION, ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            Intent i = new Intent(Intent.ACTION_GET_CONTENT);
            i.addCategory(Intent.CATEGORY_OPENABLE);
            i.setType("image/*");

            Intent chooserIntent = Intent.createChooser(i, "Image Chooser");
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Parcelable[] { captureIntent });

            startActivityForResult(chooserIntent, FILECHOOSER_RESULTCODE);
        }
        catch(Exception e){
            Toast.makeText(getBaseContext(), "Camera Exception:"+e, Toast.LENGTH_LONG).show();
        }
        //}
    }

    // openFileChooser for Android < 3.0
    public void openFileChooser(ValueCallback<Uri> uploadMsg){
        openFileChooser(uploadMsg, "");
    }

    //openFileChooser for other Android versions
    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
        openFileChooser(uploadMsg, acceptType);
    }



    /** Added code to clarify chooser. **/

    //The webPage has 2 filechoosers and will send a console message informing what action to perform, taking a photo or updating the file
    public boolean onConsoleMessage(ConsoleMessage cm) {
        onConsoleMessage(cm.message(), cm.lineNumber(), cm.sourceId());
        //Toast.makeText(getBaseContext(), cm.message()+" :message", Toast.LENGTH_LONG).show();
        return true;
    }
    public void onConsoleMessage(String message, int lineNumber, String sourceID) {
        //Log.d("androidruntime", "Per c�nsola: " + message);
        //Toast.makeText(getBaseContext(), message+":message", Toast.LENGTH_LONG).show();
        //if(message.endsWith("foto")){ boolFileChooser= true; }
        //else if(message.endsWith("pujada")){ boolFileChooser= false; }
    }
    /** Added code to clarify chooser. **/


// Return here when file selected from camera or from SDcard

@Override
protected void onActivityResult(int requestCode, int resultCode,
        Intent intent) {

        if(requestCode==FILECHOOSER_RESULTCODE)
        {

        if (null == this.mUploadMessage) {
        return;
        }

        Uri result=null;

        try{
        if (resultCode != RESULT_OK) {

        result = null;

        } else {

        // retrieve from the private variable if the intent is null
        result = intent == null ? mCapturedImageURI : intent.getData();
        }
        }
        catch(Exception e)
        {
        Toast.makeText(getApplicationContext(), "activity :"+e, Toast.LENGTH_LONG).show();
        }

        mUploadMessage.onReceiveValue(result);
        mUploadMessage = null;

        }

        }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }


}


