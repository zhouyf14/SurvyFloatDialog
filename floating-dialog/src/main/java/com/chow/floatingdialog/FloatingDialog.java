package com.chow.floatingdialog;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.PopupWindow;
import android.widget.Toast;

public class FloatingDialog {
    public static void initButton(final Activity mActivity) {
        View rootView = mActivity.getWindow().getDecorView();

        //创建PopupWindow
        View inviteView = LayoutInflater.from(mActivity).inflate(R.layout.floating_dialog_layout, null);
        View cancelBtn = inviteView.findViewById(R.id.floating_dialog_cancel);
        View confirmBtn = inviteView.findViewById(R.id.floating_dialog_confirm);


        final PopupWindow popupWindow = new PopupWindow(inviteView,
                GridView.MarginLayoutParams.WRAP_CONTENT, GridView.MarginLayoutParams.WRAP_CONTENT);

        //popupWindow.setAnimationStyle(R.style.Popupwindow);
//        popupWindow.showAsDropDown(inviteView, 0x100, 0x200);
        popupWindow.setClippingEnabled(true);
//        popupWindow.showAtLocation(inviteView, Gravity.CENTER, 0, 0);
        popupWindow.showAtLocation(rootView, Gravity.BOTTOM, 0, 0);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "稍后邀请", Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
                Toast.makeText(mActivity, "survey on", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
