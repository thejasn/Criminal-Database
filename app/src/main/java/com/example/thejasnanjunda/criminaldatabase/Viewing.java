package com.example.thejasnanjunda.criminaldatabase;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Viewing extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DBHelper dbHelper = new DBHelper(this);
        List<Criminal> opList = dbHelper.getAllPrisoners();
        String log="";
        for(Criminal c: opList) {
            log = "Name: " + c.getF_name();
            Log.d("list" + Integer.toString(c.getUID()), log);
        }

    }
}
