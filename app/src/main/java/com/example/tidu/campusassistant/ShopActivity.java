package com.example.tidu.campusassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        recyclerView=findViewById(R.id.rv_shop);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Shop> arrayList=new ArrayList<>();
        arrayList.add(new Shop("ISM Main Canteen","ISM Dhanbad","https://buildabit.s3.ap-south-1.amazonaws.com/ISM+MAIN+CANteen.jpg","6264733987"));
        arrayList.add(new Shop("Nescafe","Academic Complex","https://buildabit.s3.ap-south-1.amazonaws.com/nescafe-cafe-dhanbad-r66nsmzc9n-250.jpg","1212121212"));
        arrayList.add(new Shop("Shahi Dharbar","IIT Dhanbad","https://buildabit.s3.ap-south-1.amazonaws.com/shahi-darbar-dhanbad-02ad0mzhbm.jpg","5433765111"));

        ShopAdapter shopAdapter= new ShopAdapter(this,arrayList);
        recyclerView.setAdapter(shopAdapter);
    }
}
