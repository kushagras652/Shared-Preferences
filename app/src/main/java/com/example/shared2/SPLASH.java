package com.example.shared2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SPLASH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
                Boolean check=sharedPreferences.getBoolean("flag",false);

                Intent intent;
                if(check){
                    intent=new Intent(SPLASH.this,MainActivity.class);
                }
                else{
                    intent=new Intent(SPLASH.this,login.class);
                }
                startActivity(intent);
                finish();
            }
        },3000);
    }
}