package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Objects;

public class figures_buttons extends AppCompatActivity {
    ImageButton buttonBox;
    ImageButton buttonRectangle;
    ImageButton buttonCircle;
    ImageButton buttonElipse;
    ImageButton buttonRomb;
    ImageButton buttonTriangle;
    Button TrueOrFalse;
    Button reset;
    Button exit;
    boolean isCorrect;
    int figure;
    MediaPlayer wrong;
    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figures_buttons);
        buttonBox = findViewById(R.id.btnBox);
        buttonRectangle = findViewById(R.id.btnRectangle);
        buttonCircle = findViewById(R.id.btnCircle);
        buttonElipse = findViewById(R.id.btnElipse);
        buttonRomb = findViewById(R.id.btnRomb);
        buttonTriangle = findViewById(R.id.btnTriangle);
        TrueOrFalse = findViewById(R.id.bntTrueOrFalseFigure);
        reset = findViewById(R.id.buttonResetFigure);
        exit = findViewById(R.id.buttonExitFigure);
        wrong = MediaPlayer.create(this, R.raw.wrong);
        correct = MediaPlayer.create(this, R.raw.correctly);
        isCorrect = false;
        Bundle argument = getIntent().getExtras();
        figure = Integer.parseInt(argument.get("FigureButton").toString());
        buttonBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 0) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("\nВЕРНО!\n");
                    TrueOrFalse.setTextColor(Color.parseColor("#008000"));
                    correct.start();
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно!\nЭто не квадрат.\nПопробуй еще!");
                    TrueOrFalse.setTextColor(Color.parseColor("#FF0000"));
                    wrong.start();
                }
            }
        });
        buttonRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 1) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("\nВЕРНО!\n");
                    TrueOrFalse.setTextColor(Color.parseColor("#008000"));
                    correct.start();
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно!\nЭто не прямоугольник.\nПопробуй еще!");
                    TrueOrFalse.setTextColor(Color.parseColor("#FF0000"));
                    wrong.start();
                }
            }
        });
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 2) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("\nВЕРНО!\n");
                    TrueOrFalse.setTextColor(Color.parseColor("#008000"));
                    correct.start();
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно!\nЭто не круг.\nПопробуй еще!");
                    TrueOrFalse.setTextColor(Color.parseColor("#FF0000"));
                    wrong.start();
                }
            }
        });
        buttonElipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 3) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("\nВЕРНО!\n");
                    TrueOrFalse.setTextColor(Color.parseColor("#008000"));
                    correct.start();
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно!\nЭто не овал.\nПопробуй еще!");
                    TrueOrFalse.setTextColor(Color.parseColor("#FF0000"));
                    wrong.start();
                }
            }
        });
        buttonRomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 4) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("\nВЕРНО!\n");
                    TrueOrFalse.setTextColor(Color.parseColor("#008000"));
                    correct.start();
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно!\nЭто не ромб.\nПопробуй еще!");
                    TrueOrFalse.setTextColor(Color.parseColor("#FF0000"));
                    wrong.start();
                }
            }
        });
        buttonTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 5) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("\nВЕРНО!\n");
                    TrueOrFalse.setTextColor(Color.parseColor("#008000"));
                    correct.start();
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно!\nЭто не треугольник.\nПопробуй еще!");
                    TrueOrFalse.setTextColor(Color.parseColor("#FF0000"));
                    wrong.start();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCorrect) {
                    Intent intent = new Intent(figures_buttons.this, randomFigure.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(figures_buttons.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
