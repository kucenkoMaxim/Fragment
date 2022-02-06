package com.example.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentOne extends Fragment {


           private   Button btnFragOne;
           private EditText editText;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_one, container, false);
        init(view);




        btnFragOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
            String editString=editText.getText().toString();
            if (editString.length()>0){
                MainActivity activity=(MainActivity) getActivity();
                activity.mesHost(editString);
            }
                }

            });

        return view;
        }
        private void init(View view){
            btnFragOne=view.findViewById(R.id.txt_Two);

        }


}









