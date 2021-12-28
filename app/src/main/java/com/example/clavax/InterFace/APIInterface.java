package com.example.clavax.InterFace;


import com.example.clavax.Retrofit.PinList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {

 @Headers({
         "token: 100f8bcd4626d373cade4e832633b5f7",
         "source: ANDROID"
 })
 @POST("users/zipcodes/")
 Call<PinList> zipcodes();

}
