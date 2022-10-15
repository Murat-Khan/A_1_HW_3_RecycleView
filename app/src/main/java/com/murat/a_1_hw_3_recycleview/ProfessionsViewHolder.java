package com.murat.a_1_hw_3_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfessionsViewHolder extends RecyclerView.ViewHolder {
    TextView tvProfessions;

    public ProfessionsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvProfessions = itemView.findViewById(R.id.tv_professions);
    }
    public void bind(String professions){
        tvProfessions.setText(professions);
    }
}
