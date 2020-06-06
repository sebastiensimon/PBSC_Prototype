package com.example.asti3.palmbeachstatecollege;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MFirebaseMessagingService extends FirebaseMessagingService {
    public MFirebaseMessagingService() {
    }
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
super.onMessageReceived(remoteMessage);

sendNotification(remoteMessage.getNotification().getBody());

    }
    private void sendNotification (String messageBody)
    {
        Intent intent = new Intent(this,MainActivity.class);
        intent.addFlags (Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder noticationBuilder = new NotificationCompat.Builder(this);
        noticationBuilder.setSmallIcon(R.drawable.ic_stat_name);
        noticationBuilder.setContentTitle("Palm Beach State College");
        noticationBuilder.setContentText(messageBody);
        noticationBuilder.setAutoCancel(true);
        noticationBuilder.setSound (defaultSoundUri);
        noticationBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,noticationBuilder.build());




    }
}

