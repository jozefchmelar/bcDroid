package com.chmelar.jozef.bcfiredroid;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.google.android.gms.internal.zzt.TAG;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("TAG", "Service zacala");
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // ...
        super.onMessageReceived(remoteMessage);
        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());
        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
    }
}
