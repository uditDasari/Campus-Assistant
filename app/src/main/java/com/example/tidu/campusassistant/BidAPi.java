package com.example.tidu.campusassistant;

import com.example.tidu.campusassistant.sampledata.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BidAPi {
    @GET()
    Call<List<Response> > getResponse();
}
