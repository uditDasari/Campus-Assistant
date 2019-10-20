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

class productAdapter extends RecyclerView.Adapter<productAdapter.productViewHolder> {

    Context context;
    ArrayList<Product> arrayList;

    public productAdapter(Context context, ArrayList<Product> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new productViewHolder(LayoutInflater.from(context).inflate(R.layout.product_card,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder productViewHolder, int i) {
        productViewHolder.name.setText(arrayList.get(i).name);
        productViewHolder.desc.setText(arrayList.get(i).desc);
        productViewHolder.price.setText(arrayList.get(i).price);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder
    {
       TextView name,desc,price;

        public productViewHolder(@NonNull View itemView) {

            super(itemView);
            name=itemView.findViewById(R.id.pro_name);
            desc=itemView.findViewById(R.id.pro_desc);
            price=itemView.findViewById(R.id.pro_price);
        }
    }
}
