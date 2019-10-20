package com.example.tidu.campusassistant;

import com.example.tidu.campusassistant.ChatPost.Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ChatApi {
    @FormUrlEncoded
    @POST("ask")
    Call<Response> createPost(
            @Field("input") String text
    );
}
