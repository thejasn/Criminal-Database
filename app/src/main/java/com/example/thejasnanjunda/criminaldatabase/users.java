package com.example.thejasnanjunda.criminaldatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        ImageButton user,admin;
        user = (ImageButton) findViewById(R.id.imageButton4);
        admin = (ImageButton) findViewById(R.id.imageButton);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(users.this,Menu.class);
                i.putExtra("user","normal");
                startActivity(i);
                Toast.makeText(users.this, "normal", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(users.this,Login.class));
                finish();
            }
        });
    }
}
