package com.example.thejasnanjunda.criminaldatabase;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Searching extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        Button query1 = (Button) findViewById(R.id.query1);
        Button query2 = (Button) findViewById(R.id.query2);
        Button query3 = (Button) findViewById(R.id.query3);
        Button aggregate = (Button) findViewById(R.id.aggregate);

        TextInputLayout input_layout_age = (TextInputLayout) findViewById(R.id.input_layout_Gage);
        final EditText Gage = (EditText)findViewById(R.id.Gage);

        TextInputLayout input_layout_Pcell = (TextInputLayout) findViewById(R.id.input_layout_PCell);
        final EditText Pcell = (EditText)findViewById(R.id.Pcell);
        TextInputLayout input_layout_Pcrime = (TextInputLayout) findViewById(R.id.input_layout_Pcrime);
        final EditText Pcrime = (EditText)findViewById(R.id.Pcrime);
        query1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Searching.this,ViewQuery.class);
                i.putExtra("query","1");
                i.putExtra("check",Gage.getText().toString());
                Gage.setText("");
                startActivity(i);
            }
        });
        query2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Searching.this,ViewQuery.class);
                i.putExtra("query","2");
                i.putExtra("check",Pcell.getText().toString());
                Pcell.setText("");
                startActivity(i);

            }
        });
        query3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Searching.this,ViewQuery.class);
                i.putExtra("query","3");
                i.putExtra("check",Pcrime.getText().toString());
                Pcrime.setText("");
                startActivity(i);
            }
        });
        aggregate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Searching.this,Aggregate.class));
            }
        });

    }
}
