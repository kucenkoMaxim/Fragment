package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Messager {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendMessage(String s) {
       HostFragment frag=new HostFragment();
       FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
       ft.add(R.id.host_fragment,frag);
       ft.commit();



    }
}