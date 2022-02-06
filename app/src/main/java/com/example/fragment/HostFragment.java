package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HostFragment extends Fragment implements Messanger {
        private TextView fragTwo;
        private TextView fragOne;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_host, container, false);

        fragOne=view.findViewById(R.id.txt_One);
        fragTwo=view.findViewById(R.id.txt_Two);

        return view;

    }


    @Override
    public void mesHost(String a) {
        fragOne.setText(a);
        fragTwo.setText(a);



    }
}



