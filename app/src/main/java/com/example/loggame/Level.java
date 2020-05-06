package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level extends AppCompatActivity {
    Button btnVE;
    Button btnE;
    Button btnN;
    Button btnH;
    Button btnVH;
    Button btnIM;
    public static final String APP_PREFERENCES = "levelOfDifficulty";
    public static final String APP_PREFERENCES_TIME = "PRTime";
    private SharedPreferences mSettings;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        btnVE = findViewById(R.id.buttonVeryEasy);
        btnE = findViewById(R.id.buttonEasy);
        btnN = findViewById(R.id.buttonNormal);
        btnH = findViewById(R.id.buttonHard);
        btnVH = findViewById(R.id.buttonVeryHard);
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        editor = mSettings.edit();
        btnVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt(APP_PREFERENCES_TIME, 5000);
                editor.apply();
                if (mSettings.contains(APP_PREFERENCES_TIME)) {
                    if (mSettings.getInt(APP_PREFERENCES_TIME, 0) == 5000) {
                        Toast.makeText(getApplicationContext(), "Уровень сложности: 'Очень Легко'", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(Level.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt(APP_PREFERENCES_TIME, 3000);
                editor.apply();
                if (mSettings.contains(APP_PREFERENCES_TIME)) {
                    if (mSettings.getInt(APP_PREFERENCES_TIME, 0) == 3000) {
                        Toast.makeText(getApplicationContext(), "Уровень сложности: 'Легко'", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(Level.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt(APP_PREFERENCES_TIME, 1000);
                editor.apply();
                if (mSettings.contains(APP_PREFERENCES_TIME)) {
                    if (mSettings.getInt(APP_PREFERENCES_TIME, 0) == 1000) {
                        Toast.makeText(getApplicationContext(), "Уровень сложности: 'Нормально'", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(Level.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt(APP_PREFERENCES_TIME, 500);
                editor.apply();
                if (mSettings.contains(APP_PREFERENCES_TIME)) {
                    if (mSettings.getInt(APP_PREFERENCES_TIME, 0) == 500) {
                        Toast.makeText(getApplicationContext(), "Уровень сложности: 'Сложно'", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(Level.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        btnVH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt(APP_PREFERENCES_TIME, 250);
                editor.apply();
                if (mSettings.contains(APP_PREFERENCES_TIME)) {
                    if (mSettings.getInt(APP_PREFERENCES_TIME, 0) == 250) {
                        Toast.makeText(getApplicationContext(), "Уровень сложности: 'Очень Сложно'", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(Level.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
