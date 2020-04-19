package com.example.mybehavior.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybehavior.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter{
    private ArrayList<String> list;
    private Context context;

    public MyAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, null);
        VH vh = new VH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
         VH vh= (VH) holder;
         vh.txtItem.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class VH extends RecyclerView.ViewHolder{
        TextView txtItem;
        public VH(@NonNull View itemView) {
            super(itemView);
             txtItem = itemView.findViewById(R.id.txt_item);
        }
    }
}