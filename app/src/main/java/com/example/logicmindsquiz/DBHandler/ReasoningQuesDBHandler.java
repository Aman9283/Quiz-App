package com.example.logicmindsquiz.DBHandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.logicmindsquiz.QuestionsModel;

import java.util.ArrayList;

public class ReasoningQuesDBHandler extends SQLiteOpenHelper {

    public ReasoningQuesDBHandler(@Nullable Context context) {
        super(context, Parameters.DB_NAME, null, Parameters.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addNumberSeriesSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO,1);
        values.put(Parameters.QUESTION,"Look at this series: 36, 34, 30, 28, 24, ... What number should come next?");
        values.put(Parameters.OPTION_1,"20");
        values.put(Parameters.OPTION_2,"22");
        values.put(Parameters.OPTION_3,"23");
        values.put(Parameters.OPTION_4,"26");
        values.put(Parameters.ANSWER,"22");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,2);
        values.put(Parameters.QUESTION,"Look at this series: 2, 1, (1/2), (1/4), ... What number should come next?");
        values.put(Parameters.OPTION_1,"(1/3)");
        values.put(Parameters.OPTION_2,"(1/8)");
        values.put(Parameters.OPTION_3,"(2/8)");
        values.put(Parameters.OPTION_4,"(1/16)");
        values.put(Parameters.ANSWER,"(1/8)");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,3);
        values.put(Parameters.QUESTION,"Look at this series: 22, 21, 23, 22, 24, 23, ... What number should come next?");
        values.put(Parameters.OPTION_1,"22");
        values.put(Parameters.OPTION_2,"24");
        values.put(Parameters.OPTION_3,"25");
        values.put(Parameters.OPTION_4,"26");
        values.put(Parameters.ANSWER,"25");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,4);
        values.put(Parameters.QUESTION,"Look at this series: 58, 52, 46, 40, 34, ... What number should come next?");
        values.put(Parameters.OPTION_1,"26");
        values.put(Parameters.OPTION_2,"28");
        values.put(Parameters.OPTION_3,"30");
        values.put(Parameters.OPTION_4,"32");
        values.put(Parameters.ANSWER,"28");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,5);
        values.put(Parameters.QUESTION,"Look at this series: 8, 22, 8, 28, 8, ... What number should come next?");
        values.put(Parameters.OPTION_1,"9");
        values.put(Parameters.OPTION_2,"29");
        values.put(Parameters.OPTION_3,"32");
        values.put(Parameters.OPTION_4,"34");
        values.put(Parameters.ANSWER,"34");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,6);
        values.put(Parameters.QUESTION,"Look at this series: 201, 202, 204, 207, ... What number should come next?");
        values.put(Parameters.OPTION_1,"205");
        values.put(Parameters.OPTION_2,"208");
        values.put(Parameters.OPTION_3,"210");
        values.put(Parameters.OPTION_4,"211");
        values.put(Parameters.ANSWER,"211");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,7);
        values.put(Parameters.QUESTION,"Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?");
        values.put(Parameters.OPTION_1,"7");
        values.put(Parameters.OPTION_2,"10");
        values.put(Parameters.OPTION_3,"12");
        values.put(Parameters.OPTION_4,"13");
        values.put(Parameters.ANSWER,"10");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,8);
        values.put(Parameters.QUESTION,"Look at this series: 3, 4, 7, 8, 11, 12, ... What number should come next?");
        values.put(Parameters.OPTION_1,"7");
        values.put(Parameters.OPTION_2,"10");
        values.put(Parameters.OPTION_3,"14");
        values.put(Parameters.OPTION_4,"15");
        values.put(Parameters.ANSWER,"15");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,9);
        values.put(Parameters.QUESTION,"Look at this series: 14, 28, 20, 40, 32, 64, ... What number should come next?");
        values.put(Parameters.OPTION_1,"52");
        values.put(Parameters.OPTION_2,"56");
        values.put(Parameters.OPTION_3,"96");
        values.put(Parameters.OPTION_4,"128");
        values.put(Parameters.ANSWER,"56");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,10);
        values.put(Parameters.QUESTION,"Look at this series: 80, 10, 70, 15, 60, ... What number should come next?");
        values.put(Parameters.OPTION_1,"20");
        values.put(Parameters.OPTION_2,"25");
        values.put(Parameters.OPTION_3,"30");
        values.put(Parameters.OPTION_4,"50");
        values.put(Parameters.ANSWER,"20");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
        Log.d("abc", "questions added");

    }

    public void addNumberSeriesSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO,1);
        values.put(Parameters.QUESTION,"10, 100, 200, 310, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"400");
        values.put(Parameters.OPTION_2,"410");
        values.put(Parameters.OPTION_3,"420");
        values.put(Parameters.OPTION_4,"430");
        values.put(Parameters.ANSWER,"430");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,2);
        values.put(Parameters.QUESTION,"28, 33, 31, 36, ?, 39 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"32");
        values.put(Parameters.OPTION_2,"34");
        values.put(Parameters.OPTION_3,"38");
        values.put(Parameters.OPTION_4,"40");
        values.put(Parameters.ANSWER,"34");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,3);
        values.put(Parameters.QUESTION,"125, 80, 45, 20, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"5");
        values.put(Parameters.OPTION_2,"8");
        values.put(Parameters.OPTION_3,"10");
        values.put(Parameters.OPTION_4,"12");
        values.put(Parameters.ANSWER,"5");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,4);
        values.put(Parameters.QUESTION,"1, 5, 13, 25, 41, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"51");
        values.put(Parameters.OPTION_2,"57");
        values.put(Parameters.OPTION_3,"61");
        values.put(Parameters.OPTION_4,"63");
        values.put(Parameters.ANSWER,"61");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,5);
        values.put(Parameters.QUESTION,"0.5, 0.55, 0.65, 0.8, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"0.9");
        values.put(Parameters.OPTION_2,"0.82");
        values.put(Parameters.OPTION_3,"1");
        values.put(Parameters.OPTION_4,"0.95");
        values.put(Parameters.ANSWER,"1");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,6);
        values.put(Parameters.QUESTION,"1, 1, 2, 6, 24, ?, 720 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"100");
        values.put(Parameters.OPTION_2,"104");
        values.put(Parameters.OPTION_3,"108");
        values.put(Parameters.OPTION_4,"120");
        values.put(Parameters.ANSWER,"120");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,7);
        values.put(Parameters.QUESTION,"6, 12, 21, ?, 48 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"33");
        values.put(Parameters.OPTION_2,"38");
        values.put(Parameters.OPTION_3,"40");
        values.put(Parameters.OPTION_4,"45");
        values.put(Parameters.ANSWER,"33");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,8);
        values.put(Parameters.QUESTION,"24, 60, 120, 210, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"300");
        values.put(Parameters.OPTION_2,"336");
        values.put(Parameters.OPTION_3,"420");
        values.put(Parameters.OPTION_4,"525");
        values.put(Parameters.ANSWER,"336");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,9);
        values.put(Parameters.QUESTION,"2, 15, 41, 80, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"111");
        values.put(Parameters.OPTION_2,"120");
        values.put(Parameters.OPTION_3,"121");
        values.put(Parameters.OPTION_4,"132");
        values.put(Parameters.ANSWER,"132");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,10);
        values.put(Parameters.QUESTION,"6, 17, 39, 72, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"83");
        values.put(Parameters.OPTION_2,"94");
        values.put(Parameters.OPTION_3,"116");
        values.put(Parameters.OPTION_4,"127");
        values.put(Parameters.ANSWER,"83");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addNumberSeriesSet3(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO,1);
        values.put(Parameters.QUESTION,"165, 195, 255, 285, 345, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"375");
        values.put(Parameters.OPTION_2,"390");
        values.put(Parameters.OPTION_3,"420");
        values.put(Parameters.OPTION_4,"435");
        values.put(Parameters.ANSWER,"435");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,2);
        values.put(Parameters.QUESTION,"2, 3, 3, 5, 10, 13, ?, 43, 172, 177 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"23");
        values.put(Parameters.OPTION_2,"38");
        values.put(Parameters.OPTION_3,"39");
        values.put(Parameters.OPTION_4,"40");
        values.put(Parameters.ANSWER,"39");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,3);
        values.put(Parameters.QUESTION,"5, 6, 9, 15, ?, 40 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"21");
        values.put(Parameters.OPTION_2,"25");
        values.put(Parameters.OPTION_3,"27");
        values.put(Parameters.OPTION_4,"33");
        values.put(Parameters.ANSWER,"25");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,4);
        values.put(Parameters.QUESTION,"1, 2, 6, 7, 21, 22, 66, 67, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"70");
        values.put(Parameters.OPTION_2,"134");
        values.put(Parameters.OPTION_3,"201");
        values.put(Parameters.OPTION_4,"301");
        values.put(Parameters.ANSWER,"201");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,5);
        values.put(Parameters.QUESTION,"1, 9, 25, 49, ?, 121 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"64");
        values.put(Parameters.OPTION_2,"81");
        values.put(Parameters.OPTION_3,"91");
        values.put(Parameters.OPTION_4,"100");
        values.put(Parameters.ANSWER,"81");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,6);
        values.put(Parameters.QUESTION,"4, 7, 12, 19, 20, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"30");
        values.put(Parameters.OPTION_2,"36");
        values.put(Parameters.OPTION_3,"39");
        values.put(Parameters.OPTION_4,"49");
        values.put(Parameters.ANSWER,"39");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,7);
        values.put(Parameters.QUESTION,"2, 3, 8, 27, 112, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"226");
        values.put(Parameters.OPTION_2,"339");
        values.put(Parameters.OPTION_3,"452");
        values.put(Parameters.OPTION_4,"565");
        values.put(Parameters.ANSWER,"339");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,8);
        values.put(Parameters.QUESTION,"-10, -8, 6, 40, 102, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"105");
        values.put(Parameters.OPTION_2,"117");
        values.put(Parameters.OPTION_3,"216");
        values.put(Parameters.OPTION_4,"129");
        values.put(Parameters.ANSWER,"117 ");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,9);
        values.put(Parameters.QUESTION,"1, 30 5, 26, 9, 22, 13, 18, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"17");
        values.put(Parameters.OPTION_2,"22");
        values.put(Parameters.OPTION_3,"28");
        values.put(Parameters.OPTION_4,"19");
        values.put(Parameters.ANSWER,"17");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,10);
        values.put(Parameters.QUESTION,"14, 25, 47, 91, 179, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"255");
        values.put(Parameters.OPTION_2,"321");
        values.put(Parameters.OPTION_3,"355");
        values.put(Parameters.OPTION_4,"211");
        values.put(Parameters.ANSWER,"355");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addNumberSeriesSet4(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO,1);
        values.put(Parameters.QUESTION,"4, 10, ?, 82, 244, 730 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"24");
        values.put(Parameters.OPTION_2,"28");
        values.put(Parameters.OPTION_3,"77");
        values.put(Parameters.OPTION_4,"218");
        values.put(Parameters.ANSWER,"28");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,2);
        values.put(Parameters.QUESTION,"5760, 960, ?, 48, 16, 8 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"120");
        values.put(Parameters.OPTION_2,"160");
        values.put(Parameters.OPTION_3,"192");
        values.put(Parameters.OPTION_4,"240");
        values.put(Parameters.ANSWER,"192");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,3);
        values.put(Parameters.QUESTION,"198, 194, 185, 169, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"92");
        values.put(Parameters.OPTION_2,"112");
        values.put(Parameters.OPTION_3,"136");
        values.put(Parameters.OPTION_4,"144");
        values.put(Parameters.ANSWER,"144");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,4);
        values.put(Parameters.QUESTION,"2, 3, 8, 27, 112, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"226");
        values.put(Parameters.OPTION_2,"339");
        values.put(Parameters.OPTION_3,"452");
        values.put(Parameters.OPTION_4,"565");
        values.put(Parameters.ANSWER,"565");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,5);
        values.put(Parameters.QUESTION,"5, 6, 9, 15, ?, 40 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"21");
        values.put(Parameters.OPTION_2,"25");
        values.put(Parameters.OPTION_3,"27");
        values.put(Parameters.OPTION_4,"33");
        values.put(Parameters.ANSWER,"25");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,6);
        values.put(Parameters.QUESTION,"325, 259, 204, 160, 127, 105, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"94");
        values.put(Parameters.OPTION_2,"96");
        values.put(Parameters.OPTION_3,"98");
        values.put(Parameters.OPTION_4,"100");
        values.put(Parameters.ANSWER,"94");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,7);
        values.put(Parameters.QUESTION,"1, 125, 729, 2177 ... Find out the wrong number.");
        values.put(Parameters.OPTION_1,"2177");
        values.put(Parameters.OPTION_2,"729");
        values.put(Parameters.OPTION_3,"125");
        values.put(Parameters.OPTION_4,"1");
        values.put(Parameters.ANSWER,"2177");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,8);
        values.put(Parameters.QUESTION,"10, 5, 19, 12, 39, 26, 73, 54 ... Find out the wrong number.");
        values.put(Parameters.OPTION_1,"5");
        values.put(Parameters.OPTION_2,"19");
        values.put(Parameters.OPTION_3,"39");
        values.put(Parameters.OPTION_4,"26");
        values.put(Parameters.ANSWER,"39");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,9);
        values.put(Parameters.QUESTION,"1, 10, 9, 16, 25, 26, 49 ... Find out the wrong number.");
        values.put(Parameters.OPTION_1,"1");
        values.put(Parameters.OPTION_2,"16");
        values.put(Parameters.OPTION_3,"26");
        values.put(Parameters.OPTION_4,"9");
        values.put(Parameters.ANSWER,"16");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,10);
        values.put(Parameters.QUESTION,"3, 12, 8, 19, 13, 32, 18, 42, 23, 52 ... Find out the wrong number.");
        values.put(Parameters.OPTION_1,"12");
        values.put(Parameters.OPTION_2,"19");
        values.put(Parameters.OPTION_3,"42");
        values.put(Parameters.OPTION_4,"32");
        values.put(Parameters.ANSWER,"19");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addNumberSeriesSet5(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO,1);
        values.put(Parameters.QUESTION,"2, 3, 3, 5, 10, 13, ?, 43, 172, 177 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"23");
        values.put(Parameters.OPTION_2,"38");
        values.put(Parameters.OPTION_3,"39");
        values.put(Parameters.OPTION_4,"40");
        values.put(Parameters.ANSWER,"39");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,2);
        values.put(Parameters.QUESTION,"3, 15, ?, 63, 99, 143 ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"27");
        values.put(Parameters.OPTION_2,"35");
        values.put(Parameters.OPTION_3,"45");
        values.put(Parameters.OPTION_4,"56");
        values.put(Parameters.ANSWER,"35");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,3);
        values.put(Parameters.QUESTION,"7, 26, 63, 124, 215, 342, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"");
        values.put(Parameters.OPTION_2,"");
        values.put(Parameters.OPTION_3,"");
        values.put(Parameters.OPTION_4,"");
        values.put(Parameters.ANSWER,"");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,4);
        values.put(Parameters.QUESTION,"6, 13, 25, 51, 101, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"201");
        values.put(Parameters.OPTION_2,"202");
        values.put(Parameters.OPTION_3,"203");
        values.put(Parameters.OPTION_4,"205");
        values.put(Parameters.ANSWER,"203");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,5);
        values.put(Parameters.QUESTION,"6, 13, 28, 59, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"111");
        values.put(Parameters.OPTION_2,"113");
        values.put(Parameters.OPTION_3,"114");
        values.put(Parameters.OPTION_4,"122");
        values.put(Parameters.ANSWER,"122");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,6);
        values.put(Parameters.QUESTION,"1, 5, 14, 30, 55, 91,? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"");
        values.put(Parameters.OPTION_2,"");
        values.put(Parameters.OPTION_3,"");
        values.put(Parameters.OPTION_4,"");
        values.put(Parameters.ANSWER,"");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,7);
        values.put(Parameters.QUESTION,"2, 7, 27, 107, 427, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"1262");
        values.put(Parameters.OPTION_2,"1707");
        values.put(Parameters.OPTION_3,"4027");
        values.put(Parameters.OPTION_4,"4207");
        values.put(Parameters.ANSWER,"1707");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,8);
        values.put(Parameters.QUESTION,"2, 2, 5, 13, 28, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"49");
        values.put(Parameters.OPTION_2,"50");
        values.put(Parameters.OPTION_3,"51");
        values.put(Parameters.OPTION_4,"52");
        values.put(Parameters.ANSWER,"52");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,9);
        values.put(Parameters.QUESTION,"3, 7, 23, 95, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"62");
        values.put(Parameters.OPTION_2,"128");
        values.put(Parameters.OPTION_3,"479");
        values.put(Parameters.OPTION_4,"575");
        values.put(Parameters.ANSWER,"479");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO,10);
        values.put(Parameters.QUESTION,"9, 27, 31, 155, 161, 1127, ? ... Find what number would come in place of the question mark(?).");
        values.put(Parameters.OPTION_1,"316");
        values.put(Parameters.OPTION_2,"1135");
        values.put(Parameters.OPTION_3,"1288");
        values.put(Parameters.OPTION_4,"2254");
        values.put(Parameters.ANSWER,"1135");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addArtificialLanguageSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "bluftok means blue sky\n" +
                "nokbluft means sky blue\n" +
                "okbluftme means blue sky morning\n" +
                "What could “mebluftok” mean?");
        values.put(Parameters.OPTION_1, "blue sky");
        values.put(Parameters.OPTION_2, "sky blue");
        values.put(Parameters.OPTION_3, "morning sky");
        values.put(Parameters.OPTION_4, "blue morning");
        values.put(Parameters.ANSWER, "blue morning");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "zopixngor means bright ceiling\n" +
                "gorblpixn means fan bright\n" +
                "arthzopixn means bright tile\n" +
                "What could “arthgorbl” mean?");
        values.put(Parameters.OPTION_1, "bright fan");
        values.put(Parameters.OPTION_2, "tile fan");
        values.put(Parameters.OPTION_3, "ceiling bright");
        values.put(Parameters.OPTION_4, "bright tile");
        values.put(Parameters.ANSWER, "bright tile");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "pluj means bright sun\n" +
                "tulpluj means sunflower\n" +
                "tugap means rain dance\n" +
                "What could “tugappluj” mean?");
        values.put(Parameters.OPTION_1, "bright rain");
        values.put(Parameters.OPTION_2, "sunflower dance");
        values.put(Parameters.OPTION_3, "rain sun");
        values.put(Parameters.OPTION_4, "dance flower");
        values.put(Parameters.ANSWER, "bright rain");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "glimwop means red apple\n" +
                "wopzit means apple pie\n" +
                "zitglim means\n" +
                "zitglim means red pie\n" +
                "What could “wopzitglim” mean?");
        values.put(Parameters.OPTION_1, "red pie");
        values.put(Parameters.OPTION_2, "apple red");
        values.put(Parameters.OPTION_3, "apple pie");
        values.put(Parameters.OPTION_4, "pie apple");
        values.put(Parameters.ANSWER, "apple pie");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "granzotl means heavy rain\n" +
                "zotlmag means rainforest\n" +
                "maggranz means heavy forest\n" +
                "What could “magzotl” mean?");
        values.put(Parameters.OPTION_1, "heavy forest");
        values.put(Parameters.OPTION_2, "forest rain");
        values.put(Parameters.OPTION_3, "heavy rainforest");
        values.put(Parameters.OPTION_4, "rainforest heavy");
        values.put(Parameters.ANSWER, "heavy rainforest");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "spoflur means green grass\n" +
                "flurblip means grasshopper\n" +
                "blipspof means greenhopper\n" +
                "What could “blipflur” mean?");
        values.put(Parameters.OPTION_1, "grass green");
        values.put(Parameters.OPTION_2, "hopper grasshopper");
        values.put(Parameters.OPTION_3, "green grasshopper");
        values.put(Parameters.OPTION_4, "grasshopper green");
        values.put(Parameters.ANSWER, "green grasshopper");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "plufur means white snow\n" +
                "furbot means snowflake\n" +
                "botplu means whiteflake\n" +
                "What could “botfur” mean?");
        values.put(Parameters.OPTION_1, "white snow");
        values.put(Parameters.OPTION_2, "flake white");
        values.put(Parameters.OPTION_3, "snow white");
        values.put(Parameters.OPTION_4, "snowflake");
        values.put(Parameters.ANSWER, "snowflake");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "zotlsh means rainwater\n" +
                "lshmerk means waterfall\n" +
                "qeozotl means snowfall\n" +
                "What could “merkqeozotl” mean?");
        values.put(Parameters.OPTION_1, "snowfall waterfall");
        values.put(Parameters.OPTION_2, "rainwater snowfall");
        values.put(Parameters.OPTION_3, "waterfall rainwater");
        values.put(Parameters.OPTION_4, "waterfall snowfall");
        values.put(Parameters.ANSWER, "waterfall snowfall");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "gorblflur means fan belt\n" +
                "pixngorbl means ceiling fan\n" +
                "arthtusl means tile roof\n" +
                "Which word could mean “ceiling tile”?");
        values.put(Parameters.OPTION_1, "gorbltusl");
        values.put(Parameters.OPTION_2, "flurgorbl");
        values.put(Parameters.OPTION_3, "arthflur");
        values.put(Parameters.OPTION_4, "pixnarth");
        values.put(Parameters.ANSWER, "gorbltusl");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "hapllesh means cloudburst\n" +
                "srenchoch means pinball\n" +
                "resbosrench means ninepin\n" +
                "Which word could mean \"cloud nine\"?");
        values.put(Parameters.OPTION_1, "leshsrench");
        values.put(Parameters.OPTION_2, "ochhapl");
        values.put(Parameters.OPTION_3, "haploch");
        values.put(Parameters.OPTION_4, "haplresbo");
        values.put(Parameters.ANSWER, "haplresbo");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addArtificialLanguageSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "agnoscrenia means poisonous spider\n" +
                "delanocrenia means poisonous snake\n" +
                "agnosdeery means brown spider\n" +
                "Which word could mean \"black widow spider\"?");
        values.put(Parameters.OPTION_1, "deeryclostagnos");
        values.put(Parameters.OPTION_2, "agnosdelano");
        values.put(Parameters.OPTION_3, "agnosvitriblunin");
        values.put(Parameters.OPTION_4, "trymuttiagnos");
        values.put(Parameters.ANSWER, "agnosvitriblunin");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "moolokarn means blue sky\n" +
                "wilkospadi means bicycle race\n" +
                "moolowilko means blue bicycle\n" +
                "Which word could mean \"racecar\"?");
        values.put(Parameters.OPTION_1, "wilkozwet");
        values.put(Parameters.OPTION_2, "spadiwilko");
        values.put(Parameters.OPTION_3, "moolobreil");
        values.put(Parameters.OPTION_4, "spadivolo");
        values.put(Parameters.ANSWER, "spadivolo");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "migenlasan means cupboard\n" +
                "lasanpoen means boardwalk\n" +
                "cuopdansa means pullman\n" +
                "Which word could mean \"walkway\"?");
        values.put(Parameters.OPTION_1, "poenmigen");
        values.put(Parameters.OPTION_2, "cuopeisel");
        values.put(Parameters.OPTION_3, "lasandansa");
        values.put(Parameters.OPTION_4, "poenforc");
        values.put(Parameters.ANSWER, "poenforc");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "daftafoni means advisement\n" +
                "imodafta means misadvise\n" +
                "imolokti means misconduct\n" +
                "Which word could mean \"statement\"?");
        values.put(Parameters.OPTION_1, "kratafoni");
        values.put(Parameters.OPTION_2, "kratadafta");
        values.put(Parameters.OPTION_3, "loktifoni");
        values.put(Parameters.OPTION_4, "daftaimo");
        values.put(Parameters.ANSWER, "kratafoni");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "godabim means kidney stones\n" +
                "romzbim means kidney beans\n" +
                "romzbako means wax beans\n" +
                "Which word could mean \"wax statue\"?");
        values.put(Parameters.OPTION_1, "godaromz");
        values.put(Parameters.OPTION_2, "lazbim");
        values.put(Parameters.OPTION_3, "wasibako");
        values.put(Parameters.OPTION_4, "romzpeo");
        values.put(Parameters.ANSWER, "wasibako");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "granamelke means big tree\n" +
                "pinimelke means little tree\n" +
                "melkehoon means tree house\n" +
                "Which word could mean \"big house\"?");
        values.put(Parameters.OPTION_1, "granahoon");
        values.put(Parameters.OPTION_2, "pinishur");
        values.put(Parameters.OPTION_3, "pinihoon");
        values.put(Parameters.OPTION_4, "melkegrana");
        values.put(Parameters.ANSWER, "granahoon");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "slar means jump\n" +
                "slary means jumping\n" +
                "slarend means jumped\n" +
                "Which word could mean \"playing\"?");
        values.put(Parameters.OPTION_1, "clargslarend");
        values.put(Parameters.OPTION_2, "clargy");
        values.put(Parameters.OPTION_3, "ellaclarg");
        values.put(Parameters.OPTION_4, "slarmont");
        values.put(Parameters.ANSWER, "clargy");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "myncabel means saddle horse\n" +
                "conowir means trail ride\n" +
                "cabelalma means horse blanket\n" +
                "Which word could mean \"horse ride\"?");
        values.put(Parameters.OPTION_1, "cabelwir");
        values.put(Parameters.OPTION_2, "conocabel");
        values.put(Parameters.OPTION_3, "almamyn");
        values.put(Parameters.OPTION_4, "conoalma");
        values.put(Parameters.ANSWER, "cabelwir");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "tamceno means sky blue\n" +
                "cenorax means blue cheese\n" +
                "aplmitl means star bright\n" +
                "Which word could mean \"bright sky\"?");
        values.put(Parameters.OPTION_1, "cenotam");
        values.put(Parameters.OPTION_2, "mitltam");
        values.put(Parameters.OPTION_3, "raxmitl");
        values.put(Parameters.OPTION_4, "aplceno");
        values.put(Parameters.ANSWER, "mitltam");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "dionot means oak tree\n" +
                "blyonot means oak leaf\n" +
                "blycrin means maple leaf\n" +
                "Which word could mean \"maple syrup\"?");
        values.put(Parameters.OPTION_1, "blymuth");
        values.put(Parameters.OPTION_2, "hupponot");
        values.put(Parameters.OPTION_3, "patricrin");
        values.put(Parameters.OPTION_4, "crinweel");
        values.put(Parameters.ANSWER, "patricrin");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addCalenderSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "It was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?");
        values.put(Parameters.OPTION_1, "Sunday");
        values.put(Parameters.OPTION_2, "Saturday");
        values.put(Parameters.OPTION_3, "Friday");
        values.put(Parameters.OPTION_4, "Wednesday");
        values.put(Parameters.ANSWER, "Friday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "What was the day of the week on 17th June, 1998?");
        values.put(Parameters.OPTION_1, "Monday");
        values.put(Parameters.OPTION_2, "Tuesday");
        values.put(Parameters.OPTION_3, "Wednesday");
        values.put(Parameters.OPTION_4, "Thursday");
        values.put(Parameters.ANSWER, "Wednesday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "What will be the day of the week 15th August, 2010?");
        values.put(Parameters.OPTION_1, "Sunday");
        values.put(Parameters.OPTION_2, "Monday");
        values.put(Parameters.OPTION_3, "Tuesday");
        values.put(Parameters.OPTION_4, "Friday");
        values.put(Parameters.ANSWER, "Sunday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "Today is Monday. After 61 days, it will be:");
        values.put(Parameters.OPTION_1, "Wednesday");
        values.put(Parameters.OPTION_2, "Saturday");
        values.put(Parameters.OPTION_3, "Tuesday");
        values.put(Parameters.OPTION_4, "Thursday");
        values.put(Parameters.ANSWER, "Saturday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "On what dates of April, 2001 did Wednesday fall?");
        values.put(Parameters.OPTION_1, "1st, 8th, 15th, 22nd, 29th");
        values.put(Parameters.OPTION_2, "2nd, 9th, 16th, 23rd, 30th");
        values.put(Parameters.OPTION_3, "3rd, 10th, 17th, 24th");
        values.put(Parameters.OPTION_4, "4th, 11th, 18th, 25th");
        values.put(Parameters.ANSWER, "4th, 11th, 18th, 25th");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "How many days are there in x weeks x days?");
        values.put(Parameters.OPTION_1, "7x^2");
        values.put(Parameters.OPTION_2, "8x");
        values.put(Parameters.OPTION_3, "14x");
        values.put(Parameters.OPTION_4, "7");
        values.put(Parameters.ANSWER, "8x");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The last day of a century cannot be");
        values.put(Parameters.OPTION_1, "Monday");
        values.put(Parameters.OPTION_2, "Wednesday");
        values.put(Parameters.OPTION_3, "Tuesday");
        values.put(Parameters.OPTION_4, "Friday");
        values.put(Parameters.ANSWER, "Tuesday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "On 8th Feb, 2005 it was Tuesday. What was the day of the week on 8th Feb, 2004?");
        values.put(Parameters.OPTION_1, "Tuesday");
        values.put(Parameters.OPTION_2, "Monday");
        values.put(Parameters.OPTION_3, "Sunday");
        values.put(Parameters.OPTION_4, "Wednesday");
        values.put(Parameters.ANSWER, "Sunday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Which of the following is not a leap year?");
        values.put(Parameters.OPTION_1, "700");
        values.put(Parameters.OPTION_2, "800");
        values.put(Parameters.OPTION_3, "1200");
        values.put(Parameters.OPTION_4, "2000");
        values.put(Parameters.ANSWER, "700");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "January 1, 2007 was Monday. What day of the week lies on Jan. 1, 2008?");
        values.put(Parameters.OPTION_1, "Monday");
        values.put(Parameters.OPTION_2, "Tuesday");
        values.put(Parameters.OPTION_3, "Wednesday");
        values.put(Parameters.OPTION_4, "Sunday");
        values.put(Parameters.ANSWER, "Tuesday");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addBloodRelationsSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A is B's sister. C is B's mother. D is C's father. E is D's mother. Then, how is A related to D?");
        values.put(Parameters.OPTION_1, "Grandfather");
        values.put(Parameters.OPTION_2, "Grandmother");
        values.put(Parameters.OPTION_3, "Daughter");
        values.put(Parameters.OPTION_4, " Granddaughter");
        values.put(Parameters.ANSWER, " Granddaughter");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A girl introduced a boy as the son of' the daughter of the father of her uncle. The boy is girl's ");
        values.put(Parameters.OPTION_1, "Brother");
        values.put(Parameters.OPTION_2, "Son");
        values.put(Parameters.OPTION_3, "Uncle");
        values.put(Parameters.OPTION_4, "Son-in-law");
        values.put(Parameters.ANSWER, "Brother");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "Pointing to a person, a man said to a woman, \"His mother is the only daughter of your father.\" How was the woman related to the person ? ");
        values.put(Parameters.OPTION_1, "Aunt");
        values.put(Parameters.OPTION_2, "Mother");
        values.put(Parameters.OPTION_3, "Wife");
        values.put(Parameters.OPTION_4, "Daughter");
        values.put(Parameters.ANSWER, "Aunt");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "A and B are a married couple, A being the male member. D is the only son of C, who is the brother of A. E is the sister of D. B is the daughter-in-law of F, whose husband has died. How is E related to C ? ");
        values.put(Parameters.OPTION_1, "Sister");
        values.put(Parameters.OPTION_2, "Daughter");
        values.put(Parameters.OPTION_3, "Cousin");
        values.put(Parameters.OPTION_4, "Mother");
        values.put(Parameters.ANSWER, "Daughter");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A woman introduces a man as the son of the brother of her mother. How is the man, related to the woman ? ");
        values.put(Parameters.OPTION_1, "Nephew");
        values.put(Parameters.OPTION_2, "Son");
        values.put(Parameters.OPTION_3, "Cousin");
        values.put(Parameters.OPTION_4, "Uncle to Grandson");
        values.put(Parameters.ANSWER, "Cousin");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "P is the brother of Q and R. S is R's mother. T is P's father. Which of the following statements cannot be definitely true ? ");
        values.put(Parameters.OPTION_1, "T is Q's father");
        values.put(Parameters.OPTION_2, "S is P's mother");
        values.put(Parameters.OPTION_3, "P is S's son");
        values.put(Parameters.OPTION_4, "Q is T's son");
        values.put(Parameters.ANSWER, "Q is T's son");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "There are six persons A. B, C, D, E and F. C is the sister of F. B is the brother of E's husband. D is the father of A and grandfather of F. There are two fathers, three brothers and a mother in the group. Who is the mother ?");
        values.put(Parameters.OPTION_1, "A");
        values.put(Parameters.OPTION_2, "B");
        values.put(Parameters.OPTION_3, "C");
        values.put(Parameters.OPTION_4, "E");
        values.put(Parameters.ANSWER, "E");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Pointing out to a lady, a girl said, \"She is the daughter-in-law of the grandmother of my father's only son.\" How is the lady related to the girl ?");
        values.put(Parameters.OPTION_1, "Sister-in-law");
        values.put(Parameters.OPTION_2, "Mother");
        values.put(Parameters.OPTION_3, "Aunt");
        values.put(Parameters.OPTION_4, "Can't be determined");
        values.put(Parameters.ANSWER, "Can't be determined");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Introducing a man, a woman said, 'He is the only son of my mother's mother.\" How is the woman related to the man ?  ");
        values.put(Parameters.OPTION_1, "Mother");
        values.put(Parameters.OPTION_2, "Aunt");
        values.put(Parameters.OPTION_3, "Sister");
        values.put(Parameters.OPTION_4, "Niece");
        values.put(Parameters.ANSWER, "Niece");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Q is the brother of R;\n" +
                "P is the sister of Q;\n" +
                "T is the brother of S;\n" +
                "S is the daughter of R.\n" +
                "Who are the cousins of Q ? ");
        values.put(Parameters.OPTION_1, "R and P");
        values.put(Parameters.OPTION_2, "P and T");
        values.put(Parameters.OPTION_3, "Q and T");
        values.put(Parameters.OPTION_4, "S and T");
        values.put(Parameters.ANSWER, "S and T");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addBloodRelationsSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "Rita told Mani, \"The girl I met yesterday at the beach was the youngest daughter of the brother-in-law of my friend's mother.\" How is the girl related to Rita's friend ?");
        values.put(Parameters.OPTION_1, "Cousin");
        values.put(Parameters.OPTION_2, "Daughter");
        values.put(Parameters.OPTION_3, "Niece");
        values.put(Parameters.OPTION_4, "Friend");
        values.put(Parameters.ANSWER, "Cousin");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Pointing to an old man, Kailash said, \"His son is my son's uncle.\" How is the old man related to Kailash ? ");
        values.put(Parameters.OPTION_1, "Brother");
        values.put(Parameters.OPTION_2, "Uncle");
        values.put(Parameters.OPTION_3, "Father");
        values.put(Parameters.OPTION_4, "Grandfather");
        values.put(Parameters.ANSWER, "Father");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "A, B, C, D, E, F and G are members of a family consisting of four adults and three children, two of whom, F and G are girls. A and D are brothers and A is a doctor. E is an engineer married to one of the brothers and has two children. if is married to D and G is their child. Who is C ? ");
        values.put(Parameters.OPTION_1, "A's son");
        values.put(Parameters.OPTION_2, "E's daughter");
        values.put(Parameters.OPTION_3, "F's father");
        values.put(Parameters.OPTION_4, "G's brother");
        values.put(Parameters.ANSWER, "A's son");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "In a family, there are six members A, B, C, D, E and F. \n" +
                "A and B are a married couple, A being the male member. D is the only son of C, who is the brother of A. E is the sister of D. B is the daughter-in-law of F, whose husband has died. \n" +
                "How many male members are there in the family ?");
        values.put(Parameters.OPTION_1, "1");
        values.put(Parameters.OPTION_2, "2");
        values.put(Parameters.OPTION_3, "3");
        values.put(Parameters.OPTION_4, "4");
        values.put(Parameters.ANSWER, "3");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A woman going with a boy is asked by another woman about their relationship between them. The woman replied, \"My maternal Uncle and the uncle of his maternal uncle is the same\". How is the lady related with that boy?");
        values.put(Parameters.OPTION_1, "Grandmother and Grandson");
        values.put(Parameters.OPTION_2, "Mother and Son");
        values.put(Parameters.OPTION_3, "Aunt and Nephew");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "Aunt and Nephew");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "If 'A $ B' means 'A is brother of B', 'A @ B'means 'A is wife of B', 'A # B' means 'A is daughter of B' and 'A & B'means 'A is father of B', then which of the following expressions indicates the relationship 'K' is father-in-law of H'? ");
        values.put(Parameters.OPTION_1, "H @ J $ L # P & K");
        values.put(Parameters.OPTION_2, "H @ J $ P & L # K");
        values.put(Parameters.OPTION_3, "H @ J $ L # K & P");
        values.put(Parameters.OPTION_4, "H @ P $ J & L # K");
        values.put(Parameters.ANSWER, "H @ J $ L # K & P");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Pointing to a photograph, a man said, \"I have no brother or sister but that man’s father is my father’s son.\" Whose photograph was it?");
        values.put(Parameters.OPTION_1, "His uncle's");
        values.put(Parameters.OPTION_2, "His nephew's");
        values.put(Parameters.OPTION_3, "His son's");
        values.put(Parameters.OPTION_4, "His Cousin's");
        values.put(Parameters.ANSWER, "His son's");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "If A + B means A is the mother of B; A - B means A is the brother B; A % B means A is the father of B and A x B means A is the sister of B, which of the following shows that P is the maternal uncle of Q?");
        values.put(Parameters.OPTION_1, "Q - N + M x P");
        values.put(Parameters.OPTION_2, "P + S x N - Q");
        values.put(Parameters.OPTION_3, "P - M + N x Q");
        values.put(Parameters.OPTION_4, "Q - S % P");
        values.put(Parameters.ANSWER, "P - M + N x Q");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "If A + B means A is the brother of B; A - B means A is the sister of B and A x B means A is the father of B. Which of the following means that C is the son of M?");
        values.put(Parameters.OPTION_1, "M - N x C + F");
        values.put(Parameters.OPTION_2, "F - C + N x M");
        values.put(Parameters.OPTION_3, "N + M - F x C");
        values.put(Parameters.OPTION_4, "M x N - C + F");
        values.put(Parameters.ANSWER, "M x N - C + F");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "If P $ Q means P is the brother of Q; P # Q means P is the mother of Q; P * Q means P is the daughter of Q in A # B $ C * D, who is the father?");
        values.put(Parameters.OPTION_1, "D");
        values.put(Parameters.OPTION_2, "B");
        values.put(Parameters.OPTION_3, "C");
        values.put(Parameters.OPTION_4, "Data is inadequate");
        values.put(Parameters.ANSWER, "D");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addBloodRelationsSet3(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A3P means A is the mother of P\n" +
                "A4P means A is the brother of P\n" +
                "A9P means A is the husband of P\n" +
                "A5P means A is the daughter of P\n" +
                "Which of the following means that K is the mother-in-law of M?");
        values.put(Parameters.OPTION_1, "M9N3K4J");
        values.put(Parameters.OPTION_2, "M9N5K3J");
        values.put(Parameters.OPTION_3, "K5J9M3N");
        values.put(Parameters.OPTION_4, "K3J9N4M");
        values.put(Parameters.ANSWER, "M9N5K3J");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "B5D means B is the father of D.\n" +
                "B9D means B is the sister of D.\n" +
                "B4D means B is the brother of D.\n" +
                "B3D means B is the wife of D.\n" +
                "Which of the following means F is the mother of K?");
        values.put(Parameters.OPTION_1, "F3M5K");
        values.put(Parameters.OPTION_2, "F5M3K");
        values.put(Parameters.OPTION_3, "F9M4N3K");
        values.put(Parameters.OPTION_4, "F3M5N3K");
        values.put(Parameters.ANSWER, "F3M5K");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "A * B means A is the sister of B\n" +
                "A $ B means B is the mother of A\n" +
                "A + B means A is the brother of B\n" +
                "A = B means B is the father of A.\n" +
                "Which of the following means M is the maternal uncle of N?");
        values.put(Parameters.OPTION_1, "M = P + Q * N");
        values.put(Parameters.OPTION_2, "N + P = Q * M");
        values.put(Parameters.OPTION_3, "N * P $ Q * M");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "None of these");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "If M x N means M is the daughter of N; M + N means M is the father of N; M % N means M is the mother of N and M - N means M is the brother of N then P % Q + R - T x K indicates which relation of P to K?");
        values.put(Parameters.OPTION_1, "Daughter-in-law");
        values.put(Parameters.OPTION_2, "Sister-in-law");
        values.put(Parameters.OPTION_3, "Aunt");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "None of these");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A is the son of C; C and Q are sisters; Z is the mother of Q and P is the son of Z. Which of the following statements is true?");
        values.put(Parameters.OPTION_1, "P and A are cousins");
        values.put(Parameters.OPTION_2, "P is the maternal uncle of A");
        values.put(Parameters.OPTION_3, "Q is the maternal grandfather of A");
        values.put(Parameters.OPTION_4, "C and P are sisters");
        values.put(Parameters.ANSWER, "P is the maternal uncle of A");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "If X + Y means X is the daughter of Y; X - Y means X is the brother of Y; X % Y means X is the father of Y and X x Y means X is the sister of Y. Which of the following means I is the niece of J?");
        values.put(Parameters.OPTION_1, "J - N % C x I");
        values.put(Parameters.OPTION_2, "I x C - N % J");
        values.put(Parameters.OPTION_3, "J + M x C % I");
        values.put(Parameters.OPTION_4, "I x C + N - J");
        values.put(Parameters.ANSWER, "I x C + N - J");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "A + B means A is the mother of B.\n" +
                "A - B means A is the sister of B.\n" +
                "A * B means A is the father of B.\n" +
                "A β B means A is the brother of B.\n" +
                "Which of the following means Q is the grandfather of P?");
        values.put(Parameters.OPTION_1, "P + N * M * Q");
        values.put(Parameters.OPTION_2, "Q * N * M + P");
        values.put(Parameters.OPTION_3, "Q β M β N * P");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "None of these");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "M % N means M is the son of N.\n" +
                "M @ N means M is the sister of N.\n" +
                "M $ N means M is the father of N.\n" +
                "Which of the following shows the relation that C is the granddaughter of E?");
        values.put(Parameters.OPTION_1, "C % B $ F $ E");
        values.put(Parameters.OPTION_2, "B $ F $ E % C");
        values.put(Parameters.OPTION_3, "C @ B % F % E");
        values.put(Parameters.OPTION_4, "E % B $ F $ C");
        values.put(Parameters.ANSWER, "C @ B % F % E");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Veena who is the sister-in-law of Ashok, is the daughter-in-law of Kalyani. Dheeraj is the father of Sudeep who is the only brother of Ashok. How Kalyani is related to Ashok?");
        values.put(Parameters.OPTION_1, "Mother-in-law");
        values.put(Parameters.OPTION_2, "Aunt");
        values.put(Parameters.OPTION_3, "Wife");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "None of these");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Pointing to Varman, Madhav said, \"I am the only son of one of the sons of his father.\" How is Varman related to Madhav?");
        values.put(Parameters.OPTION_1, "Nephew");
        values.put(Parameters.OPTION_2, "Uncle");
        values.put(Parameters.OPTION_3, "Father or Uncle");
        values.put(Parameters.OPTION_4, "Father");
        values.put(Parameters.ANSWER, "Father or Uncle");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addDirectionSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "Ajay walks 24 km towards East and turns to right hand side and takes a drive of another 10 km. He then turning to his right (drives towards West) another 10 km. He then turns to his left & walks another 8 km. After that, he turns to his right & travels 14 km. How far is he from his initial point & in which direction?");
        values.put(Parameters.OPTION_1, "20 km East");
        values.put(Parameters.OPTION_2, "18 km south");
        values.put(Parameters.OPTION_3, "16 km West");
        values.put(Parameters.OPTION_4, "10 km South");
        values.put(Parameters.ANSWER, "18 km south");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Raju walks 80 ms towards south. Then, turns to his right & starts walking straight till he completes another 80 ms. Then, again turning to his left he walks for 60 metres. He then turns to his left & walks for 80 metres. How far is he from his initial position?");
        values.put(Parameters.OPTION_1, "100 metres");
        values.put(Parameters.OPTION_2, "60 metres");
        values.put(Parameters.OPTION_3, "120 metres");
        values.put(Parameters.OPTION_4, "140 meters");
        values.put(Parameters.ANSWER, "140 meters");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "Varun drove his car for 80 kms due North. Then he turned left and drove for 100 kms. Again he turned left & drove yet another 80 kms. Again he turned left and drove his car 120 kms. How far do you think he actually drove his car from the initial position?");
        values.put(Parameters.OPTION_1, "20 kms");
        values.put(Parameters.OPTION_2, "100 kms");
        values.put(Parameters.OPTION_3, "60 kms");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "20 kms");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "Sandeep walks 60m to the east, then he turns left and walks for 50 m, then turns right and went 70 m and then turns right again and went 50 m. How far was Sandeep from the starting point?");
        values.put(Parameters.OPTION_1, "90 m");
        values.put(Parameters.OPTION_2, "70 m");
        values.put(Parameters.OPTION_3, "50 m");
        values.put(Parameters.OPTION_4, "130 m");
        values.put(Parameters.ANSWER, "130 m");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "One morning after sunrise, Amrit was standing facing a pole. The shadow of the pole was forming on the left side. Which direction was Amrit facing?");
        values.put(Parameters.OPTION_1, "East");
        values.put(Parameters.OPTION_2, "West");
        values.put(Parameters.OPTION_3, "North");
        values.put(Parameters.OPTION_4, "South");
        values.put(Parameters.ANSWER, "North");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "One evening just before sunset two friends Sanju and Manju were talking to each other face to face. If Manju’s shadow was exactly to her left side, which direction was Sanju facing?");
        values.put(Parameters.OPTION_1, "North");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "West");
        values.put(Parameters.OPTION_4, "Data inadequate");
        values.put(Parameters.ANSWER, "North");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "In the evening, Ashmita started walking positioning his back towards the sun. After sometime, she turned left, then turned right and then towards the left again. In which direction is she going now?");
        values.put(Parameters.OPTION_1, "North");
        values.put(Parameters.OPTION_2, "East");
        values.put(Parameters.OPTION_3, "West");
        values.put(Parameters.OPTION_4, "South");
        values.put(Parameters.ANSWER, "North");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "I drove 50 km towards east from a city ‘S’ and then turned right and drove another 30 km. Now I turned to my left & drove another 30 km. Finally I turned my right & drove 30 km to reach a city ‘F’. Find the shortest straight distance between cities S and F.");
        values.put(Parameters.OPTION_1, "20 km");
        values.put(Parameters.OPTION_2, "25 km");
        values.put(Parameters.OPTION_3, "40 km");
        values.put(Parameters.OPTION_4, "100 km");
        values.put(Parameters.ANSWER, "100 km");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Y is in the East of X which is in the North of Z. If P is in the South of Z, then in which direction of Y, is P?");
        values.put(Parameters.OPTION_1, "North");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "South-East");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "None of these");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "If South-East becomes North, North-East becomes West and so on. What will West become?");
        values.put(Parameters.OPTION_1, "North-East");
        values.put(Parameters.OPTION_2, "North-West");
        values.put(Parameters.OPTION_3, "South-East");
        values.put(Parameters.OPTION_4, "South-West");
        values.put(Parameters.ANSWER, "South-East");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addDirectionSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "Rahul put his timepiece on the table in such a way that at 6 P.M. hour hand points to North. In which direction the minute hand will point at 9.15 P.M. ?");
        values.put(Parameters.OPTION_1, "South-East");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "North");
        values.put(Parameters.OPTION_4, "West");
        values.put(Parameters.ANSWER, "West");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Starting from the point X, Jayant walked 15 m towards west. He turned left and walked 20 m. He then turned left and walked 15 m. After this he turned to his right and walked 12 m. How far and in which directions is now Jayant from X?");
        values.put(Parameters.OPTION_1, "32 m, South");
        values.put(Parameters.OPTION_2, "47 m, East");
        values.put(Parameters.OPTION_3, "42 m, North");
        values.put(Parameters.OPTION_4, "27 m, South");
        values.put(Parameters.ANSWER, "32 m, South");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "One evening before sunset Rekha and Hema were talking to each other face to face. If Hema's shadow was exactly to the right of Hema, which direction was Rekha facing?");
        values.put(Parameters.OPTION_1, "North");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "East");
        values.put(Parameters.OPTION_4, "Data is inadequate");
        values.put(Parameters.ANSWER, "South");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "One morning sujata started to walk towards the Sun. After covering some distance she turned to right then again to the right and after covering some distance she again turns to the right. Now in which direction is she facing?");
        values.put(Parameters.OPTION_1, "North");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "North-East");
        values.put(Parameters.OPTION_4, "South-West");
        values.put(Parameters.ANSWER, "North");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "Golu started from his house towards North. After covering a distance of 8 km. he turned towards left and covered a distance of 6 km. What is the shortest distance now from his house?");
        values.put(Parameters.OPTION_1, "10 km");
        values.put(Parameters.OPTION_2, "16 km");
        values.put(Parameters.OPTION_3, "14 km");
        values.put(Parameters.OPTION_4, "2 km");
        values.put(Parameters.ANSWER, "10 km");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "P started from his house towards west. After walking a distance of 25 m. He turned to the right and walked 10 m. He then again turned to the right and walked 15 m. After this he is to turn right at 135o and to cover 30 m. In which direction should he go?");
        values.put(Parameters.OPTION_1, "West");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "South-West");
        values.put(Parameters.OPTION_4, "South-East");
        values.put(Parameters.ANSWER, "South-West");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Reena walked from A to B in the East 10 feet. Then she turned to the right and walked 3 feet. Again she turned to the right and walked 14 feet. How far is she from A?");
        values.put(Parameters.OPTION_1, "4 feet");
        values.put(Parameters.OPTION_2, "5 feet");
        values.put(Parameters.OPTION_3, "24 feet");
        values.put(Parameters.OPTION_4, "27 feet");
        values.put(Parameters.ANSWER, "5 feet");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "One morning after sunrise, Suresh was standing facing a pole. The shadow of the pole fell exactly to his right. To which direction was he facing?");
        values.put(Parameters.OPTION_1, "East");
        values.put(Parameters.OPTION_2, "South");
        values.put(Parameters.OPTION_3, "West");
        values.put(Parameters.OPTION_4, "Data is inadequate");
        values.put(Parameters.ANSWER, "South");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Shyam walks 5 km towards East and then turns left and walks 6 km. Again he turns right and walks 9 km. Finally he turns to his right and walks 6 km. How far is he from the starting point?");
        values.put(Parameters.OPTION_1, "26 km");
        values.put(Parameters.OPTION_2, "21 km");
        values.put(Parameters.OPTION_3, "14 km");
        values.put(Parameters.OPTION_4, "9 km");
        values.put(Parameters.ANSWER, "14 km");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "From his house, Lokesh went 15 km to the North. Then he turned west and covered 10 km. Then he turned south and covered 5 km. Finally turning to the east, he covered 10 km. In which direction is he from his house?");
        values.put(Parameters.OPTION_1, "East");
        values.put(Parameters.OPTION_2, "West");
        values.put(Parameters.OPTION_3, "North");
        values.put(Parameters.OPTION_4, "South");
        values.put(Parameters.ANSWER, "North");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addSyllogismSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "");
        values.put(Parameters.OPTION_1, "");
        values.put(Parameters.OPTION_2, "");
        values.put(Parameters.OPTION_3, "");
        values.put(Parameters.OPTION_4, "");
        values.put(Parameters.ANSWER, "");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();

    }

    public void addAverageSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "What is the average of first five multiples of 12?");
        values.put(Parameters.OPTION_1, "36");
        values.put(Parameters.OPTION_2, "38");
        values.put(Parameters.OPTION_3, "40");
        values.put(Parameters.OPTION_4, "42");
        values.put(Parameters.ANSWER, "36");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Average of five numbers is 20. If each number is multiplied by 2, what will be the new average?");
        values.put(Parameters.OPTION_1, "30");
        values.put(Parameters.OPTION_2, "40");
        values.put(Parameters.OPTION_3, "50");
        values.put(Parameters.OPTION_4, "60");
        values.put(Parameters.ANSWER, "40");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "If the average of three consecutive even numbers is 34, find the largest of these numbers.");
        values.put(Parameters.OPTION_1, "30");
        values.put(Parameters.OPTION_2, "32");
        values.put(Parameters.OPTION_3, "34");
        values.put(Parameters.OPTION_4, "36");
        values.put(Parameters.ANSWER, "36");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "10 typists can type 600 pages in 8 hours.Find the average number of pages typed by each typist in an hour.");
        values.put(Parameters.OPTION_1, "7 pages");
        values.put(Parameters.OPTION_2, "7.5 pages");
        values.put(Parameters.OPTION_3, "8 pages");
        values.put(Parameters.OPTION_4, "8.5 pages");
        values.put(Parameters.ANSWER, "7.5 pages");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "The average of Sohan's marks in 6 subjects is 74. If his average in five subjects excluding science is 70, how many marks he obtained in science?");
        values.put(Parameters.OPTION_1, "94");
        values.put(Parameters.OPTION_2, "92");
        values.put(Parameters.OPTION_3, "90");
        values.put(Parameters.OPTION_4, "88");
        values.put(Parameters.ANSWER, "94");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "The average weight of 10 men is decreased by 2 kg when one of them whose weight is 60 kg is replaced by a new man. What is the weight of the new man?");
        values.put(Parameters.OPTION_1, "35 kg");
        values.put(Parameters.OPTION_2, "40 kg");
        values.put(Parameters.OPTION_3, "45 kg");
        values.put(Parameters.OPTION_4, "50 kg");
        values.put(Parameters.ANSWER, "40 kg");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Average age of a group of 30 boys is 16 years. A boy of age 19 leaves the group and a new boy joins the group. If the new average age of the group is 15.8 years, find the age of the new boy.");
        values.put(Parameters.OPTION_1, "12 years");
        values.put(Parameters.OPTION_2, "13 years");
        values.put(Parameters.OPTION_3, "14 years");
        values.put(Parameters.OPTION_4, "15 years");
        values.put(Parameters.ANSWER, "13 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "The average age of 30 boys in a class is 15 years. If we include the age of two teachers the average age increases by 1. Find the sum of ages of the two teachers.");
        values.put(Parameters.OPTION_1, "55 years");
        values.put(Parameters.OPTION_2, "58 years");
        values.put(Parameters.OPTION_3, "62 years");
        values.put(Parameters.OPTION_4, "64 years");
        values.put(Parameters.ANSWER, "62 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Four years ago, the average age of A and B was 20 years. If today average age of A, B and C is 25 years, what will be age of C after 7 years?");
        values.put(Parameters.OPTION_1, "32 years");
        values.put(Parameters.OPTION_2, "34 years");
        values.put(Parameters.OPTION_3, "36 years");
        values.put(Parameters.OPTION_4, "38 years");
        values.put(Parameters.ANSWER, "34 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "If the sum is 240 and average is 40, find the number of quantities.");
        values.put(Parameters.OPTION_1, "5");
        values.put(Parameters.OPTION_2, "8");
        values.put(Parameters.OPTION_3, "5");
        values.put(Parameters.OPTION_4, "6");
        values.put(Parameters.ANSWER, "6");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addAverageSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A group consists of two male, two female and three children. The average age of the male is 67 years, that of the female is 35 years, and that of the children is six years. What is the average age of the group?");
        values.put(Parameters.OPTION_1, "30.71");
        values.put(Parameters.OPTION_2, "31.71");
        values.put(Parameters.OPTION_3, "28.71");
        values.put(Parameters.OPTION_4, "35.45");
        values.put(Parameters.ANSWER, "31.71");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Mohan gets a salary of Rs. 6435, Rs. 6927, Rs. 6855, Rs. 7230 and Rs. 6562 for 5 months. How much salary he must have in the sixth month so that he gets an average of Rs. 6500?");
        values.put(Parameters.OPTION_1, "4091");
        values.put(Parameters.OPTION_2, "4991");
        values.put(Parameters.OPTION_3, "3499");
        values.put(Parameters.OPTION_4, "3344");
        values.put(Parameters.ANSWER, "4991");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "If the average of 20 numbers is zero, how many numbers may be greater than zero?");
        values.put(Parameters.OPTION_1, "19");
        values.put(Parameters.OPTION_2, "49");
        values.put(Parameters.OPTION_3, "17");
        values.put(Parameters.OPTION_4, "33");
        values.put(Parameters.ANSWER, "19");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "The average weight of 8 women increases by 2.5 kg when a new woman replaces one of them weighing 65 kg. Find the weight of the new woman.");
        values.put(Parameters.OPTION_1, "20");
        values.put(Parameters.OPTION_2, "85");
        values.put(Parameters.OPTION_3, "67");
        values.put(Parameters.OPTION_4, "80");
        values.put(Parameters.ANSWER, "85");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "The average monthly income of Rakesh and Suresh is Rs. 5050. The average monthly income of Suresh and Ramesh is Rs. 6250 and the average monthly income of Rakesh and Ramesh is Rs. 5200. What is the monthly income of Rakesh?");
        values.put(Parameters.OPTION_1, "3000");
        values.put(Parameters.OPTION_2, "6000");
        values.put(Parameters.OPTION_3, "4000");
        values.put(Parameters.OPTION_4, "2500");
        values.put(Parameters.ANSWER, "4000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "Three years ago, the average age of Anita, Priya, and Varsha was 27 years. If five years ago, the average age of Priya and Varsha was 20 years, find the present age of Anita.");
        values.put(Parameters.OPTION_1, "30");
        values.put(Parameters.OPTION_2, "40");
        values.put(Parameters.OPTION_3, "60");
        values.put(Parameters.OPTION_4, "25");
        values.put(Parameters.ANSWER, "40");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The average weight of P, Q and R is 45 kg. If the average weight of P and Q is 40 kg and that of Q and R is 43 kg, what is the weight of Q?");
        values.put(Parameters.OPTION_1, "32");
        values.put(Parameters.OPTION_2, "65");
        values.put(Parameters.OPTION_3, "67");
        values.put(Parameters.OPTION_4, "31");
        values.put(Parameters.ANSWER, "31");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "The average weight of 16 students in a class is 50.25 kg, and that of the remaining 8 students is 45.15 kg. Find the average weight of all the students in the class.");
        values.put(Parameters.OPTION_1, "34.56");
        values.put(Parameters.OPTION_2, "56.23");
        values.put(Parameters.OPTION_3, "48.55");
        values.put(Parameters.OPTION_4, "31.44");
        values.put(Parameters.ANSWER, "48.55");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "A museum has an average of 510 visitors on Sunday and 240 on other days. Find the average number of visitors per day in a month of 30 days beginning with a Sunday.");
        values.put(Parameters.OPTION_1, "285");
        values.put(Parameters.OPTION_2, "275");
        values.put(Parameters.OPTION_3, "237");
        values.put(Parameters.OPTION_4, "245");
        values.put(Parameters.ANSWER, "285");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "If the average marks of three classes of 45, 60 and 55 students are 60, 55, 50 respectively, find the average marks of all the students.");
        values.put(Parameters.OPTION_1, "52.85");
        values.put(Parameters.OPTION_2, "45.75");
        values.put(Parameters.OPTION_3, "64.68");
        values.put(Parameters.OPTION_4, "54.68");
        values.put(Parameters.ANSWER, "54.68");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addAverageSet3(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "In a class average age of 15 boys is 11. If 5 boys each of age 9 years are added, what would be the new average?");
        values.put(Parameters.OPTION_1, "20 years");
        values.put(Parameters.OPTION_2, "10 years");
        values.put(Parameters.OPTION_3, "10.5 years");
        values.put(Parameters.OPTION_4, "23 years");
        values.put(Parameters.ANSWER, "10.5 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "If the number of quantities in group A is 10 and in group B is 8, and their individual average is 24 and 16 respectively, find the combined average of the two groups.");
        values.put(Parameters.OPTION_1, "20.44");
        values.put(Parameters.OPTION_2, "18.22");
        values.put(Parameters.OPTION_3, "16.22");
        values.put(Parameters.OPTION_4, "18.66");
        values.put(Parameters.ANSWER, "20.44");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "The average of square of first 6 consecutive even numbers is:");
        values.put(Parameters.OPTION_1, "12.20");
        values.put(Parameters.OPTION_2, "60.66");
        values.put(Parameters.OPTION_3, "16.45");
        values.put(Parameters.OPTION_4, "178");
        values.put(Parameters.ANSWER, "60.66");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "Find the average of first 4 consecutive even numbers.");
        values.put(Parameters.OPTION_1, "2");
        values.put(Parameters.OPTION_2, "5");
        values.put(Parameters.OPTION_3, "1");
        values.put(Parameters.OPTION_4, "8");
        values.put(Parameters.ANSWER, "5");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "Find the average of first 5 consecutive even numbers starting from 2 to 10, where the last even number is 10.");
        values.put(Parameters.OPTION_1, "1");
        values.put(Parameters.OPTION_2, "6");
        values.put(Parameters.OPTION_3, "2");
        values.put(Parameters.OPTION_4, "8");
        values.put(Parameters.ANSWER, "6");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "Find the average of the square of first 5 consecutive odd numbers starting from 1 to 9, where the last odd number is 9.");
        values.put(Parameters.OPTION_1, "22");
        values.put(Parameters.OPTION_2, "11");
        values.put(Parameters.OPTION_3, "16");
        values.put(Parameters.OPTION_4, "33");
        values.put(Parameters.ANSWER, "33");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The average age of a group of 6 boys is 19. If the new average age after a boy joins the group is 21.28, find the age of new boy.");
        values.put(Parameters.OPTION_1, "Approx 23");
        values.put(Parameters.OPTION_2, "Approx 32");
        values.put(Parameters.OPTION_3, "Approx 35");
        values.put(Parameters.OPTION_4, "Approx 45");
        values.put(Parameters.ANSWER, "Approx 35");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "In the first 10 overs of a cricket game, the run rate was only 3.2. What should be the run rate in the remaining 40 overs to reach the target of 282 runs?");
        values.put(Parameters.OPTION_1, "6.25");
        values.put(Parameters.OPTION_2, "6.5");
        values.put(Parameters.OPTION_3, "6.75");
        values.put(Parameters.OPTION_4, "7");
        values.put(Parameters.ANSWER, "6.25");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "The captain of a cricket team of 11 members is 26 years old and the wicket keeper is 3 years older. If the ages of these two are excluded, the average age of the remaining players is one year less than the average age of the whole team. What is the average age of the team?");
        values.put(Parameters.OPTION_1, "23 years");
        values.put(Parameters.OPTION_2, "24 years");
        values.put(Parameters.OPTION_3, "25 years");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "23 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "A car owner buys petrol at Rs.7.50, Rs. 8 and Rs. 8.50 per litre for three successive years. What approximately is the average cost per litre of petrol if he spends Rs. 4000 each year?");
        values.put(Parameters.OPTION_1, "Rs. 7.98");
        values.put(Parameters.OPTION_2, "Rs. 8");
        values.put(Parameters.OPTION_3, "Rs. 8.50");
        values.put(Parameters.OPTION_4, "Rs. 9");
        values.put(Parameters.ANSWER, "Rs. 7.98");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addProblemOnAgesSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A mother is twice as old as her son. If 20 years ago, the age of the mother was 10 times the age of the son, what is the present age of the mother?");
        values.put(Parameters.OPTION_1, "38 years");
        values.put(Parameters.OPTION_2, "40 years");
        values.put(Parameters.OPTION_3, "43 years");
        values.put(Parameters.OPTION_4, "45 years");
        values.put(Parameters.ANSWER, "45 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Four years ago a man was 6 times as old as his son. After 16 years he will be twice as old as his son. What is the present age of man and his son?");
        values.put(Parameters.OPTION_1, "34, 9");
        values.put(Parameters.OPTION_2, "33, 7");
        values.put(Parameters.OPTION_3, "35, 5");
        values.put(Parameters.OPTION_4, "36, 6");
        values.put(Parameters.ANSWER, "34, 9");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "The ratio of the ages of Minu and Meera is 4:2. If the sum of their ages is 6 years, find the ratio of their ages after 8 years.");
        values.put(Parameters.OPTION_1, "8:6");
        values.put(Parameters.OPTION_2, "6:5");
        values.put(Parameters.OPTION_3, "6:4");
        values.put(Parameters.OPTION_4, "7:5");
        values.put(Parameters.ANSWER, "6:5");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "The ratio of the ages of Seeta and Geeta is 2:7. After 6 years, the ratio of their ages will be 1:2. What is the difference in their present ages?");
        values.put(Parameters.OPTION_1, "8 years");
        values.put(Parameters.OPTION_2, "9 years");
        values.put(Parameters.OPTION_3, "10 years");
        values.put(Parameters.OPTION_4, "11 years");
        values.put(Parameters.ANSWER, "10 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "Ten years ago, the sum of ages of a father and his son was 34 years. If the ratio of present ages of the father and son is 7:2, find the present age of the son.");
        values.put(Parameters.OPTION_1, "12 years");
        values.put(Parameters.OPTION_2, "11 years");
        values.put(Parameters.OPTION_3, "10 years");
        values.put(Parameters.OPTION_4, "8 years");
        values.put(Parameters.ANSWER, "12 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "The sum of the ages of father and his son is 44 years. If 6 years after the father will be 3 times as old as his son, what are their present ages?");
        values.put(Parameters.OPTION_1, "36, 8");
        values.put(Parameters.OPTION_2, "38, 6");
        values.put(Parameters.OPTION_3, "35, 9");
        values.put(Parameters.OPTION_4, "37, 7");
        values.put(Parameters.ANSWER, "36, 8");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Ten years ago, Ajay was 1/3 rd as old as Vijay. If Ajay is 18 years old now, how old is Vijay now?");
        values.put(Parameters.OPTION_1, "32 years");
        values.put(Parameters.OPTION_2, "34 years");
        values.put(Parameters.OPTION_3, "36 years");
        values.put(Parameters.OPTION_4, "38 years");
        values.put(Parameters.ANSWER, "34 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Age of father is seven times the age of his son. In the next 10 years, the age of father will be three times the age of his son. What is the age of father now?");
        values.put(Parameters.OPTION_1, "35 years");
        values.put(Parameters.OPTION_2, "37 years");
        values.put(Parameters.OPTION_3, "39 years");
        values.put(Parameters.OPTION_4, "41 years");
        values.put(Parameters.ANSWER, "35 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Twelve years ago, Budh was twice as old as Badri. If the ratio of their present ages is 4:3 respectively, find the difference between their present ages.");
        values.put(Parameters.OPTION_1, "5 years");
        values.put(Parameters.OPTION_2, "6 years");
        values.put(Parameters.OPTION_3, "7 years");
        values.put(Parameters.OPTION_4, "8 years");
        values.put(Parameters.ANSWER, "6 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Two years ago the ratio of ages of Naresh and Suresh was 3:2. If one year hence, the ratio of their ages will be 7:5, what is the sum of their present ages?");
        values.put(Parameters.OPTION_1, "30 years");
        values.put(Parameters.OPTION_2, "32 years");
        values.put(Parameters.OPTION_3, "34 years");
        values.put(Parameters.OPTION_4, "36 years");
        values.put(Parameters.ANSWER, "34 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addProblemOnAgesSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "The sum of the present age of mother and her son is 60 years. Six years ago, the age of the mother was five times the age of her son. What will be the age of her son after 6 years?");
        values.put(Parameters.OPTION_1, "23 years");
        values.put(Parameters.OPTION_2, "22 years");
        values.put(Parameters.OPTION_3, "20 years");
        values.put(Parameters.OPTION_4, "21 years");
        values.put(Parameters.ANSWER, "20 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Simran is younger than Simarjeet by 7 years, and the ratio of their ages is 7:9. What is the age of Simran?");
        values.put(Parameters.OPTION_1, "24 years");
        values.put(Parameters.OPTION_2, "23.5 years");
        values.put(Parameters.OPTION_3, "24.5 years");
        values.put(Parameters.OPTION_4, "25 years");
        values.put(Parameters.ANSWER, "24.5 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "Six years ago the ratio of the ages of Preeti and Ruchi was 6: 5. After four years the ratio of their ages will be 11: 10. What is Ruchi's present age?");
        values.put(Parameters.OPTION_1, "18 years");
        values.put(Parameters.OPTION_2, "17 years");
        values.put(Parameters.OPTION_3, "16 years");
        values.put(Parameters.OPTION_4, "15 years");
        values.put(Parameters.ANSWER, "16 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "At present, the ratio between the ages of Haseena and Anushka is 4:3. After 6 years, Haseena's age will be 26years. What is the present age of Anushka?");
        values.put(Parameters.OPTION_1, "15 years");
        values.put(Parameters.OPTION_2, "14 years");
        values.put(Parameters.OPTION_3, "13 years");
        values.put(Parameters.OPTION_4, "12 years");
        values.put(Parameters.ANSWER, "15 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "My brother, Ravi is 3 years elder to me. My father's age was 28 years when my sister, Neha was born, and my mother's age was 26 years when I was born. If Neha's age was 4 years when Ravi was born, what was the age of my father when Ravi was born?");
        values.put(Parameters.OPTION_1, "35 years");
        values.put(Parameters.OPTION_2, "34 years");
        values.put(Parameters.OPTION_3, "33 years");
        values.put(Parameters.OPTION_4, "32 years");
        values.put(Parameters.ANSWER, "32 years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "The product of the ages of Shyam and Ram is 240. If double the age of Ram is more than Shyam's age by 4 years, what is Ram's present age?");
        values.put(Parameters.OPTION_1, "16");
        values.put(Parameters.OPTION_2, "14");
        values.put(Parameters.OPTION_3, "12");
        values.put(Parameters.OPTION_4, "10");
        values.put(Parameters.ANSWER, "12");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The present ages of Arun, Sunil, and Vivek are in proportions 4:7:9. Before eight years, the sum of their ages was 56. What are their present ages in years?");
        values.put(Parameters.OPTION_1, "Insufficient Data");
        values.put(Parameters.OPTION_2, "16,30,40");
        values.put(Parameters.OPTION_3, "16,28,40");
        values.put(Parameters.OPTION_4, "16,28,36");
        values.put(Parameters.ANSWER, "16,28,36");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "If 6 years are subtracted from the present age of Vijay and the remainder is divided by 18, the present age of Vishal is obtained. If Vishal is 2 years younger to Denis whose age is 5years, then what is Vijay's present age?");
        values.put(Parameters.OPTION_1, "50 Years");
        values.put(Parameters.OPTION_2, "60 Years");
        values.put(Parameters.OPTION_3, "55 Years");
        values.put(Parameters.OPTION_4, "62 Years");
        values.put(Parameters.ANSWER, "55 Years");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Present ages of Sameer and Anand are in the ratio of 5 : 4 respectively. Three years hence, the ratio of their ages will become 11 : 9 respectively. What is Anand's present age in years?");
        values.put(Parameters.OPTION_1, "24");
        values.put(Parameters.OPTION_2, "27");
        values.put(Parameters.OPTION_3, "40");
        values.put(Parameters.OPTION_4, "Cannot be determined");
        values.put(Parameters.ANSWER, "24");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "The age of father 10 years ago was thrice the age of his son. Ten years hence, father's age will be twice that of his son. The ratio of their present ages is:");
        values.put(Parameters.OPTION_1, "5 : 2");
        values.put(Parameters.OPTION_2, "7 : 3");
        values.put(Parameters.OPTION_3, "9 : 2");
        values.put(Parameters.OPTION_4, "13 : 4");
        values.put(Parameters.ANSWER, "7 : 3");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addPartnershipSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "Sohan started a business with a capital of Rs. 80000. After 6 months Mohan joined as a partner by investing Rs. 65000. After one year they earned total profit Rs. 20000. What is share of Sohan in the profit?");
        values.put(Parameters.OPTION_1, "Rs. 5222.2");
        values.put(Parameters.OPTION_2, "Rs. 14222.2");
        values.put(Parameters.OPTION_3, "Rs. 6222.2");
        values.put(Parameters.OPTION_4, "Rs. 6777.7");
        values.put(Parameters.ANSWER, "Rs. 14222.2");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A, B and C are partners. They have invested Rs.35000, Rs. 25000 and 10,000 respectively for the same period. If the total profit is Rs. 18000, find the share of A.");
        values.put(Parameters.OPTION_1, "Rs. 9000");
        values.put(Parameters.OPTION_2, "Rs. 9500");
        values.put(Parameters.OPTION_3, "Rs. 8000");
        values.put(Parameters.OPTION_4, "Rs. 8500");
        values.put(Parameters.ANSWER, "Rs. 9000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "A's and B's shares in a business are in the ratio of 5:3. If A has invested Rs. 70000 for 12 months, for what period B has invested Rs. 60000?");
        values.put(Parameters.OPTION_1, "7 months");
        values.put(Parameters.OPTION_2, "7.4 months");
        values.put(Parameters.OPTION_3, "8 months");
        values.put(Parameters.OPTION_4, "8.4 months");
        values.put(Parameters.ANSWER, "8.4 months");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "Suresh started a business by investing a certain amount of money. Rakesh joined him after four months by investing Rs. 50000. If after one year Suresh and Rakesh share the profit in the ratio of 10:8, how much capital did Suresh invest?");
        values.put(Parameters.OPTION_1, "Rs. 42000");
        values.put(Parameters.OPTION_2, "Rs. 44000");
        values.put(Parameters.OPTION_3, "Rs. 47000");
        values.put(Parameters.OPTION_4, "Rs. 41666.7");
        values.put(Parameters.ANSWER, "Rs. 41666.7");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A and B enter into a partnership by investing Rs.14000 and Rs. 16000 respectively. After 8 months, C joins them with a capital of Rs.12000. Find the share of C in a total profit of Rs. 57000 after 2 years.");
        values.put(Parameters.OPTION_1, "Rs.12000");
        values.put(Parameters.OPTION_2, "Rs.12500");
        values.put(Parameters.OPTION_3, "Rs.13000");
        values.put(Parameters.OPTION_4, "Rs.13500");
        values.put(Parameters.ANSWER, "Rs.12000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "Ramesh and Suresh enter into a partnership with capitals in the ratio of 10:12. At the end of 8 months, Ramesh withdraws. If they receive profits in the ratio of 10:18. Find how long Suresh's capital was used.");
        values.put(Parameters.OPTION_1, "7 months");
        values.put(Parameters.OPTION_2, "8 months");
        values.put(Parameters.OPTION_3, "10 months");
        values.put(Parameters.OPTION_4, "12 months");
        values.put(Parameters.ANSWER, "12 months");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Raju started a business with Rs. 900. Kamal joined him after few months with an amount of 600. If the profits at the end of the year were divided in the ratio of 2:1, after how many months Kamal joined the business?");
        values.put(Parameters.OPTION_1, "9 months");
        values.put(Parameters.OPTION_2, "3 months");
        values.put(Parameters.OPTION_3, "8 months");
        values.put(Parameters.OPTION_4, "5 months");
        values.put(Parameters.ANSWER, "3 months");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Mahesh and Suresh rent a pasture for 12 months. Mahesh puts in 200 cows for 8 months. How many cows can Suresh put in the pasture for the remaining 4 months if he pays 1(1/2) as much as Mahesh?");
        values.put(Parameters.OPTION_1, "450 cows");
        values.put(Parameters.OPTION_2, "600 cows");
        values.put(Parameters.OPTION_3, "300 cows");
        values.put(Parameters.OPTION_4, "520 cows");
        values.put(Parameters.ANSWER, "600 cows");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "X and Y enter into a partnership for a year. X invests Rs. 6000, and Y invests Rs. 8000. After 4 months, they admit Z, who invests Rs. 9000. If Y withdraws his contribution after 6 months, how would they share a profit of Rs 1000 at the end of the year?");
        values.put(Parameters.OPTION_1, "350, 300, 350");
        values.put(Parameters.OPTION_2, "375, 250, 375");
        values.put(Parameters.OPTION_3, "400, 300, 300");
        values.put(Parameters.OPTION_4, "100, 600,300");
        values.put(Parameters.ANSWER, "375, 250, 375");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "The contributions made by Ravi and Suresh are in the ratio of 3:2. If 5% of total profit is donated and Ravi gets 8550 as his share of profit, what is the total profit?");
        values.put(Parameters.OPTION_1, "14000");
        values.put(Parameters.OPTION_2, "14500");
        values.put(Parameters.OPTION_3, "15000");
        values.put(Parameters.OPTION_4, "15500");
        values.put(Parameters.ANSWER, "15000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addPartnershipSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A and B invest in a business in the ratio 3 : 2. If 5% of the total profit goes to charity and A's share is Rs. 855, the total profit is:");
        values.put(Parameters.OPTION_1, "Rs. 1425");
        values.put(Parameters.OPTION_2, "Rs. 1500");
        values.put(Parameters.OPTION_3, "Rs. 1537.50");
        values.put(Parameters.OPTION_4, "Rs. 1576");
        values.put(Parameters.ANSWER, "Rs. 1500");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A, B and C enter into a partnership in the ratio 7/2 : 4/3 : 6/5. After 4 months, A increases his share 50%. If the total profit at the end of one year be Rs. 21,600, then B's share in the profit is:");
        values.put(Parameters.OPTION_1, "Rs. 2100");
        values.put(Parameters.OPTION_2, "Rs. 2400");
        values.put(Parameters.OPTION_3, "Rs. 3600");
        values.put(Parameters.OPTION_4, "Rs. 4000");
        values.put(Parameters.ANSWER, "Rs. 4000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "A, B, C subscribe Rs. 50,000 for a business. A subscribes Rs. 4000 more than B and B Rs. 5000 more than C. Out of a total profit of Rs. 35,000, A receives:");
        values.put(Parameters.OPTION_1, "Rs. 8400");
        values.put(Parameters.OPTION_2, "Rs. 11,900");
        values.put(Parameters.OPTION_3, "Rs. 13,600");
        values.put(Parameters.OPTION_4, "Rs. 14,700");
        values.put(Parameters.ANSWER, "Rs. 14,700");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "A, B, C rent a pasture. A puts 10 oxen for 7 months, B puts 12 oxen for 5 months and C puts 15 oxen for 3 months for grazing. If the rent of the pasture is Rs. 175, how much must C pay as his share of rent?");
        values.put(Parameters.OPTION_1, "Rs. 45");
        values.put(Parameters.OPTION_2, "Rs. 50");
        values.put(Parameters.OPTION_3, "Rs. 55");
        values.put(Parameters.OPTION_4, "Rs. 60");
        values.put(Parameters.ANSWER, "Rs. 45");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A and B started a business in partnership investing Rs. 20,000 and Rs. 15,000 respectively. After six months, C joined them with Rs. 20,000. What will be B's share in total profit of Rs. 25,000 earned at the end of 2 years from the starting of the business?");
        values.put(Parameters.OPTION_1, "Rs. 7500");
        values.put(Parameters.OPTION_2, "Rs. 9000");
        values.put(Parameters.OPTION_3, "Rs. 9500");
        values.put(Parameters.OPTION_4, "Rs. 10,000");
        values.put(Parameters.ANSWER, "Rs. 7500");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "Aman started a business investing Rs. 70,000. Rakhi joined him after six months with an amount of Rs.. 1,05,000 and Sagar joined them with Rs. 1.4 lakhs after another six months. The amount of profit earned should be distributed in what ratio among Aman, Rakhi and Sagar respectively, 3 years after Aman started the business?");
        values.put(Parameters.OPTION_1, "7 : 6 : 10");
        values.put(Parameters.OPTION_2, "12 : 15 : 16");
        values.put(Parameters.OPTION_3, "42 : 45 : 56");
        values.put(Parameters.OPTION_4, "Cannot be determined");
        values.put(Parameters.ANSWER, "12 : 15 : 16");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Arun, Kamal and Vinay invested Rs. 8000, Rs. 4000 and Rs. 8000 respectively in a business. Arun left after six months. If after eight months, there was a gain of Rs. 4005, then what will be the share of Kamal?");
        values.put(Parameters.OPTION_1, "Rs. 890");
        values.put(Parameters.OPTION_2, "Rs. 1335");
        values.put(Parameters.OPTION_3, "Rs. 1602");
        values.put(Parameters.OPTION_4, "Rs. 1780");
        values.put(Parameters.ANSWER, "Rs. 890");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Simran started a software business by investing Rs. 50,000. After six months, Nanda joined her with a capital of Rs. 80,000. After 3 years, they earned a profit of Rs. 24,500. What was Simran's share in the profit?");
        values.put(Parameters.OPTION_1, "Rs. 9,423");
        values.put(Parameters.OPTION_2, "Rs. 10,250");
        values.put(Parameters.OPTION_3, "Rs. 12,500");
        values.put(Parameters.OPTION_4, "Rs. 10,500");
        values.put(Parameters.ANSWER, "Rs. 10,500");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "A, B, C subscribe Rs. 50,000 for a business. A subscribes Rs. 4000 more than B and B Rs. 5000 more than C. Out of a total profit of Rs. 35,000, A receives:");
        values.put(Parameters.OPTION_1, "Rs. 8400");
        values.put(Parameters.OPTION_2, "Rs. 11,900");
        values.put(Parameters.OPTION_3, "Rs. 13,600");
        values.put(Parameters.OPTION_4, "Rs. 14,700");
        values.put(Parameters.ANSWER, "Rs. 14,700");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "A and B entered into partnership with capitals in the ratio 4 : 5. After 3 months, A withdrew  1/4 of his capital and B withdrew 1/5 of his capital. The gain at the end of 10 months was Rs. 760. A's share in this profit is:");
        values.put(Parameters.OPTION_1, "Rs. 330");
        values.put(Parameters.OPTION_2, "Rs. 360");
        values.put(Parameters.OPTION_3, "Rs. 380");
        values.put(Parameters.OPTION_4, "Rs. 430");
        values.put(Parameters.ANSWER, "Rs. 330");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addBoatsAndStreamsSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A boat can travel with a speed of 13 km/hr in still water. If the speed of the stream is 4 km/hr, find the time taken by the boat to go 68 km downstream.");
        values.put(Parameters.OPTION_1, "2 hours");
        values.put(Parameters.OPTION_2, "3 hours");
        values.put(Parameters.OPTION_3, "4 hours");
        values.put(Parameters.OPTION_4, "5 hours");
        values.put(Parameters.ANSWER, "4 hours");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A man's speed with the current is 15 km/hr and the speed of the current is 2.5 km/hr. The man's speed against the current is:");
        values.put(Parameters.OPTION_1, "8.5 km/hr");
        values.put(Parameters.OPTION_2, "9 km/hr");
        values.put(Parameters.OPTION_3, "10 km/hr");
        values.put(Parameters.OPTION_4, "12.5 km/hr");
        values.put(Parameters.ANSWER, "10 km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "A boat running upstream takes 8 hours 48 minutes to cover a certain distance, while it takes 4 hours to cover the same distance running downstream. What is the ratio between the speed of the boat and speed of the water current respectively?");
        values.put(Parameters.OPTION_1, "2 : 1");
        values.put(Parameters.OPTION_2, "3 : 2");
        values.put(Parameters.OPTION_3, "8 : 3");
        values.put(Parameters.OPTION_4, "Cannot be determined");
        values.put(Parameters.ANSWER, "8 : 3");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "A motorboat, whose speed in 15 km/hr in still water goes 30 km downstream and comes back in a total of 4 hours 30 minutes. The speed of the stream (in km/hr) is:");
        values.put(Parameters.OPTION_1, "4");
        values.put(Parameters.OPTION_2, "5");
        values.put(Parameters.OPTION_3, "6");
        values.put(Parameters.OPTION_4, "10");
        values.put(Parameters.ANSWER, "5");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "In one hour, a boat goes 11 km/hr along the stream and 5 km/hr against the stream. The speed of the boat in still water (in km/hr) is:");
        values.put(Parameters.OPTION_1, "3 km/hr");
        values.put(Parameters.OPTION_2, "5 km/hr");
        values.put(Parameters.OPTION_3, "8 km/hr");
        values.put(Parameters.OPTION_4, "9 km/hr");
        values.put(Parameters.ANSWER, "8 km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "A boat running downstream covers a distance of 16 km in 2 hours while for covering the same distance upstream, it takes 4 hours. What is the speed of the boat in still water?");
        values.put(Parameters.OPTION_1, "4 km/hr");
        values.put(Parameters.OPTION_2, "6 km/hr");
        values.put(Parameters.OPTION_3, "8 km/hr");
        values.put(Parameters.OPTION_4, "Data inadequate");
        values.put(Parameters.ANSWER, "6 km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The speed of a boat in still water in 15 km/hr and the rate of current is 3 km/hr. The distance travelled downstream in 12 minutes is:");
        values.put(Parameters.OPTION_1, "1.2 km");
        values.put(Parameters.OPTION_2, "1.8 km");
        values.put(Parameters.OPTION_3, "2.4 km");
        values.put(Parameters.OPTION_4, "3.6 km");
        values.put(Parameters.ANSWER, "3.6 km");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "A boat takes 90 minutes less to travel 36 miles downstream than to travel the same distance upstream. If the speed of the boat in still water is 10 mph, the speed of the stream is:");
        values.put(Parameters.OPTION_1, "2 mph");
        values.put(Parameters.OPTION_2, "2.5 mph");
        values.put(Parameters.OPTION_3, "3 mph");
        values.put(Parameters.OPTION_4, "4 mph");
        values.put(Parameters.ANSWER, "2 mph");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "A boatman goes 2 km against the current of the stream in 1 hour and goes 1 km along the current in 10 minutes. How long will it take to go 5 km in stationary water?");
        values.put(Parameters.OPTION_1, "40 minutes");
        values.put(Parameters.OPTION_2, "1 hour");
        values.put(Parameters.OPTION_3, "1 hr 15 min");
        values.put(Parameters.OPTION_4, "1 hr 30 min");
        values.put(Parameters.ANSWER, "1 hr 15 min");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "A man takes twice as long to row a distance against the stream as to row the same distance in favour of the stream. The ratio of the speed of the boat (in still water) and the stream is:");
        values.put(Parameters.OPTION_1, "2 : 1");
        values.put(Parameters.OPTION_2, "3 : 1");
        values.put(Parameters.OPTION_3, "3 : 2");
        values.put(Parameters.OPTION_4, "4 : 3");
        values.put(Parameters.ANSWER, "3 : 1");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addBoatsAndStreamsSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "A man rows to a place 48 km distant and come back in 14 hours. He finds that he can row 4 km with the stream in the same time as 3 km against the stream. The rate of the stream is:");
        values.put(Parameters.OPTION_1, "1 km/hr");
        values.put(Parameters.OPTION_2, "1.5 km/hr");
        values.put(Parameters.OPTION_3, "2 km/hr");
        values.put(Parameters.OPTION_4, "2.5 km/hr");
        values.put(Parameters.ANSWER, "1 km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A man swims 12 km downstream and 10 km upstream. If he takes 2 hours each time, what is the speed of the stream?");
        values.put(Parameters.OPTION_1, "1 km/hr");
        values.put(Parameters.OPTION_2, "0.5 km/hr");
        values.put(Parameters.OPTION_3, "1.5 km/hr");
        values.put(Parameters.OPTION_4, "0.7 km/hr");
        values.put(Parameters.ANSWER, "0.5 km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "A boat covers 800 meters in 600 seconds against the stream and returns downstream in 5 minutes. What is the speed of the boat in still water?");
        values.put(Parameters.OPTION_1, "1 m/s");
        values.put(Parameters.OPTION_2, "1.5 m/s");
        values.put(Parameters.OPTION_3, "2 m/s");
        values.put(Parameters.OPTION_4, "2.5 m/s");
        values.put(Parameters.ANSWER, "2 m/s");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "The velocity of a boat in still water is 9 km/hr, and the speed of the stream is 2.5 km/hr. How much time will the boat take to go 9.1 km against the stream?");
        values.put(Parameters.OPTION_1, "1 hr. 20min");
        values.put(Parameters.OPTION_2, "2hr. 40min");
        values.put(Parameters.OPTION_3, "1hr. 24min");
        values.put(Parameters.OPTION_4, "2hr. 48min");
        values.put(Parameters.ANSWER, "1hr. 24min");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A boat travels upstream from Q to P and downstream from P to Q in 3 hours. If the distance between P to Q is 4km and the speed of the stream is 1kmph, then what is the velocity of the boat in still water?");
        values.put(Parameters.OPTION_1, "3kmph");
        values.put(Parameters.OPTION_2, "4kmph");
        values.put(Parameters.OPTION_3, "5kmph");
        values.put(Parameters.OPTION_4, "7.2kmph");
        values.put(Parameters.ANSWER, "3kmph");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "A boat travels from A to B along the stream and from B to A against the stream in 3 hours. If the velocity of the boat in still water is 4 km/hr, what is the distance between A and B?");
        values.put(Parameters.OPTION_1, "8 km");
        values.put(Parameters.OPTION_2, "10 km");
        values.put(Parameters.OPTION_3, "12 km");
        values.put(Parameters.OPTION_4, "Data insufficient");
        values.put(Parameters.ANSWER, "Data insufficient");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "A man can row, 5km/hr in still water and the velocity of the stream is 1.5 km/hr. He takes an hour when he travels upstream to a place and returns back to the starting point. How far is the place from the starting point?");
        values.put(Parameters.OPTION_1, "2.5 km");
        values.put(Parameters.OPTION_2, "2.275km");
        values.put(Parameters.OPTION_3, "3 km");
        values.put(Parameters.OPTION_4, "4.5km");
        values.put(Parameters.ANSWER, "2.275km");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "A boat covers 6 km upstream and returns back to the starting point in 2 hours. If the flow of the stream is 4 km/hr, what is the speed of the boat in still water?");
        values.put(Parameters.OPTION_1, "5km/hr");
        values.put(Parameters.OPTION_2, "6km/hr");
        values.put(Parameters.OPTION_3, "7.3 km/hr");
        values.put(Parameters.OPTION_4, "8km/hr");
        values.put(Parameters.ANSWER, "8km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "A boat covers 12 km upstream and 18km downstream in 3 hours while it covers 36km upstream and 24 km downstream in 6[1/2] hours, what is the velocity of the stream?");
        values.put(Parameters.OPTION_1, "1.5km/hr");
        values.put(Parameters.OPTION_2, "2km/hr");
        values.put(Parameters.OPTION_3, "3km/hr");
        values.put(Parameters.OPTION_4, "2.5km/hr");
        values.put(Parameters.ANSWER, "2.5km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "A man can row 9[1/3] km/hr in still water. He finds that it takes thrice as much time to row upstream as to row downstream (same distance). Find the speed of the current.");
        values.put(Parameters.OPTION_1, "3[1/3] km/hr");
        values.put(Parameters.OPTION_2, "1[1/4] km/hr");
        values.put(Parameters.OPTION_3, "4[2/3] km/hr");
        values.put(Parameters.OPTION_4, "3[1/9] km/hr");
        values.put(Parameters.ANSWER, "4[2/3] km/hr");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addPercentageSet1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "If 40% of an amount is 250, what will be 60% of that amount?");
        values.put(Parameters.OPTION_1, "300");
        values.put(Parameters.OPTION_2, "320");
        values.put(Parameters.OPTION_3, "375");
        values.put(Parameters.OPTION_4, "400");
        values.put(Parameters.ANSWER, "375");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "If 30 % of 1520 + 40 % of 800 = x % of 5000, find the value of x.");
        values.put(Parameters.OPTION_1, "14.42%");
        values.put(Parameters.OPTION_2, "15.52%");
        values.put(Parameters.OPTION_3, "12.22%");
        values.put(Parameters.OPTION_4, "18.82%");
        values.put(Parameters.ANSWER, "15.52%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "If two values are 20% and 60% of a third value, what percentage is the first value of the second value?");
        values.put(Parameters.OPTION_1, "22.2%");
        values.put(Parameters.OPTION_2, "33.3%");
        values.put(Parameters.OPTION_3, "27.7%");
        values.put(Parameters.OPTION_4, "31.1%");
        values.put(Parameters.ANSWER, "33.3%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "If the height of Ramesh is less by 20% than Suresh, the height of Suresh will be greater than that of Ramesh by how many percent?");
        values.put(Parameters.OPTION_1, "25%");
        values.put(Parameters.OPTION_2, "30%");
        values.put(Parameters.OPTION_3, "32%");
        values.put(Parameters.OPTION_4, "28%");
        values.put(Parameters.ANSWER, "25%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "The population of a town is increased from 54500 to 58500 in one year. What is the percentage increase in the population?");
        values.put(Parameters.OPTION_1, "6.34%");
        values.put(Parameters.OPTION_2, "5.34%");
        values.put(Parameters.OPTION_3, "7.34%");
        values.put(Parameters.OPTION_4, "4.34%");
        values.put(Parameters.ANSWER, "7.34%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "The population of a town is decreasing at a rate of 10% per annum. If the population two years ago was 20,000, what is the present population?");
        values.put(Parameters.OPTION_1, "15000");
        values.put(Parameters.OPTION_2, "15200");
        values.put(Parameters.OPTION_3, "16000");
        values.put(Parameters.OPTION_4, "16200");
        values.put(Parameters.ANSWER, "16200");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "1200 boys and 800 girls appeared in an examination. If 60% of the boys and 40% of the girls passed the examination, what is the percentage of candidates who failed in the examination?");
        values.put(Parameters.OPTION_1, "48 %");
        values.put(Parameters.OPTION_2, "52 %");
        values.put(Parameters.OPTION_3, "45 %");
        values.put(Parameters.OPTION_4, "42 %");
        values.put(Parameters.ANSWER, "48 %");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Two candidates contested an election. The winning candidate scored 54% and won by 88 votes. If 58 votes were declared invalid, find the total number of votes polled in the election?");
        values.put(Parameters.OPTION_1, "1042");
        values.put(Parameters.OPTION_2, "1100");
        values.put(Parameters.OPTION_3, "1158");
        values.put(Parameters.OPTION_4, "1188");
        values.put(Parameters.ANSWER, "1158");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "In an examination, 25% candidates failed in English and 35 % students failed in Math.If 15 % candidates failed in both, what is the percentage of candidates who passed in both the subjects?");
        values.put(Parameters.OPTION_1, "45 %");
        values.put(Parameters.OPTION_2, "50 %");
        values.put(Parameters.OPTION_3, "55 %");
        values.put(Parameters.OPTION_4, "58 %");
        values.put(Parameters.ANSWER, "55 %");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Naresh's monthly income is reduced by 15%. By what percentage his monthly income must be increased so that it is again equal to his original monthly income?");
        values.put(Parameters.OPTION_1, "16.6%");
        values.put(Parameters.OPTION_2, "15.6%");
        values.put(Parameters.OPTION_3, "14.6%");
        values.put(Parameters.OPTION_4, "17.6%");
        values.put(Parameters.ANSWER, "17.6%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addPercentageSet2(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "Ram spends 70% of his salary and deposits 15 % of his salary in the bank. If he is left with Rs. 1500, what is his monthly salary?");
        values.put(Parameters.OPTION_1, "Rs.9000");
        values.put(Parameters.OPTION_2, "Rs.9500");
        values.put(Parameters.OPTION_3, "Rs.10000");
        values.put(Parameters.OPTION_4, "Rs.10500");
        values.put(Parameters.ANSWER, "Rs.10000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "If A's income is 12 % more than B's income, B's income is how much less than A's income?");
        values.put(Parameters.OPTION_1, "9.7%");
        values.put(Parameters.OPTION_2, "10.7%");
        values.put(Parameters.OPTION_3, "11.7 %");
        values.put(Parameters.OPTION_4, "12.7%");
        values.put(Parameters.ANSWER, "10.7%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "If the price of sugar increases by 10%, by what percentage a housewife should reduce the consumption of sugar so that expense is not increased?");
        values.put(Parameters.OPTION_1, "5.5%");
        values.put(Parameters.OPTION_2, "7.1%");
        values.put(Parameters.OPTION_3, "9.1%");
        values.put(Parameters.OPTION_4, "10%");
        values.put(Parameters.ANSWER, "9.1%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "When the numerator is increased by 200%, and the denominator is increased by 350%, the resultant fraction is 5/12. Find the original fraction.");
        values.put(Parameters.OPTION_1, "5/9");
        values.put(Parameters.OPTION_2, "11/13");
        values.put(Parameters.OPTION_3, "8/9");
        values.put(Parameters.OPTION_4, "5/8");
        values.put(Parameters.ANSWER, "5/8");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "If the radius of a circle is increased by 50%, what will be the percentage increase in its area?");
        values.put(Parameters.OPTION_1, "150%");
        values.put(Parameters.OPTION_2, "50%");
        values.put(Parameters.OPTION_3, "100%");
        values.put(Parameters.OPTION_4, "125%");
        values.put(Parameters.ANSWER, "125%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "If the length of a rectangle is increased by 37.5% and its breadth is decreased by 20%, find the change in its area.");
        values.put(Parameters.OPTION_1, "15% increase");
        values.put(Parameters.OPTION_2, "13% decrease");
        values.put(Parameters.OPTION_3, "10% increase");
        values.put(Parameters.OPTION_4, "10% decrease");
        values.put(Parameters.ANSWER, "10% increase");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "A mixture of 20 kg of milk and water contains 90% milk. How many kilograms of water should be added so that water becomes 40%?");
        values.put(Parameters.OPTION_1, "10 kg");
        values.put(Parameters.OPTION_2, "20 kg");
        values.put(Parameters.OPTION_3, "12 kg");
        values.put(Parameters.OPTION_4, "8 kg");
        values.put(Parameters.ANSWER, "10 kg");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "The salary of a man per hour is increased by 20%, and his working hours is decreased by 25%. If the original income is Rs. 4000. Find the new income.");
        values.put(Parameters.OPTION_1, "2000");
        values.put(Parameters.OPTION_2, "2500");
        values.put(Parameters.OPTION_3, "3000");
        values.put(Parameters.OPTION_4, "3600");
        values.put(Parameters.ANSWER, "3600");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "There are 35 students and 6 teachers in a class, each student gets toffees that are 20% of the total number of students, and each teacher gets toffees that are 40 % of the total number of students. How many toffees were there?");
        values.put(Parameters.OPTION_1, "245");
        values.put(Parameters.OPTION_2, "405");
        values.put(Parameters.OPTION_3, "329");
        values.put(Parameters.OPTION_4, "142");
        values.put(Parameters.ANSWER, "329");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "If 10% of A's income = 15% of B's income = 20% of C's income. If the sum of their income is 7800, find the income of B.");
        values.put(Parameters.OPTION_1, "1800");
        values.put(Parameters.OPTION_2, "2400");
        values.put(Parameters.OPTION_3, "3000");
        values.put(Parameters.OPTION_4, "3600");
        values.put(Parameters.ANSWER, "2400");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addPercentageSet3(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "If a number x is 10% less than another number y and y is 10% more than 125, find the value of x.");
        values.put(Parameters.OPTION_1, "150");
        values.put(Parameters.OPTION_2, "125");
        values.put(Parameters.OPTION_3, "123.75");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "123.75");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A candidate who scores 30% fails by 5 marks, while another candidate who scores 40% marks gets 10 more than minimum passing marks. The minimum marks required to pass are:");
        values.put(Parameters.OPTION_1, "50");
        values.put(Parameters.OPTION_2, "100");
        values.put(Parameters.OPTION_3, "45");
        values.put(Parameters.OPTION_4, "150");
        values.put(Parameters.ANSWER, "50");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "65% of a number is more than its 36% by 58. What is 23% of the total number?");
        values.put(Parameters.OPTION_1, "66");
        values.put(Parameters.OPTION_2, "23");
        values.put(Parameters.OPTION_3, "46");
        values.put(Parameters.OPTION_4, "58");
        values.put(Parameters.ANSWER, "46");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "In an election 2 candidates participate, 20% of the votes are declared invalid, and the winner gets 70% of the valid votes and wins the election by 3200 votes. Find the valid votes.");
        values.put(Parameters.OPTION_1, "10000");
        values.put(Parameters.OPTION_2, "8000");
        values.put(Parameters.OPTION_3, "5620");
        values.put(Parameters.OPTION_4, "12000");
        values.put(Parameters.ANSWER, "8000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:");
        values.put(Parameters.OPTION_1, "588 apples");
        values.put(Parameters.OPTION_2, "600 apples");
        values.put(Parameters.OPTION_3, "672 apples");
        values.put(Parameters.OPTION_4, "700 apples");
        values.put(Parameters.ANSWER, "700 apples");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "If 20% of a = b, then b% of 20 is the same as:");
        values.put(Parameters.OPTION_1, "4% of a");
        values.put(Parameters.OPTION_2, "5% of a");
        values.put(Parameters.OPTION_3, "20% of a");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "4% of a");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The population of a town increased from 1,75,000 to 2,62,500 in a decade. The average percent increase of population per year is:");
        values.put(Parameters.OPTION_1, "4.37%");
        values.put(Parameters.OPTION_2, "5%");
        values.put(Parameters.OPTION_3, "6%");
        values.put(Parameters.OPTION_4, "8.75%");
        values.put(Parameters.ANSWER, "5%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Gauri went to the stationers and bought things worth Rs. 25, out of which 30 paise went on sales tax on taxable purchases. If the tax rate was 6%, then what was the cost of the tax free items?");
        values.put(Parameters.OPTION_1, "Rs. 15");
        values.put(Parameters.OPTION_2, "Rs. 15.70");
        values.put(Parameters.OPTION_3, "Rs. 19.70");
        values.put(Parameters.OPTION_4, "Rs. 20");
        values.put(Parameters.ANSWER, "Rs. 19.70");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Two tailors X and Y are paid a total of Rs. 550 per week by their employer. If X is paid 120 percent of the sum paid to Y, how much is Y paid per week?");
        values.put(Parameters.OPTION_1, "Rs. 200");
        values.put(Parameters.OPTION_2, "Rs. 250");
        values.put(Parameters.OPTION_3, "Rs. 300");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "Rs. 250");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Three candidates contested an election and received 1136, 7636 and 11628 votes respectively. What percentage of the total votes did the winning candidate get?");
        values.put(Parameters.OPTION_1, "57%");
        values.put(Parameters.OPTION_2, "60%");
        values.put(Parameters.OPTION_3, "65%");
        values.put(Parameters.OPTION_4, "90%");
        values.put(Parameters.ANSWER, "57%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addSpotTheErrors1(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "We discussed about the problem so thoroughly");
        values.put(Parameters.OPTION_2, "on the eve of the examination");
        values.put(Parameters.OPTION_3, "that I found it very easy to work it out");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "We discussed about the problem so thoroughly");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "An Indian ship");
        values.put(Parameters.OPTION_2, "laden with merchandise");
        values.put(Parameters.OPTION_3, "got drowned in the Pacific Ocean.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "got drowned in the Pacific Ocean.");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "I could not put up in a hotel");
        values.put(Parameters.OPTION_2, "because the boarding and lodging charges");
        values.put(Parameters.OPTION_3, "were exorbitant.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "I could not put up in a hotel");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "The Indian radio");
        values.put(Parameters.OPTION_2, "which was previously controlled by the British rulers");
        values.put(Parameters.OPTION_3, "is free now from the narrow vested interests.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "is free now from the narrow vested interests.");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "If I had known");
        values.put(Parameters.OPTION_2, "this yesterday");
        values.put(Parameters.OPTION_3, "I will have helped him.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "I will have helped him.");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "A lot of travel delay is caused");
        values.put(Parameters.OPTION_2, "due to the inefficiency and lack of good management");
        values.put(Parameters.OPTION_3, "on behalf of the railways.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "on behalf of the railways.");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "One of the members");
        values.put(Parameters.OPTION_2, "expressed doubt if");
        values.put(Parameters.OPTION_3, "the Minister was an atheist.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "expressed doubt if");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "I have got");
        values.put(Parameters.OPTION_2, "my M.Sc. degree");
        values.put(Parameters.OPTION_3, "in 1988.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "I have got");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "Having received your letter");
        values.put(Parameters.OPTION_2, "this morning, we are writing");
        values.put(Parameters.OPTION_3, "to thank you for the same.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "No error.");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Read each sentence to find out whether there is any grammatical error in it.");
        values.put(Parameters.OPTION_1, "If you lend him a book");
        values.put(Parameters.OPTION_2, "he will lend it to some one else");
        values.put(Parameters.OPTION_3, "and never you will get it back.");
        values.put(Parameters.OPTION_4, "No error.");
        values.put(Parameters.ANSWER, "and never you will get it back.");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public void addSpotTheErrors3(){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Parameters.QUES_NO, 1);
        values.put(Parameters.QUESTION, "If a number x is 10% less than another number y and y is 10% more than 125, find the value of x.");
        values.put(Parameters.OPTION_1, "150");
        values.put(Parameters.OPTION_2, "125");
        values.put(Parameters.OPTION_3, "123.75");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "123.75");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 2);
        values.put(Parameters.QUESTION, "A candidate who scores 30% fails by 5 marks, while another candidate who scores 40% marks gets 10 more than minimum passing marks. The minimum marks required to pass are:");
        values.put(Parameters.OPTION_1, "50");
        values.put(Parameters.OPTION_2, "100");
        values.put(Parameters.OPTION_3, "45");
        values.put(Parameters.OPTION_4, "150");
        values.put(Parameters.ANSWER, "50");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 3);
        values.put(Parameters.QUESTION, "65% of a number is more than its 36% by 58. What is 23% of the total number?");
        values.put(Parameters.OPTION_1, "66");
        values.put(Parameters.OPTION_2, "23");
        values.put(Parameters.OPTION_3, "46");
        values.put(Parameters.OPTION_4, "58");
        values.put(Parameters.ANSWER, "46");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 4);
        values.put(Parameters.QUESTION, "In an election 2 candidates participate, 20% of the votes are declared invalid, and the winner gets 70% of the valid votes and wins the election by 3200 votes. Find the valid votes.");
        values.put(Parameters.OPTION_1, "10000");
        values.put(Parameters.OPTION_2, "8000");
        values.put(Parameters.OPTION_3, "5620");
        values.put(Parameters.OPTION_4, "12000");
        values.put(Parameters.ANSWER, "8000");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 5);
        values.put(Parameters.QUESTION, "A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:");
        values.put(Parameters.OPTION_1, "588 apples");
        values.put(Parameters.OPTION_2, "600 apples");
        values.put(Parameters.OPTION_3, "672 apples");
        values.put(Parameters.OPTION_4, "700 apples");
        values.put(Parameters.ANSWER, "700 apples");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 6);
        values.put(Parameters.QUESTION, "If 20% of a = b, then b% of 20 is the same as:");
        values.put(Parameters.OPTION_1, "4% of a");
        values.put(Parameters.OPTION_2, "5% of a");
        values.put(Parameters.OPTION_3, "20% of a");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "4% of a");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 7);
        values.put(Parameters.QUESTION, "The population of a town increased from 1,75,000 to 2,62,500 in a decade. The average percent increase of population per year is:");
        values.put(Parameters.OPTION_1, "4.37%");
        values.put(Parameters.OPTION_2, "5%");
        values.put(Parameters.OPTION_3, "6%");
        values.put(Parameters.OPTION_4, "8.75%");
        values.put(Parameters.ANSWER, "5%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();
        values.put(Parameters.QUES_NO, 8);
        values.put(Parameters.QUESTION, "Gauri went to the stationers and bought things worth Rs. 25, out of which 30 paise went on sales tax on taxable purchases. If the tax rate was 6%, then what was the cost of the tax free items?");
        values.put(Parameters.OPTION_1, "Rs. 15");
        values.put(Parameters.OPTION_2, "Rs. 15.70");
        values.put(Parameters.OPTION_3, "Rs. 19.70");
        values.put(Parameters.OPTION_4, "Rs. 20");
        values.put(Parameters.ANSWER, "Rs. 19.70");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 9);
        values.put(Parameters.QUESTION, "Two tailors X and Y are paid a total of Rs. 550 per week by their employer. If X is paid 120 percent of the sum paid to Y, how much is Y paid per week?");
        values.put(Parameters.OPTION_1, "Rs. 200");
        values.put(Parameters.OPTION_2, "Rs. 250");
        values.put(Parameters.OPTION_3, "Rs. 300");
        values.put(Parameters.OPTION_4, "None of these");
        values.put(Parameters.ANSWER, "Rs. 250");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        values.put(Parameters.QUES_NO, 10);
        values.put(Parameters.QUESTION, "Three candidates contested an election and received 1136, 7636 and 11628 votes respectively. What percentage of the total votes did the winning candidate get?");
        values.put(Parameters.OPTION_1, "57%");
        values.put(Parameters.OPTION_2, "60%");
        values.put(Parameters.OPTION_3, "65%");
        values.put(Parameters.OPTION_4, "90%");
        values.put(Parameters.ANSWER, "57%");

        db.insert(Parameters.QUES_TABLE, null, values);
        values.clear();

        db.close();
    }

    public ArrayList<QuestionsModel> getTableData(int quesNo){
        ArrayList<QuestionsModel> list= new ArrayList<>();
        SQLiteDatabase db= this.getReadableDatabase();

        if (!isTableExists(db, Parameters.QUES_TABLE)) {
            // Table does not exist, return an empty list
            db.close();
            return list;
        }

        String select= "SELECT * FROM "+Parameters.QUES_TABLE+" WHERE "+Parameters.QUES_NO+" = ?";
        Cursor cursor= db.rawQuery(select, new String[]{String.valueOf(quesNo)});

        if(cursor.moveToFirst()){
            do{
                QuestionsModel questions= new QuestionsModel();
                questions.setQuesNo(cursor.getInt(0));
                questions.setQues(cursor.getString(1));
                questions.setOption1(cursor.getString(2));
                questions.setOption2(cursor.getString(3));
                questions.setOption3(cursor.getString(4));
                questions.setOption4(cursor.getString(5));
                questions.setAns(cursor.getString(6));

                list.add(questions);

            }while (cursor.moveToNext());
        }
        cursor.close();
        return list;
    }

    public ArrayList<QuestionsModel> getTableData(){
        ArrayList<QuestionsModel> list= new ArrayList<>();
        SQLiteDatabase db= this.getReadableDatabase();

        String select= "SELECT * FROM "+Parameters.QUES_TABLE;
        Cursor cursor= db.rawQuery(select, null);

        if(cursor.moveToFirst()){
            do{
                QuestionsModel questions= new QuestionsModel();
                questions.setQuesNo(cursor.getInt(0));
                questions.setQues(cursor.getString(1));
                questions.setOption1(cursor.getString(2));
                questions.setOption2(cursor.getString(3));
                questions.setOption3(cursor.getString(4));
                questions.setOption4(cursor.getString(5));
                questions.setAns(cursor.getString(6));

                list.add(questions);

            }while (cursor.moveToNext());
        }
        cursor.close();
        return list;
    }

    public void deleteRows(){
        SQLiteDatabase db = this.getWritableDatabase();
        if (!isTableExists(db, Parameters.QUES_TABLE)) {
            // Table does not exist, return an empty list
            db.close();
            return;
        }
        String delete= "DELETE FROM "+Parameters.QUES_TABLE;
        db.execSQL(delete);
    }
    private boolean isTableExists(SQLiteDatabase db, String tableName) {
        Cursor cursor = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[] { tableName });
        boolean exists = cursor.moveToFirst();
        cursor.close();
        return exists;
    }
}
