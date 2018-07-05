package com.example.vigneshshankar.billsplitsg;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Activity activity;
    ArrayList arrayList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView ageTextView, nameTextView;

        public MyViewHolder(View view) {
            super(view);

            ageTextView = view.findViewById(R.id.person_age);
            nameTextView = view.findViewById(R.id.person_name);
        }
    }

    public RecyclerViewAdapter(ArrayList arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.child_recyclerview, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final MyViewHolder vh = (MyViewHolder) holder;

        //vh.ageTextView.setText(arrayList.get(pos).age);
        //vh.nameTextView.setText(arrayList.get(pos).name);
    }

    @Override
    public int getItemCount() {
        if (arrayList == null)
            return 0;
        else
            return arrayList.size();
    }
}
