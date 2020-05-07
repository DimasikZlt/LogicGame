package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class randomFigure extends AppCompatActivity {
    ImageButton imBtn;
    public final static String tag = "FigureButton";
    public static final String APP_PREFERENCES = "levelOfDifficulty";
    public static final String APP_PREFERENCES_TIME = "PRTime";
    int mSecondsTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figur);
        imBtn = findViewById(R.id.btnFigure);
        final int[] pictures = {
                R.drawable.box,
                R.drawable.rectangle,
                R.drawable.circle,
                R.drawable.elipse,
                R.drawable.romb,
                R.drawable.triangle
        };
        final int indexOfPicture = (int) (Math.random() * 6);
        imBtn.setImageResource(pictures[indexOfPicture]);
        final Intent intent = new Intent(randomFigure.this, figures_buttons.class);
        intent.putExtra(tag, indexOfPicture);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
            }
        };
        SharedPreferences mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        if (mSettings.contains(APP_PREFERENCES_TIME)) {
            mSecondsTime = mSettings.getInt(APP_PREFERENCES_TIME, 0);
        }
        timer.schedule(timerTask, mSecondsTime);
    }
}
