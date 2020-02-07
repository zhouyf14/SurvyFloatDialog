package com.chow.floatingdialog;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public class FloatingDialogActivityLifecycleCallBack implements Application.ActivityLifecycleCallbacks {


    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName.equals("net.oschina.gitapp.ui.MainActivity")) {
            FloatingDialogHandler.sendShowFloatingDialogMessage();
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
