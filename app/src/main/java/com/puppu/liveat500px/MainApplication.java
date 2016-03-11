package com.puppu.liveat500px;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by fahsai on 11-Mar-16.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize thing(s) here

        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
