package com.example.tidu.campusassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tidu.campusassistant.ChatPost.Response;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ChatActivity extends AppCompatActivity {

 private ChatApi chatApi;
    RecyclerView recyclerView,recyclerViewMsg;
    EditText editText;
     LinearLayoutManager linearLayoutManager;
    Button button;
    private static final String TAG = "ChatActivityud"; ArrayList<String> msgList;ArrayList<Integer> integerArrayList;
     MsgAdapter msgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://campus-assistant.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        chatApi=retrofit.create(ChatApi.class);


        recyclerView=findViewById(R.id.rv_tag);
   editText = findViewById(R.id.et_msg);
   button = findViewById(R.id.btn_send);
   recyclerViewMsg=findViewById(R.id.rv_msg);
  msgList=new ArrayList<>();
        integerArrayList= new ArrayList<>();
        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hi!!");arrayList.add("Hello!");
        msgAdapter= new MsgAdapter(this,msgList,integerArrayList);
        TagAdapter tagAdapter = new TagAdapter(this,arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerView.setAdapter(tagAdapter);
       linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewMsg.setLayoutManager(linearLayoutManager);
        recyclerViewMsg.setAdapter(msgAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                if(string.trim().length()==0)
                {
                    Toast.makeText(ChatActivity.this, "Please insert some text", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    editText.setText("");
                    msgList.add(string);
                    for(String string1 : msgList)
                    {
                        Log.d(TAG, string1 + " ");
                    }
                    integerArrayList.add(1);
                    msgAdapter.notifyDataSetChanged();
                    recyclerViewMsg.smoothScrollToPosition(msgAdapter.getItemCount());
                    Call<Response> call=chatApi.createPost(string);
                    call.enqueue(new Callback<Response>() {
                        @Override
                        public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                            if(!response.isSuccessful())
                            {
                                Toast.makeText(ChatActivity.this, "failed code"+response.code(), Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Response response1 = response.body();
                                String string=response1.getResult().getOutput().getGeneric()
                                        .get(0).getResponseType();
                                if(string.equals("text"))
                                    string=response1.getResult().getOutput().getGeneric()
                                            .get(0).getText();
                                else
                                    string=response1.getResult().getOutput().getGeneric()
                                            .get(0).getSource();
                                msgList.add(string);
                                integerArrayList.add(0);
                                msgAdapter.notifyDataSetChanged();
                                recyclerViewMsg.smoothScrollToPosition(msgAdapter.getItemCount());

                            }
                        }

                        @Override
                        public void onFailure(Call<Response> call, Throwable t) {
                            Toast.makeText(ChatActivity.this, "failed "+ t.toString(), Toast.LENGTH_SHORT).show();
                        }
                    });

                }
            }
        });
    }
    void inputTag (String string)
    {
        msgList.add(string);
        integerArrayList.add(1);
        msgAdapter.notifyDataSetChanged();
        recyclerViewMsg.smoothScrollToPosition(msgAdapter.getItemCount());
        Call<Response> call=chatApi.createPost(string);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(ChatActivity.this, "failed code"+response.code(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Response response1 = response.body();
                    String string=response1.getResult().getOutput().getGeneric()
                            .get(0).getResponseType();
                    if(string.equals("text"))
                        string=response1.getResult().getOutput().getGeneric()
                                .get(0).getText();
                    else
                        string=response1.getResult().getOutput().getGeneric()
                                .get(0).getSource();
                    msgList.add(string);
                    integerArrayList.add(0);
                    msgAdapter.notifyDataSetChanged();
                    recyclerViewMsg.smoothScrollToPosition(msgAdapter.getItemCount());

                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(ChatActivity.this, "failed "+ t.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
