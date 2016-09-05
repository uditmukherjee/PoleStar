package com.jinxlabs.polestar.injectors.components;

import android.content.SharedPreferences;
import com.jinxlabs.polestar.PoleStarApp;
import com.jinxlabs.polestar.injectors.modules.AppModule;
import com.jinxlabs.polestar.injectors.modules.DataModule;
import dagger.Component;
import io.realm.Realm;
import javax.inject.Named;
import javax.inject.Singleton;
import rx.Scheduler;

/**
 * Created by uditmukherjee on 06/09/16.
 */
@Singleton @Component(modules = {AppModule.class, DataModule.class})
public interface AppComponent {
  PoleStarApp app();
  SharedPreferences sharedPrefs();
  Realm realmInstance();

  @Named("ui_thread") Scheduler uiThread();
  @Named("executor_thread") Scheduler executorThread();
}
