package com.jinxlabs.polestar.injectors.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.jinxlabs.polestar.PoleStarApp;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import javax.inject.Singleton;

/**
 * Created by uditmukherjee on 06/09/16.
 */
@Module
public class DataModule {
  @Provides @Singleton
  Realm provideRealmInstance(PoleStarApp app) {
    RealmConfiguration config = new RealmConfiguration.Builder(app)
        .name("polestar.realm")
        .deleteRealmIfMigrationNeeded()
        .build();
    Realm.setDefaultConfiguration(config);

    return Realm.getDefaultInstance();
  }

  @Provides @Singleton
  SharedPreferences provideSharedPreferences(PoleStarApp app) {
    return PreferenceManager.getDefaultSharedPreferences(app);
  }
}
