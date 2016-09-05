package com.jinxlabs.polestar.injectors.modules;

import com.jinxlabs.polestar.PoleStarApp;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by uditmukherjee on 06/09/16.
 */
@Module
public class AppModule {
  private final PoleStarApp app;

  public AppModule(PoleStarApp app) {
    this.app = app;
  }

  @Provides @Singleton
  PoleStarApp provideApplicationContext() {
    return app;
  }

  @Provides @Named("executor_thread")
  Scheduler provideExecutorThread() {
    return Schedulers.newThread();
  }

  @Provides @Named("ui_thread")
  Scheduler provideUiThread() {
    return AndroidSchedulers.mainThread();
  }
}
