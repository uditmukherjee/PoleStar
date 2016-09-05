package com.jinxlabs.polestar.injectors;

import java.lang.annotation.Retention;
import javax.inject.Scope;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by uditmukherjee on 06/09/16.
 */
@Scope
@Retention(RUNTIME)
public @interface Activity { }
