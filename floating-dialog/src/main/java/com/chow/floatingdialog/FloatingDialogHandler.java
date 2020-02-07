package com.chow.floatingdialog;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class FloatingDialogHandler extends Handler {
    private static Activity mActivity;
    private static FloatingDialogHandler mhandler = new FloatingDialogHandler();

    public FloatingDialogHandler() {
    }

    public FloatingDialogHandler(Activity activity) {
        this.mActivity = activity;
        mhandler = new FloatingDialogHandler();
    }

    @Override
    public void handleMessage(Message msg) {
        if (msg.what == 9527) {
            FloatingDialog.initButton(mActivity);
        }
    }

    public static void sendShowFloatingDialogMessage() {
        Message message = mhandler.obtainMessage();
        message.what = 9527;
        mhandler.sendMessageDelayed(message,1000);
    }
}
