package com.rubyapps.dailystreetart.UsageTutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import com.rubyapps.dailystreetart.MainActivity;
import com.rubyapps.dailystreetart.R;

public class UsageTutorial4 extends AppCompatActivity {
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usage_tutorial4);
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
                    Intent i = new Intent(UsageTutorial4.this, MainActivity.class);
                    startActivity(i);
                    UsageTutorial4.this.finish();
                    overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_left);
                }
                else if(x2 > x1){
                    Intent i = new Intent(UsageTutorial4.this, UsageTutorial3.class);
                    startActivity(i);
                    UsageTutorial4.this.finish();
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_right);
                }
                break;
        }
        return false;
    }
}
