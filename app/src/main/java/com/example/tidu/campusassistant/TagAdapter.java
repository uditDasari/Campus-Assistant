package com.example.tidu.campusassistant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class TagAdapter extends RecyclerView.Adapter<TagAdapter.tagViewHolder> {

    Context context;
    ArrayList<String> arrayList;

    public TagAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public tagViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new tagViewHolder(LayoutInflater.from(context).inflate(R.layout.tag_btn,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull tagViewHolder tagViewHolder, int i) {
        final String string = arrayList.get(i);
        tagViewHolder.button.setText(string);
        tagViewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ChatActivity)context).inputTag(string);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class tagViewHolder extends RecyclerView.ViewHolder
    {
        Button button;

        public tagViewHolder(@NonNull View itemView) {
            super(itemView);
            button=itemView.findViewById(R.id.btn);
        }
    }
}
