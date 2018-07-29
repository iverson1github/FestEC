package com.taozai.latte.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.taozai.latte.app.Latte;

/**
 * Created by taozi on 18/6/20.
 */

public class DimenUtil {
    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }
    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
