package com.jinxlabs.data.database;

import android.support.annotation.NonNull;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import java.util.Date;

/**
 * Created by uditmukherjee on 06/09/16.
 */
public class ConfigurationModel extends RealmObject {
  @PrimaryKey private String configName;
  @NonNull private Date lastUsedDateTime;
  @NonNull private RealmList<AppModel> apps;
  @NonNull private String notificationRule;
  @NonNull private String appExclusionRule;
  private boolean isActive;
  private long numTimesUsed;

  public long getNumTimesUsed() {
    return numTimesUsed;
  }

  public void setNumTimesUsed(long numTimesUsed) {
    this.numTimesUsed = numTimesUsed;
  }

  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  public Date getLastUsedDateTime() {
    return lastUsedDateTime;
  }

  public void setLastUsedDateTime(Date lastUsedDateTime) {
    this.lastUsedDateTime = lastUsedDateTime;
  }

  public RealmList<AppModel> getApps() {
    return apps;
  }

  public void setApps(RealmList<AppModel> apps) {
    this.apps = apps;
  }

  public String getNotificationRule() {
    return notificationRule;
  }

  public void setNotificationRule(String notificationRule) {
    this.notificationRule = notificationRule;
  }

  public String getAppExclusionRule() {
    return appExclusionRule;
  }

  public void setAppExclusionRule(String appExclusionRule) {
    this.appExclusionRule = appExclusionRule;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }
}
