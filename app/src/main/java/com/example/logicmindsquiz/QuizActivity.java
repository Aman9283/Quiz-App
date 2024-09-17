package com.example.logicmindsquiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.logicmindsquiz.DBHandler.ReasoningQuesDBHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class QuizActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView no, ques, option1, option2, option3, option4, timer;
    String ans, topic, timeTaken;
    int quesNo, marks, setNo;
    ReasoningQuesDBHandler dbHandler= new ReasoningQuesDBHandler(this);;
    ArrayList<QuestionsModel> list;
    private AlertDialog alertDialog;
    HashMap<Integer,Integer> marksHashMap= new HashMap<>();
    HashMap<Integer,String> ansHashmap= new HashMap<>();
    private boolean isActivityDestroyed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //dbHandler= new ReasoningQuesDBHandler(QuizActivity.this);
        dbHandler.deleteRows();

        Toolbar toolbar= findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Logic Minds Quiz");
        toolbar.setNavigationIcon(R.drawable.quiz_icon);

        Intent intent= getIntent();
        setNo= intent.getIntExtra("Set No",1);
        topic= intent.getStringExtra("topic");

        for (int i = 1; i <= 10; i++) {
            ansHashmap.put(i, "null");// Replace "value" with the actual value you want to associate with each key
        }

        setSetsNo();
        TextView set= findViewById(R.id.set);
        set.setText("SET "+setNo);

        setTimer();

        TextView topicName= findViewById(R.id.topic);
        topicName.setText(topic);

        quesNo=1;
        marks=0;

        ans= setQuestions(quesNo);

        radioGroup = findViewById(R.id.radioGroup);


        // on below line we are adding check change listener for our radio group.
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // on below line we are getting radio button from our group.
                radioButton = findViewById(checkedId);
            }
        });

        findViewById(R.id.prevQues).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quesNo==1) return;
                quesNo--;
                ans= setQuestions(quesNo);
            }
        });

        findViewById(R.id.nextQues).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quesNo==10) quesNo=0;
                quesNo++;
                ans= setQuestions(quesNo);
            }
        });

        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearChecked();
            }
        });

        findViewById(R.id.saveBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if(checkedRadioButtonId == -1){
                    marksHashMap.put(quesNo,0);
                    quesNo++;
                    ans= setQuestions(quesNo);
                    clearChecked();
                    return;
                }

                String selectedOption = radioButton.getText().toString();
                if(ans.equals(selectedOption)){
                    marksHashMap.put(quesNo,1);
                    //ansHashmap.put(quesNo,ans);
                    ansHashmap.replace(quesNo, ans);
                }
                else{
                    marksHashMap.put(quesNo,0);
                    //ansHashmap.put(quesNo,selectedOption);
                    ansHashmap.replace(quesNo, selectedOption);
                }
                if(quesNo== 10) quesNo=0;
                quesNo++;
                ans= setQuestions(quesNo);
                clearChecked();
            }
        });

        findViewById(R.id.submitBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(QuizActivity.this);
                builder.setMessage("Do you really want to submit the quiz?");
                builder.setCancelable(false);
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getMarks();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }

        });

    }

    private void getMarks(){
        for (Integer key : marksHashMap.keySet()) {
            marks= marks+ marksHashMap.get(key);
        }

        Intent intent= new Intent(QuizActivity.this, ResultActivity.class);
        intent.putExtra("marks",marks);
        intent.putExtra("ans",ansHashmap);
        intent.putExtra("topic",topic);
        intent.putExtra("time",timeTaken);
        startActivity(intent);

        finish();
    }

    private void clearChecked(){
        radioGroup.clearCheck();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder= new AlertDialog.Builder(QuizActivity.this);
        builder.setMessage("Do you really want to exit the quiz?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    private void setTimer(){
        timer= findViewById(R.id.timer);
        new CountDownTimer(720000, 1000) {

            public void onTick(long millisUntilFinished) {
                // Update the TextView with the remaining time
                int minutes = (int) (millisUntilFinished / 1000) / 60;
                int seconds = (int) (millisUntilFinished / 1000) % 60;
                String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
                timer.setText("Time left: " + timeLeftFormatted);
                timeTaken= String.format("%02d.%02d", minutes, seconds);
            }

            public void onFinish() {
                // When the timer is finished, set the text to "Time's up!"
                if (!isActivityDestroyed){
                    timer.setText("Time's Up");
                    AlertDialog.Builder builder= new AlertDialog.Builder(QuizActivity.this);
                    builder.setTitle("Time's Up");
                    builder.setCancelable(false);
                    alertDialog = builder.create();
                    alertDialog.show();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            alertDialog.dismiss();

                            getMarks();

                            finish();
                        }
                    },3000);
                }
            }
        }.start();
    }
    private String setQuestions(int quesNo){
        list= dbHandler.getTableData(quesNo);
        String ans="";

        no= findViewById(R.id.quesNo);
        ques= findViewById(R.id.ques);

        option1= findViewById(R.id.O1);
        option2= findViewById(R.id.O2);
        option3= findViewById(R.id.O3);
        option4= findViewById(R.id.O4);

        for (QuestionsModel question : list) {
            no.setText(Html.fromHtml("<font color='#9E1613'>" + question.getQuesNo() + "</font>/10"));
            ques.setText(question.getQues());
            option1.setText(question.getOption1());
            option2.setText(question.getOption2());
            option3.setText(question.getOption3());
            option4.setText(question.getOption4());
            ans= question.getAns();
        }
        return ans;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.close_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.closeBtn){
            AlertDialog.Builder builder= new AlertDialog.Builder(QuizActivity.this);
            builder.setMessage("Do you really want to exit the quiz?");
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setSetsNo(){
        Log.d("abc", "setno. "+setNo);
        Log.d("abc", "topic "+topic);
        if(topic.equals("Reasoning Ability > Number Series")){
            if(setNo== 1){
                Log.d("abc", "set 1");
                dbHandler.addNumberSeriesSet1();
            }
            else if(setNo== 2){
                dbHandler.addNumberSeriesSet2();
            }
            else if(setNo== 3){
                dbHandler.addNumberSeriesSet3();
            }
            else if(setNo== 4){
                dbHandler.addNumberSeriesSet4();
            }
            else if(setNo== 5){
                dbHandler.addNumberSeriesSet5();
            }
        }
        else if(topic.equals("Reasoning Ability > Artificial Language")){
            if(setNo== 1){
                dbHandler.addArtificialLanguageSet1();
            }
            else if(setNo== 2){
                dbHandler.addArtificialLanguageSet2();
            }
        }
        else if(topic.equals("Reasoning Ability > Calender")){
            if(setNo== 1){
                dbHandler.addCalenderSet1();
            }
        }
        else if(topic.equals("Reasoning Ability > Blood Relations")){
            if(setNo== 1){
                dbHandler.addBloodRelationsSet1();
            }
            else if(setNo== 2){
                dbHandler.addBloodRelationsSet2();
            }
            else if(setNo== 3){
                dbHandler.addBloodRelationsSet3();
            }
        }
        else if(topic.equals("Reasoning Ability > Direction Sense Test")){
            if(setNo== 1){
                dbHandler.addDirectionSet1();
            }
            else if(setNo== 2){
                dbHandler.addDirectionSet2();
            }
        }
        else if(topic.equals("Quantitative Aptitude > Average")){
            if(setNo== 1){
                dbHandler.addAverageSet1();
            }
            else if(setNo== 2){
                dbHandler.addAverageSet2();
            }
            else if(setNo== 3){
                dbHandler.addAverageSet3();
            }
        }
        else if(topic.equals("Quantitative Aptitude > Problem on Ages")){
            if(setNo== 1){
                dbHandler.addProblemOnAgesSet1();
            }
            else if(setNo== 2){
                dbHandler.addProblemOnAgesSet2();
            }
        }
        else if(topic.equals("Quantitative Aptitude > Partnership")){
            if(setNo== 1){
                dbHandler.addPartnershipSet1();
            }
            else if(setNo== 2){
                dbHandler.addPartnershipSet2();
            }
        }
        else if(topic.equals("Quantitative Aptitude > Boats and Streams")){
            if(setNo== 1){
                dbHandler.addBoatsAndStreamsSet1();
            }
            else if(setNo== 2){
                dbHandler.addBoatsAndStreamsSet2();
            }
        }
        else if(topic.equals("Quantitative Aptitude > Percentage")){
            if(setNo== 1){
                dbHandler.addPercentageSet1();
            }
            else if(setNo== 2){
                dbHandler.addPercentageSet2();
            }
            else if(setNo== 3){
                dbHandler.addPercentageSet3();
            }
        }
        else if(topic.equals("English Language > Spot the errors")){
            if(setNo== 1){
                //dbHandler.addPercentageSet1();
                dbHandler.addSpotTheErrors1();
            }
            else if(setNo== 2){
                //dbHandler.addPercentageSet2();
            }
        }
    }
    protected void onDestroy() {
        super.onDestroy();
        isActivityDestroyed = true;
    }
}