package com.paparazziteam.avoidscreenrecordandtakescheenshot

import android.app.Activity
import android.os.Build
import android.view.WindowManager

// this function is used to avoid take a screenshot of the app
fun setFlagSecure(activity: Activity) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
        activity.window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
    }
}