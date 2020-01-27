package com.rubyapps.dailystreetart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.rubyapps.dailystreetart.UsageTutorial.UsageTutorial1;

public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final boolean isFirstLogin = checkIsFirstLogin();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent;

                if (isFirstLogin){
                    mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                }
                else {
                    mainIntent = new Intent(SplashScreen.this, UsageTutorial1.class);
                }

                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

    private boolean checkIsFirstLogin() {
        SharedPreferences prefs = getSharedPreferences("isFirstLogin", MODE_PRIVATE);
        return prefs.getBoolean("isFirstLogin", false);
    }


}
