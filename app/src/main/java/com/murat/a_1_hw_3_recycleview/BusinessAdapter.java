package com.murat.a_1_hw_3_recycleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BusinessAdapter extends RecyclerView.Adapter<BusinessViewHolder> {

    private ArrayList<String> businessList;

    public BusinessAdapter(ArrayList<String> businessList) {
        this.businessList = businessList;
    }


    @NonNull
    @Override
    public BusinessViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BusinessViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_business,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BusinessViewHolder holder, int position) {

        holder.bind(businessList.get(position));

    }

    @Override
    public int getItemCount() {
        return businessList.size();
    }
}
