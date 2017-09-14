package com.etc.mantouec.example;

import android.app.Application;

import com.etc.mt_core.app.MT;
import com.etc.mt_ec.icon.FontECModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by chenhao on 2017/9/13.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MT.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontECModule())
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
