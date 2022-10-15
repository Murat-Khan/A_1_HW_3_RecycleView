package com.murat.a_1_hw_3_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BusinessViewHolder extends RecyclerView.ViewHolder {
    private TextView tvBusiness;
    public BusinessViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBusiness = itemView.findViewById(R.id.tv_business);
    }

    public void bind(String business){
tvBusiness.setText(business);
    }
}
