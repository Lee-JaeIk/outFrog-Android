package com.example.lee.outfrog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lee on 2016-07-25.
 */
public class SplashActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                finish();
            }
        };

        /* ----- Splash -----
            1. 1초는 1000
            2. 3초 후에 handleMessage[0]을 실행하겠다.
        ------------------*/
        handler.sendEmptyMessageDelayed(0, 3000);
    }

}   // SplashActivity
