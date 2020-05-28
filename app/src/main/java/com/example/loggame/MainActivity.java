package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnStart;
    Button btnEnd;
    Button btnLevel;
    public static final String APP_PREFERENCES = "levelOfDifficulty";
    public static final String APP_PREFERENCES_TIME = "PRTime";
    MediaPlayer menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        if (mSettings.contains(APP_PREFERENCES_TIME)) {
            if (mSettings.getInt(APP_PREFERENCES_TIME, 0) == 0) {
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt(APP_PREFERENCES_TIME, 3000);
                editor.apply();
                Toast.makeText(getApplicationContext(), "Уровень сложности: 'Легко'", Toast.LENGTH_SHORT).show();
            }
        }
        btnStart = findViewById(R.id.buttonStart);
        btnEnd = findViewById(R.id.buttonEnd);
        btnLevel = findViewById(R.id.buttonLevel);
        menu = MediaPlayer.create(this, R.raw.click_button);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.start();
                finish();
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.start();
                Intent intent = new Intent(MainActivity.this, second_activity.class);
                startActivity(intent);
            }
        });
        btnLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.start();
                Intent intent = new Intent(MainActivity.this, Level.class);
                startActivity(intent);
            }
        });

    }
}