package com.angogasapps.external_api;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        ApiManager.init();
    }

    public static Context getContext(){
        return app.getApplicationContext();
    }
}
