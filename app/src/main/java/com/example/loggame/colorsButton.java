package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colorsButton extends AppCompatActivity {
    Button red;
    Button yellow;
    Button green;
    Button blue;
    Button mazarine;
    Button purple;
    Button orange;
    Button indigo;
    Button TrueOrFalse;
    Button resetColor;
    Button exitColor;
    String color;
    boolean isCorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors_button);
        red = findViewById(R.id.btnRed);
        yellow = findViewById(R.id.btnYellow);
        green = findViewById(R.id.btnGreen);
        blue = findViewById(R.id.btnBlue);
        mazarine = findViewById(R.id.btnMazarine);
        purple = findViewById(R.id.btnPurple);
        orange = findViewById(R.id.btnOrange);
        indigo = findViewById(R.id.btnIndigo);
        TrueOrFalse = findViewById(R.id.bntTrueOrFalse);
        resetColor = findViewById(R.id.buttonResetColor);
        exitColor = findViewById(R.id.buttonExitColor);
        Bundle argument = getIntent().getExtras();
        color = argument.get("ColorButton").toString();
        isCorrect = false;
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#FF0000")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не красный. Попробуй еще раз!");
                }
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#FFFF00")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно , не желтый. Попробуй еще раз!");
                }
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#00FF00")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не зеленый. Попробуй еще раз!");
                }
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#00FFFF")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не голубой. Попробуй еще раз!");
                }
            }
        });
        mazarine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#0000FF")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не синий. Попробуй еще раз!");
                }
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#FF00FF")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не розовый. Попробуй еще раз!");
                }
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#FF4500")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не оранжевый. Попробуй еще раз!");
                }
            }
        });
        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && color.equals("#4B0082")) {
                    isCorrect = true;
                    resetColor.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не фиолетовый. Попробуй еще раз!");
                }
            }
        });
        exitColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(colorsButton.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        resetColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCorrect) {
                    Intent intent = new Intent(colorsButton.this, randomColor.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            }
        });

    }
}
