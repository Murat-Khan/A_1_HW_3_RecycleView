package com.murat.a_1_hw_3_recycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ProfessionsFragment extends Fragment {

    private RecyclerView rvProfession;
    private ArrayList<String> profList = new ArrayList<>();
    private ProfessionAdapter adapter;

    public ProfessionsFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_professions, container, false);
        rvProfession = view.findViewById(R.id.recycle_for_professions);
        fillList();
        adapter = new ProfessionAdapter(profList);
        rvProfession.setAdapter(adapter);

        return view;
    }

    private void fillList(){
        profList.add("Повар");
        profList.add("Фермер");
        profList.add("Разработчик ПО");
        profList.add("Актер");
        profList.add("Менеджер");
        profList.add("Бухгалтер");
        profList.add("Риелтор");
        profList.add("Страховой агент");
        profList.add("Аниматор");
        profList.add("Ювелир");
        profList.add("Автомеханик");
        profList.add("Прораб");
        profList.add("Технолог");
        profList.add("Адвокат");
        profList.add("Нотариус");
        profList.add("Банкир");
        profList.add("Маркетолог");
        profList.add("Экономист");
        profList.add("Дизайнер");


    }
}