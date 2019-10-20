package com.example.tidu.campusassistant;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;


public class MsgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = "MsgAdapter";
    Context context;
    ArrayList<String> arrayList;
    ArrayList<Integer> integerArrayList;
    public MsgAdapter() {
    }

    public MsgAdapter(Context context, ArrayList<String> arrayList,ArrayList<Integer> integerArrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.integerArrayList=integerArrayList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == R.layout.right_msg)
        {
            return new RightViewHolder(LayoutInflater.from(context).inflate(R.layout.right_msg,parent,false));
        }
        else
        {
            return new LeftViewHolder(LayoutInflater.from(context).inflate(R.layout.left_msg,parent,false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {

        final String fbGrpMsg = arrayList.get(position);
        //String id = fbGrpMsg.getId();

                if(holder instanceof LeftViewHolder)
                {
                    ((LeftViewHolder) holder).lmessage.setText(fbGrpMsg);

                }
                else if(holder instanceof RightViewHolder)
                {
                    ((RightViewHolder) holder).rmessage.setText(fbGrpMsg);

                }


        //String imageUrl = FirebaseDatabase.getInstance().getReference().child("Users").child(id).child("Image").
        //"https://i.pinimg.com/564x/6b/46/1a/6b461a006f4e718ee0e406550ca88f33.jpg";
        // "https://firebasestorage.googleapis.com/v0/b/reply-ecfe4.appspot.com/o/Profile%20Images%2FyyCAWstr4jR9GRlkh68cko6Jzgf2.jpg?alt=media&token=3f2d17c7-b79b-4e5f-9dbe-59bce2f720d6";



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        Integer id = integerArrayList.get(position);
        if(id==1)
            return R.layout.right_msg;
        else
            return R.layout.left_msg;
    }
    public class LeftViewHolder extends RecyclerView.ViewHolder
    {
        TextView lmessage;
        public LeftViewHolder(@NonNull View itemView) {
            super(itemView);
            lmessage = itemView.findViewById(R.id.l_msg);

        }
    }

    public class RightViewHolder extends RecyclerView.ViewHolder

    {
       TextView rmessage;
        public RightViewHolder(@NonNull View itemView) {
            super(itemView);
            rmessage=itemView.findViewById(R.id.r_msg);
        }
    }

}

