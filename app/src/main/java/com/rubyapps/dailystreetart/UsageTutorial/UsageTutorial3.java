package com.rubyapps.dailystreetart.UsageTutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.rubyapps.dailystreetart.R;

public class UsageTutorial3 extends AppCompatActivity {
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usage_tutorial3);
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 > x2){
                    Intent i = new Intent(UsageTutorial3.this, UsageTutorial4.class);
                    startActivity(i);
                    UsageTutorial3.this.finish();
                    overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
                }
                else if(x2 > x1){
                    Intent i = new Intent(UsageTutorial3.this, UsageTutorial2.class);
                    startActivity(i);
                    UsageTutorial3.this.finish();
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_right);
                }
                break;
        }
        return false;
    }
}
