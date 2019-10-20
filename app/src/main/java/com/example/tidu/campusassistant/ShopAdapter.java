package com.example.tidu.campusassistant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.shopViewHolder> {

    Context context;
    ArrayList<Shop> arrayList;

    public ShopAdapter(Context context, ArrayList<Shop> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public shopViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new shopViewHolder(LayoutInflater.from(context).inflate(R.layout.shop_card,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull shopViewHolder shopViewHolder, int i) {
        shopViewHolder.phn.setText(arrayList.get(i).phn);
        shopViewHolder.name.setText(arrayList.get(i).name);
        shopViewHolder.address.setText(arrayList.get(i).address);
        Picasso.get().load(arrayList.get(i).image).into(shopViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class shopViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView name,address,phn;
        ConstraintLayout constraintLayout;

        public shopViewHolder(@NonNull View itemView) {

            super(itemView);
            name=itemView.findViewById(R.id.shp_name);
            imageView=itemView.findViewById(R.id.shp_img);
            address=itemView.findViewById(R.id.shp_addr);
            phn=itemView.findViewById(R.id.shp_phn);
            constraintLayout=itemView.findViewById(R.id.cons_lay);
        }
    }
}
