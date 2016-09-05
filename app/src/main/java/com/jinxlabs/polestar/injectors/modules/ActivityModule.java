package com.jinxlabs.polestar.injectors.modules;

import android.content.Context;
import com.jinxlabs.polestar.injectors.Activity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by uditmukherjee on 06/09/16.
 */
@Module
public class ActivityModule {
  private final Context mContext;

  public ActivityModule(Context mContext) {
    this.mContext = mContext;
  }

  @Provides @Activity
  Context provideActivityContext() {
    return mContext;
  }

}
