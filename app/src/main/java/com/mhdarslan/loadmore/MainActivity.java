package com.mhdarslan.loadmore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager manager;
    MyAdapter myAdapter;

    Boolean isScrolling = false;
    int currentItems , totalItems, scrollOutItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        manager = new LinearLayoutManager(this);

        String[] a = {"23", "13", "54", "36", "89" , "35", "26", "55", "98", "54", "36", "89", "11", "63", "89", "35", "26", "55" };
        ArrayList list = new ArrayList(Arrays.asList(a));

        myAdapter = new MyAdapter(this, list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(manager);

    }
}