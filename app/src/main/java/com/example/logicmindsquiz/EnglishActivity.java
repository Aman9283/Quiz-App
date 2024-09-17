package com.example.logicmindsquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {

    ArrayList<String> modelArrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        String title= "English Language";
        setSupportActionBar(findViewById(R.id.toolbar2));
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView= findViewById(R.id.englishRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelArrayList.add("Spot the errors");
        modelArrayList.add("Fill in the banks");
        modelArrayList.add("Para jumbles");
        modelArrayList.add("Sentence correction");
        modelArrayList.add("Cloze test");

        TopicAdapter adapter= new TopicAdapter(this, modelArrayList, title);
        recyclerView.setAdapter(adapter);
    }
}