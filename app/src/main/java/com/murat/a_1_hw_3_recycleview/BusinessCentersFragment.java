package com.murat.a_1_hw_3_recycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BusinessCentersFragment extends Fragment {
    private RecyclerView rvBusiness;
    private ArrayList<String> businessList = new ArrayList<>();

    private BusinessAdapter adapter;
    public BusinessCentersFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business_centers, container, false);
        rvBusiness = view.findViewById(R.id.recycler_view);
        adapter = new BusinessAdapter(businessList);
        rvBusiness.setAdapter(adapter);
        fillList();
        return view;
    }
    private void fillList(){
        businessList.add("Avangard");
        businessList.add("Aurora group");
        businessList.add("Destination Kyrgyzstan");
        businessList.add("EURASIA");
        businessList.add("FORT");
        businessList.add("Global Asia Properties");
        businessList.add("Maximum");
        businessList.add("PREMIUM");
        businessList.add("VEFA Center");
        businessList.add("Victory");
        businessList.add("Адмирал");
        businessList.add("Азия");
        businessList.add("Дордой-Плаза");
        businessList.add("Магнум");
        businessList.add("МОТО");
        businessList.add("Асыл-Таш");
        businessList.add("Альтра Холдинг");
        businessList.add("Альтаир");
        businessList.add("ДК");
        businessList.add("Колизей");

    }


}