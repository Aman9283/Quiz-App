package com.example.logicmindsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.HashMap;

public class ResultActivity extends AppCompatActivity {

    TextView correct, wrong, timeTaken;
    PieChart pieChart;
    HashMap<Integer,String> ansHashmap= new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        pieChart = findViewById(R.id.piechart);

        Intent intent= getIntent();
        int marks= intent.getIntExtra("marks",0);
        int correctAns= marks;
        int wrongAns= 10-marks;
        String time = intent.getStringExtra("time");
        float timeValue = Float.valueOf(time);

        float t= 12- timeValue ;
        String formattedTime = String.format("%.2f", t);
        String topic= intent.getStringExtra("topic");
        ansHashmap= (HashMap<Integer, String>) intent.getSerializableExtra("ans");

        correct= findViewById(R.id.correct);
        wrong= findViewById(R.id.wrong);
        timeTaken= findViewById(R.id.timeTaken);

        correct.setText(String.valueOf(correctAns));
        wrong.setText(String.valueOf(wrongAns));
        timeTaken.setText(formattedTime+" min");

        setData(correctAns,wrongAns);

        findViewById(R.id.reviewBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ResultActivity.this, ReviewActivity.class);
                intent.putExtra("ans",ansHashmap);
                intent.putExtra("topic",topic);
                intent.putExtra("correct",correctAns);
                startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setData(int correctAns, int wrongAns) {
        pieChart.addPieSlice(
                new PieModel(
                        "correct",
                        correctAns,
                        Color.parseColor("#3F8342")));
        pieChart.addPieSlice(
                new PieModel(
                        "wrong",
                        wrongAns,
                        Color.parseColor("#D64B48")));

        // To animate the pie chart
        pieChart.startAnimation();
    }
}