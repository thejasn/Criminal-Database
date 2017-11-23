package com.example.thejasnanjunda.criminaldatabase;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {


    private TextView app_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_screen);

        ImageView logo = (ImageView) findViewById(R.id.imgLogo);
        app_name = (TextView) findViewById(R.id.app_name);
        app_name.setVisibility(View.INVISIBLE);
        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.pop);
        final Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        logo.startAnimation(scale);
        app_name.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(HomeScreen.this,users.class);
                startActivity(i);

                finish();
            }
        },1700);
    }
}
