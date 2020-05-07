package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class randomFigureAndColor extends AppCompatActivity {
    ImageButton btnFigureAndColor;
    public final static String tagColor = "ColorButtonAndFigure";
    public final static String tagFigure = "FigureButtonAndColor";
    public static final String APP_PREFERENCES = "levelOfDifficulty";
    public static final String APP_PREFERENCES_TIME = "PRTime";
    int mSecondsTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figur_and_color);
        final String[] colors = {"#FF0000", "#FFFF00", "#00FF00", "#00FFFF", "#0000FF", "#FF00FF", "#FF4500", "#4B0082"};
        final String color = colors[(int) (Math.random() * 8)];
        btnFigureAndColor.setBackgroundColor(Color.parseColor(color));
        final int[] pictures = {
                R.drawable.box,
                R.drawable.rectangle,
                R.drawable.circle,
                R.drawable.elipse,
                R.drawable.romb,
                R.drawable.triangle
        };
        final int indexOfPicture = (int) (Math.random() * 6);
        btnFigureAndColor.setImageResource(pictures[indexOfPicture]);
        final Intent intent = new Intent(randomFigureAndColor.this, MainActivity.class);
        intent.putExtra(tagColor, color);
        intent.putExtra(tagFigure, indexOfPicture);
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
