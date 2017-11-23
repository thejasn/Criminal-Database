package com.example.thejasnanjunda.criminaldatabase;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Aggregate extends AppCompatActivity {

    private DBHelper dbHelper = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggregate);
        TextView agg1v = (TextView) findViewById(R.id.agg1v);
        TextView agg2v = (TextView) findViewById(R.id.agg2v);
        TextView agg3v = (TextView) findViewById(R.id.agg3v);
        TextView agg4v = (TextView) findViewById(R.id.agg4v);

        Cursor cursor = dbHelper.min_guard_sal();
        agg1v.setText(cursor.getString(0));

        cursor = dbHelper.avg_guard_age();
        agg2v.setText(cursor.getString(0));

        cursor = dbHelper.visitor_duration();
        agg3v.setText(cursor.getString(0));

        cursor = dbHelper.guard_dependents();
        agg4v.setText(cursor.getString(0));

    }
}
