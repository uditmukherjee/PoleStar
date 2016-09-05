package com.jinxlabs.polestar.services;

import android.content.Context;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by uditmukherjee on 06/09/16.
 */
public class NotificationListener extends NotificationListenerService {
  private Context context;

  private HashSet<String> exclusionList;

  @Override
  public void onCreate() {
    super.onCreate();
    context = getApplicationContext();
    exclusionList = new HashSet<>();
    exclusionList.add("com.whatsapp");
  }

  @Override
  public void onNotificationPosted(StatusBarNotification sbn) {
    super.onNotificationPosted(sbn);
    Log.i("notification info", sbn.toString());

    // TODO : replace exclusion list with a db
    if (exclusionList.contains(sbn.getPackageName())) {
      cancelNotification(sbn.getKey());
    }

  }
}
