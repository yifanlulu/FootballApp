package com.wj.baseutils.app;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.wj.base.Initialization;

/**
 * Created by wj on 2018/1/6.
 */

public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        Logger.addLogAdapter(new AndroidLogAdapter());
        new Initialization(this);

    }

    public static Context getContext() {
        return context;
    }
}
