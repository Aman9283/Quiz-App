package com.example.logicmindsquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AptitudeActivity extends AppCompatActivity {

    ArrayList<String> modelArrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);

        String title= "Quantitative Aptitude";
        setSupportActionBar(findViewById(R.id.toolbar2));
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView= findViewById(R.id.aptitudeRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelArrayList.add("Average");
        modelArrayList.add("Problem on Ages");
        modelArrayList.add("Partnership");
        modelArrayList.add("Boats and Streams");
        modelArrayList.add("Percentage");
        modelArrayList.add("Profit and Loss");
        modelArrayList.add("Speed and Distance");
        modelArrayList.add("Problem on Trains");


        TopicAdapter adapter= new TopicAdapter(this, modelArrayList, title);
        recyclerView.setAdapter(adapter);
    }
}