package com.example.asti3.palmbeachstatecollege;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import static android.content.ContentValues.TAG;

public class MyFirebaseInstanceIdService extends com.google.firebase.iid.FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String tokan) {

    }
}

