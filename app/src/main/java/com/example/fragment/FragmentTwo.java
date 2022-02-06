package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {
    TextView txt_Viev_Two;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=
                inflater.inflate(R.layout.fragment_two, container, false);
        txt_Viev_Two =view.findViewById(R.id.txt_Two);

        return view;
    }
    public void TwoDate(String text){
        txt_Viev_Two.setText(text);
    }
}