package com.example.tidu.campusassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.tidu.campusassistant.sampledata.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductBid extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_bid);
        recyclerView=findViewById(R.id.bid_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BidAPi bidAPi;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://campus-assistant.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bidAPi  = retrofit.create(BidAPi.class);

        Call<List<Response> > call = bidAPi.getResponse();
        call.enqueue(new Callback<List<Response>>() {
            @Override
            public void onResponse(Call<List<Response>> call, retrofit2.Response<List<Response>> response) {
                if(!response.isSuccessful())
                    Toast.makeText(ProductBid.this, response.code(), Toast.LENGTH_SHORT).show();
                else
                {
                    List<Response> list=response.body();
                    ProductBidAdapter productBidAdapter=new ProductBidAdapter(ProductBid.this,list);
                    recyclerView.setAdapter(productBidAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<Response>> call, Throwable t) {
                Toast.makeText(ProductBid.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
