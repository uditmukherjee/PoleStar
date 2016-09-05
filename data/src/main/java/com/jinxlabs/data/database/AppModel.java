package com.jinxlabs.data.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by uditmukherjee on 06/09/16.
 */
public class AppModel extends RealmObject {
  @PrimaryKey private String appName;
  private int iconResource;

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public int getIconResource() {
    return iconResource;
  }

  public void setIconResource(int iconResource) {
    this.iconResource = iconResource;
  }
}
