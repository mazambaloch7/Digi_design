package com.example.digi_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Activity_SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__splash_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView imageView = findViewById(R.id.image_view);
                Glide.with(Activity_SplashScreen.this).load(R.drawable.splash).into(imageView);
            }
        },2550);

        new  Handler().postDelayed(new Runnable() {
                                       @Override
                                       public void run() {
                                           ImageView imageView = (ImageView) findViewById(R.id.image_view);

                                           Glide.with(Activity_SplashScreen.this).load(R.drawable.splash).into(imageView);


                                           Intent intent = new Intent(Activity_SplashScreen.this, Activity_Login.class);
                                           startActivity(intent);
                                       }
                                   },3000
        );
    }
}
