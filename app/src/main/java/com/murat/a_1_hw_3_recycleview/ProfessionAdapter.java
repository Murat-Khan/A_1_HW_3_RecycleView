package com.murat.a_1_hw_3_recycleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfessionAdapter extends RecyclerView.Adapter<ProfessionsViewHolder> {

   private ArrayList<String> professionList;

    public ProfessionAdapter(ArrayList<String> professionList) {
        this.professionList = professionList;
    }

    @NonNull
    @Override
    public ProfessionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProfessionsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_professions,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProfessionsViewHolder holder, int position) {
        holder.bind(professionList.get(position));

    }

    @Override
    public int getItemCount() {
        return professionList.size();
    }
}
