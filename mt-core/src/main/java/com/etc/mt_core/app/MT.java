package com.etc.mt_core.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by chenhao on 2017/9/12.
 */

public final class MT {

    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getMTConfigs();
    }

    public static Context getApplication() {
        return Configurator.getInstance().getConfiguration(ConfigType.APPLICATION_CONTEXT);
    }

}
