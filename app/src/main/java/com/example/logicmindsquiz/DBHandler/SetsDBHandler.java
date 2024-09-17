package com.example.logicmindsquiz.DBHandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class SetsDBHandler extends SQLiteOpenHelper {

    public SetsDBHandler(@Nullable Context context) {
        super(context, Parameters.DB_NAME, null, Parameters.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create= "CREATE TABLE "+Parameters.SETS_TABLE+" ("+Parameters.TOPIC+" TEXT, "+Parameters.TOTAL_SETS+" INTEGER)";
        db.execSQL(create);
        Log.d("abc","table created ");

        String create2 = "CREATE TABLE " + Parameters.QUES_TABLE + " ("
                + Parameters.QUES_NO + " INTEGER,"
                + Parameters.QUESTION + " TEXT,"
                + Parameters.OPTION_1 + " TEXT,"
                + Parameters.OPTION_2 + " TEXT,"
                + Parameters.OPTION_3 + " TEXT,"
                + Parameters.OPTION_4 + " TEXT,"
                + Parameters.ANSWER + " TEXT )";
        db.execSQL(create2);
        Log.d("abc", "question table created ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addSetsTableData() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Parameters.TOPIC, "Number Series"); // Assuming "TOPIC" is the column name in your table
        values.put(Parameters.TOTAL_SETS, 5);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Artificial Language");
        values.put(Parameters.TOTAL_SETS, 2);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Calender");
        values.put(Parameters.TOTAL_SETS, 1);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Blood Relations");
        values.put(Parameters.TOTAL_SETS, 3);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Direction Sense Test");
        values.put(Parameters.TOTAL_SETS, 2);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Average");
        values.put(Parameters.TOTAL_SETS, 3);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Problem on Ages");
        values.put(Parameters.TOTAL_SETS, 2);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Partnership");
        values.put(Parameters.TOTAL_SETS, 2);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Boats and Streams");
        values.put(Parameters.TOTAL_SETS, 2);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Percentage");
        values.put(Parameters.TOTAL_SETS, 3);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        values.put(Parameters.TOPIC, "Spot the errors");
        values.put(Parameters.TOTAL_SETS, 2);

        db.insert(Parameters.SETS_TABLE, null, values);
        values.clear();

        db.close();
        Log.d("abc", "data added");
    }


    public int getNoSets(String topicN) {
        int num = 0;
        SQLiteDatabase db = this.getReadableDatabase();

        String select = "SELECT " + Parameters.TOTAL_SETS + " FROM " + Parameters.SETS_TABLE + " WHERE " + Parameters.TOPIC + " = ?";
        Cursor cursor = db.rawQuery(select, new String[]{topicN});

        if (cursor.moveToFirst()) {
            // Since you are retrieving only one column, use cursor.getInt(0)
            num = cursor.getInt(0);
        }

        // Close cursor and database to avoid memory leaks
        cursor.close();
        db.close();
        Log.d("abc", "data retrieved");

        return num;
    }
}
