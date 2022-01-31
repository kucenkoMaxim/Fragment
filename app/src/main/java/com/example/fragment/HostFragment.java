package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HostFragment extends Fragment implements Messager {

private TextView txtGetData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_host, container, false);
        txtGetData=view.findViewById(R.id.txtGetData);
        return view;

    }


    @Override
    public void sendMessage(String s) {
        txtGetData.setText(s);



    }
}



