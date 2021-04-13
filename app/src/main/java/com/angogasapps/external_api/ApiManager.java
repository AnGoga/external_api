package com.angogasapps.external_api;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.net.ConnectException;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ApiManager {
    private static APIInterface apiInterface;

    public static APIInterface getApi(){
        return apiInterface;
    }

    public static void init(){
        apiInterface = ApiClient.getInstance().create(APIInterface.class);
    }

    public static void getJoke(IOnEnd iOnEnd) {
        Single<Joke> jokeSingle = ApiManager.getApi().getJoke();
        jokeSingle.subscribeOn(Schedulers.single())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Joke>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {}

                    @Override
                    public void onSuccess(@NonNull Joke joke) {
                        Log.d("tag", joke.toString());
                        iOnEnd.onSuccess(joke);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        e.printStackTrace();
                        if (e instanceof ConnectException)
                            Toast.makeText(App.getContext(), "Нет подключения к интернету", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(App.getContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
    }
}
