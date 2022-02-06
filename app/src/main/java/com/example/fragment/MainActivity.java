package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Messanger {

    FragmentTwo fragmentTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Messanger mesHost =(Messanger) getSupportFragmentManager().findFragmentById(R.id.host_fragment);
    }

    @Override
    public void mesHost(String a) {

    fragmentTwo.TwoDate(a);



    }
}