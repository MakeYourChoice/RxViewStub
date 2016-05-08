package com.smartdengg.rxviewstub;

import android.os.Looper;

/**
 * Created by SmartDengg on 2016/5/1.
 */
public class Utils {

    public static <T> T checkNotNull(T object, String message) {
        if (object == null) throw new NullPointerException(message);
        return object;
    }

    public static void checkMainThread() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread. Was: " + Thread.currentThread());
        }
    }
}
