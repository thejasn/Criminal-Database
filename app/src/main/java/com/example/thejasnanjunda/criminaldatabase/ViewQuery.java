package com.example.thejasnanjunda.criminaldatabase;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class ViewQuery extends AppCompatActivity {

    //private
    private SimpleCursorAdapter dataAdapter;
    private DBHelper dbHelper = new DBHelper(this);
    TextView col1,col2,col3,col4,col5,col6;

    private void make_quer1_visible()
    {
        col1.setVisibility(View.VISIBLE);
        col2.setVisibility(View.VISIBLE);
        col3.setVisibility(View.VISIBLE);
    }
    private void executeQuery2(String check){
        make_quer1_visible();
        Cursor cursor = dbHelper.viewQuery2(check);

        String columns[] = new String[]{
                dbHelper.PF_NAME,
                dbHelper.PM_NAME,
                dbHelper.PL_NAME,
        };

        int[] to = new int[]{
                R.id.first_name,
                R.id.middle_name,
                R.id.last_name,
        };

        dataAdapter = new SimpleCursorAdapter(
                this,R.layout.query_one,
                cursor,
                columns,
                to,
                0
        );

    }
    private void executeQuery1(String check){
        make_quer1_visible();
        Cursor cursor = dbHelper.viewQuery1(check);

        String columns[] = new String[]{
                dbHelper.GF_NAME,
                dbHelper.GM_NAME,
                dbHelper.GL_NAME,
        };

        int[] to = new int[]{
                R.id.first_name,
                R.id.middle_name,
                R.id.last_name,
        };

        dataAdapter = new SimpleCursorAdapter(
                this,R.layout.query_one,
                cursor,
                columns,
                to,
                0
        );

    }
    private void executeQuery3(String check){
        col4.setVisibility(View.VISIBLE);
        col5.setVisibility(View.VISIBLE);
        col6.setVisibility(View.VISIBLE);
        Cursor cursor = dbHelper.viewQuery3(check);

        String columns[] = new String[]{
                dbHelper.PF_NAME,
                dbHelper.P_CRIMES,
                dbHelper.P_SENTENCE,
        };

        int[] to = new int[]{
                R.id.first_name,
                R.id.middle_name,
                R.id.last_name,
        };

        dataAdapter = new SimpleCursorAdapter(
                this,R.layout.query_one,
                cursor,
                columns,
                to,
                0
        );

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_query);

        col1 = (TextView) findViewById(R.id.FIRST_NAME);
        col2 = (TextView) findViewById(R.id.MIDDLE_NAME);
        col3 = (TextView) findViewById(R.id.LAST_NAME);

        col4 = (TextView) findViewById(R.id.FIRST_NAME1);
        col5 = (TextView) findViewById(R.id.crime);
        col6 = (TextView) findViewById(R.id.sentence);

        col1.setVisibility(View.INVISIBLE);
        col2.setVisibility(View.INVISIBLE);
        col3.setVisibility(View.INVISIBLE);
        col4.setVisibility(View.INVISIBLE);
        col5.setVisibility(View.INVISIBLE);
        col6.setVisibility(View.INVISIBLE);
        Intent i = getIntent();
        String check;
        switch(Integer.parseInt(i.getStringExtra("query")))
        {
            case 1: check = i.getStringExtra("check");
                    executeQuery1(check);
                    break;
            case 2: check = i.getStringExtra("check");
                    executeQuery2(check);
                    break;
            case 3: check = i.getStringExtra("check");
                    executeQuery3(check);
                    break;
        }


        ListView listView = (ListView) findViewById(R.id.list_query1);
        listView.setAdapter(dataAdapter);


    }
}
