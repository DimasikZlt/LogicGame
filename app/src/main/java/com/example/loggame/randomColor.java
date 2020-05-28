package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class randomColor extends AppCompatActivity {
    Button button;
    public final static String tag = "ColorButton";
    public static final String APP_PREFERENCES = "levelOfDifficulty";
    public static final String APP_PREFERENCES_TIME = "PRTime";
    int mSecondsTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        button = findViewById(R.id.btnColorGo);
        final String[] colors = {"#FF0000", "#FFFF00", "#00FF00", "#00FFFF", "#0000FF", "#FF69B4", "#FF8C00", "#4B0082"};
        final String color = colors[(int) (Math.random() * 8)];
        button.setBackgroundColor(Color.parseColor(color));
        final Intent intent = new Intent(randomColor.this, colorsButton.class);
        intent.putExtra(tag, color);
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

