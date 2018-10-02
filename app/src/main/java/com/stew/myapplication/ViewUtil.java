package com.stew.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by Stew on 2016/5/23.
 * TODO
 */
class ViewUtil {

    static int dpToPx(final Context context, final float dpValue) {
        Resources r = context.getResources();
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dpValue,
                r.getDisplayMetrics()
        );
    }


}