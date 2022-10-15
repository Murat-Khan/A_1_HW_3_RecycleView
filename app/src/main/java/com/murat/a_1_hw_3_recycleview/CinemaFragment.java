package com.murat.a_1_hw_3_recycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CinemaFragment extends Fragment {
    private RecyclerView rvCinema;
    private ArrayList<String> cinemaList = new ArrayList<>();
    private CinemaAdapter adapter;


    public CinemaFragment(){}


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cinema, container, false);
        rvCinema = view.findViewById(R.id.recycle_for_cinema);
        fillList();

        adapter = new CinemaAdapter(cinemaList);
        rvCinema.setAdapter(adapter);

        return view;
    }

    private void fillList(){
        cinemaList.add("Фарсаж");
        cinemaList.add("Тор");
        cinemaList.add("Железный человек");
        cinemaList.add("Мстители");
        cinemaList.add("Кремнивая долина");
        cinemaList.add("Пила");
        cinemaList.add("Пираты корибского море");
        cinemaList.add("Эйсвинтура");
        cinemaList.add("Маска");
        cinemaList.add("Неоспоримый");
        cinemaList.add("Заложница");
        cinemaList.add("Заложница");
        cinemaList.add("Заложница");
        cinemaList.add("Заложница");
        cinemaList.add("Заложница");
    }
}