package com.jinxlabs.polestar;

import android.app.Application;
import com.jinxlabs.polestar.injectors.components.AppComponent;
import com.jinxlabs.polestar.injectors.components.DaggerAppComponent;
import com.jinxlabs.polestar.injectors.modules.AppModule;

/**
 * Created by uditmukherjee on 06/09/16.
 */
public class PoleStarApp extends Application {
  private AppComponent mAppComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    initializeDI();
  }

  private void initializeDI() {
    mAppComponent = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .build();
  }

  public AppComponent getAppComponent() {
    return mAppComponent;
  }

}
