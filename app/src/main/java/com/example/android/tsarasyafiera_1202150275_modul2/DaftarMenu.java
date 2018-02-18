package com.example.android.tsarasyafiera_1202150275_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarMenu extends AppCompatActivity {

    private final LinkedList<String> food = new LinkedList<>();
    private final LinkedList<Integer> price = new LinkedList<>();
    private final LinkedList<Integer> photo = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private RecycleViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new RecycleViewAdapter(this, food, price, photo);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            food.add("pizza");
            food.add("fun fries");
            food.add("burger");
            food.add("hotdog");
            food.add("sandwich");

            price.add(49000);
            price.add(9000);
            price.add(29000);
            price.add(29000);
            price.add(19000);

            photo.add(R.drawable.pizza2);
            photo.add(R.drawable.kentang);
            photo.add(R.drawable.burger);
            photo.add(R.drawable.hotdog);
            photo.add(R.drawable.sandwich);
        }
    }
}
