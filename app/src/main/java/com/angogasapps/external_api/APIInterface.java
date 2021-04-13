package com.angogasapps.external_api;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    @GET("/random?json=true")
    Single<Joke> getJoke();
}
