package com.angogasapps.external_api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "https://developerslife.ru";
    private static Retrofit client;

    public static Retrofit getInstance(){
        if (client == null)
            client = createClient();
        return client;
    }

    private static Retrofit createClient(){
        OkHttpClient client = new OkHttpClient.Builder().build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
    }
}
