package com.example.logicmindsquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ReasoningActivity extends AppCompatActivity {

    //ArrayList<TopicModel> modelArrayList= new ArrayList<>();
    ArrayList<String> modelArrayList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoning);

        String title= "Reasoning Ability";
        setSupportActionBar(findViewById(R.id.toolbar2));
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView= findViewById(R.id.reasoningRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelArrayList.add("Number Series");
        modelArrayList.add("Artificial Language");
        modelArrayList.add("Calender");
        modelArrayList.add("Blood Relations");
        modelArrayList.add("Direction Sense Test");
        modelArrayList.add("Matching Definitions");
        modelArrayList.add("Seating Positions");
        modelArrayList.add("Cause and Effect");
        modelArrayList.add("Letter and Symbol Series");

        TopicAdapter adapter= new TopicAdapter(this, modelArrayList, title);
        recyclerView.setAdapter(adapter);

    }
}