package com.wj.base.utils;

import com.wj.base.Initialization;

/**
 * Created by wj on 2018/1/14.
 */

public class ScreenUtils {

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dp2px(float dpValue) {
        final float scale = Initialization.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dp(float pxValue) {
        final float scale = Initialization.getContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
