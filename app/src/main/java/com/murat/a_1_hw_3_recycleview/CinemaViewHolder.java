package com.murat.a_1_hw_3_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CinemaViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCinema;

    public CinemaViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCinema = itemView.findViewById(R.id.tv_cinema);
    }

    public void bind (String cinema){
        tvCinema.setText(cinema);
    }
}
