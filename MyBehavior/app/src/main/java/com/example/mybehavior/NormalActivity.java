package com.example.mybehavior;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.mybehavior.adapter.MyAdapter;

import java.util.ArrayList;

public class NormalActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        recyclerview = findViewById(R.id.recyclerview);
        list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add("item"+i);
        }
        MyAdapter myAdapter = new MyAdapter(list, this);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(myAdapter);

    }
}
