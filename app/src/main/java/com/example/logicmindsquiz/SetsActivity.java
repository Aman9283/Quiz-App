package com.example.logicmindsquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;

import com.example.logicmindsquiz.DBHandler.SetsDBHandler;

import java.util.ArrayList;

public class SetsActivity extends AppCompatActivity {

    SetsDBHandler db= new SetsDBHandler(this);
    ArrayList<Integer> arrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);

        Intent intent= getIntent();
        String title= intent.getStringExtra("title");
        String topicN= intent.getStringExtra("topicName");

        String toolbarTitle= title+" > "+topicN;
        Toolbar toolbar= findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(toolbarTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        db.addSetsTableData();
        int num= db.getNoSets(topicN);

        Log.d("abc", "no error");

        RecyclerView recyclerView= findViewById(R.id.setRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i=0;i<num;i++){
            arrayList.add(i+1);
        }

        SetsAdapter adapter= new SetsAdapter(this, arrayList, toolbarTitle);
        recyclerView.setAdapter(adapter);

    }

}