package com.example.application.navigationlearnapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.widget.EditText;

@SuppressLint("Registered")
public class About extends AppCompatActivity{ private EditText requestTopic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);

        actionbar();
    }

    public void actionbar(){
        //for back button in Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //for Title in Action Bar
        getSupportActionBar().setTitle("About");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
