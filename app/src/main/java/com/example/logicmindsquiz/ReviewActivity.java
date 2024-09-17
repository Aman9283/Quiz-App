package com.example.logicmindsquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.logicmindsquiz.DBHandler.ReasoningQuesDBHandler;

import java.util.ArrayList;
import java.util.HashMap;

public class ReviewActivity extends AppCompatActivity {

    ArrayList<QuestionsModel> arrayList= new ArrayList<>();
    ReasoningQuesDBHandler dbHandler;
    HashMap<Integer,String> ansHashmap= new HashMap<>();
    int quesNo;
    TextView topicN, marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        dbHandler= new ReasoningQuesDBHandler(ReviewActivity.this);

        //dbHandler.addNumberSeriesSet1();
        Intent intent= getIntent();
        ansHashmap= (HashMap<Integer, String>) intent.getSerializableExtra("ans");
        String topic= intent.getStringExtra("topic");
        int correct= intent.getIntExtra("correct", 0);

        topicN= findViewById(R.id.topicN);
        topicN.setText(topic);
        marks= findViewById(R.id.correctAns);
        marks.setText("+"+correct);

        /*for (Integer key : ansHashmap.keySet()) {
            Log.d("abc",key+" : "+ansHashmap.get(key));
        }*/

        RecyclerView recyclerView= findViewById(R.id.reviewRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        quesNo=1;
        String ans="";

        ArrayList<QuestionsModel> questionList = dbHandler.getTableData();

        // Now you have the list of questions, you can iterate through it and do whatever you want
        for (QuestionsModel question : questionList) {
            arrayList.add(question);
        }

        ReviewAdapter adapter= new ReviewAdapter(this, arrayList, ansHashmap);
        recyclerView.setAdapter(adapter);

        findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}