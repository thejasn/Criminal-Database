package com.example.thejasnanjunda.criminaldatabase;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        final SharedPreferences sp = this.getSharedPreferences("Login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Username","admin");
        editor.putString("Password","admin");
        editor.commit();
        final EditText username,password;
        FloatingActionButton signin ;

        username = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        signin = (FloatingActionButton) findViewById(R.id.signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals(sp.getString("Username","lalala")) && password.getText().toString().equals(sp.getString("Password","empty")))
                {
                    finish();
                    startActivity(new Intent(Login.this,Menu.class).putExtra("user","admin"));
                }
                else
                {
                    Toast.makeText(Login.this, "Incorrect Credentials For Login", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
