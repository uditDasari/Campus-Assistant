package com.example.tidu.campusassistant;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.open, R.string.close);
        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.shops:
                        Toast.makeText(MainActivity.this, "Shops",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this,ShopActivity.class));break;
                    case R.id.profile:
                        Toast.makeText(MainActivity.this, "Profile",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this,ProfileActivity.class));
                        break;
                    case R.id.canteen:
                        Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.buyItems:
                        Toast.makeText(MainActivity.this, "Bidd",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this,ProductBid.class));
                        break;
                    case R.id.fines:
                        Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.help:
                        startActivity(new Intent(MainActivity.this,ChatActivity.class));break;
                    default:
                        return true;
                }


                return true;

            }
        });


        /*button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChatActivity.class));
            }
        });*/
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
