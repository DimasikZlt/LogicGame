package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        isCorrect = false;
        Bundle argument = getIntent().getExtras();
        figure = Integer.parseInt(argument.get("FigureButton").toString());
        buttonBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 0) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не квадрат. Попробуй еще раз!");
                }
            }
        });
        buttonRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 1) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не прямоугольник. Попробуй еще раз!");
                }
            }
        });
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 2) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не круг. Попробуй еще раз!");
                }
            }
        });
        buttonElipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 3) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не овал. Попробуй еще раз!");
                }
            }
        });
        buttonRomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 4) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не ромб. Попробуй еще раз!");
                }
            }
        });
        buttonTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == 5) {
                    isCorrect = true;
                    reset.setVisibility(View.VISIBLE);
                    TrueOrFalse.setText("ВЕРНО!");
                } else if (!isCorrect) {
                    TrueOrFalse.setText("Неверно, не треугольник. Попробуй еще раз!");
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
