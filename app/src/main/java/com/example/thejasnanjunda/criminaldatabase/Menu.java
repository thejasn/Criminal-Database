package com.example.thejasnanjunda.criminaldatabase;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button insert,search,view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        insert = (Button) findViewById(R.id.Insert);
        search = (Button) findViewById(R.id.Search);
        view  = (Button) findViewById(R.id.view);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("SAVED_UID",MODE_PRIVATE);
        if(!sp.contains("PRISONER_UID"))
        {
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("PRISONER_UID",0);
            editor.commit();
        }

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Inserting.class));

            }
        });
        /*search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Searching.class));
            }
        });*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Viewing.class));
            }
        });
    }

}
