package com.alfredobejarano.bezirkpubexample.utils;

import android.app.Activity;

import com.bezirk.middleware.Bezirk;
import com.bezirk.middleware.android.BezirkMiddleware;

/**
 * Created by jacbe on 11/03/2017.
 */

public class ProjectUtils {
    public static final int UP_ARROW = 38;
    public static final int LEFT_ARROW = 37;
    public static final int RIGHT_ARROW = 39;
    public static final int DOWN_ARROW = 40;
    public static final int SPACE_BAR = 32;
    public static final String ZirkName = "Remote Control Android Zirk";

    public Bezirk InitializeBezirk(Activity activity) {
        BezirkMiddleware.initialize(activity);
        return BezirkMiddleware.registerZirk(ZirkName);
    }
}
