package com.example.mybehavior;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.mybehavior.adapter.MyAdapter;

import java.util.ArrayList;

public class MyBehaviorActivity extends AppCompatActivity {

    private RecyclerView rec;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_behavior);
        rec = findViewById(R.id.recyclerview);
        list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add("item data"+i);
        }
        MyAdapter myAdapter = new MyAdapter(list, this);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(myAdapter);
    }
}
