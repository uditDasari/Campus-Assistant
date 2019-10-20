package com.example.tidu.campusassistant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tidu.campusassistant.sampledata.Response;

import java.util.List;

public class ProductBidAdapter extends RecyclerView.Adapter<ProductBidAdapter.ProductBidViewHolder> {
    Context context;
    List <Response> list;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Response> getList() {
        return list;
    }

    public void setList(List<Response> list) {
        this.list = list;
    }

    public ProductBidAdapter(Context context, List<Response> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ProductBidViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ProductBidViewHolder(LayoutInflater.from(context).inflate(R.layout.product_bid_card,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductBidViewHolder productBidViewHolder, int i) {
        productBidViewHolder.name.setText(list.get(i).getName());
        productBidViewHolder.desc.setText(list.get(i).getDescription());
        productBidViewHolder.maxbid.setText(list.get(i).getMaxBid());
        productBidViewHolder.phn.setText(String.valueOf(list.get(i).getOwner().getPhone()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ProductBidViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,desc,maxbid,phn;
        public ProductBidViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tv_name_bid);
            desc=itemView.findViewById(R.id.tv_desc_bid);
            maxbid=itemView.findViewById(R.id.tv_max_bid);
            phn=itemView.findViewById(R.id.tv_contact_bid);
        }
    }
}
