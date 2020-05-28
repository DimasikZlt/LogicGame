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
    public final static String tagCAF = "Figure";
    public static final String APP_PREFERENCES = "levelOfDifficulty";
    public static final String APP_PREFERENCES_TIME = "PRTime";
    int mSecondsTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figur_and_color);
        btnFigureAndColor = findViewById(R.id.btnFigureAndColor);
        final int[] pictures = {
                R.drawable.box_blue,
                R.drawable.box_orange,
                R.drawable.box_red,
                R.drawable.box_mazarin,
                R.drawable.box_indigo,
                R.drawable.box_green,
                R.drawable.box_pirple,
                R.drawable.box_yellow,
                R.drawable.circle_blue,
                R.drawable.circle_orange,
                R.drawable.circle_red,
                R.drawable.circle_mazarin,
                R.drawable.circle_indigo,
                R.drawable.circle_green,
                R.drawable.circle_pirple,
                R.drawable.circle_yellow,
                R.drawable.elipse_blue,
                R.drawable.elipse_orange,
                R.drawable.elipse_red,
                R.drawable.elipse_mazarin,
                R.drawable.elipse_indigo,
                R.drawable.elipse_grenn,
                R.drawable.elipse_pirple,
                R.drawable.elipse_yellow,
                R.drawable.rectangle_blue,
                R.drawable.rectangle_orange,
                R.drawable.rectangle_red,
                R.drawable.rectangle_mazarin,
                R.drawable.rectangle_indigo,
                R.drawable.rectangle_green,
                R.drawable.rectangle_pirple,
                R.drawable.rectangle_yellow,
                R.drawable.romb_blue,
                R.drawable.romb_orange,
                R.drawable.romb_red,
                R.drawable.romb_mazarin,
                R.drawable.romb_indigo,
                R.drawable.romb_green,
                R.drawable.romb_pirple,
                R.drawable.romb_yellow,
                R.drawable.triangle_blue,
                R.drawable.triangle_orange,
                R.drawable.triangle_red,
                R.drawable.triangle_mazarin,
                R.drawable.triangle_indigo,
                R.drawable.triangle_green,
                R.drawable.triangle_pirple,
                R.drawable.triangle_yellow,
        };
        final int indexOfPicture = (int) (Math.random() * 48);
        btnFigureAndColor.setImageResource(pictures[indexOfPicture]);
        final Intent intent = new Intent(randomFigureAndColor.this, FigureAndColorButtons.class);
        intent.putExtra(tagCAF, pictures[indexOfPicture]);
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
