package com.example.firello02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerThread = new Thread(){

            public void run(){

                try{

                    sleep(2000);  // Sleep(süre) kısmı Splash Screen’in kaç saniye gözükeceğini belirtiyor.

                }catch(InterruptedException e){

                    e.printStackTrace();

                }finally{ //Thread çalıştıktan sonra finally kısmı çalışıyor ve programımız MainActivity classını başlatıyor.

                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);

                    startActivity(intent);

                }

            }

        };

        timerThread.start(); //Start() ise oluşturduğumuz Thread’ı başlatıyor

    }



    @Override

    protected void onPause() {

        super.onPause();

        finish();

    }

}
