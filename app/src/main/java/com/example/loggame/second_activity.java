package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_activity extends AppCompatActivity {
    Button btnFigur;
    Button btnColor;
    Button btnFigurAndColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        btnFigur = findViewById(R.id.buttonFigur);
        btnColor = findViewById(R.id.buttonColor);
        btnFigurAndColor = findViewById(R.id.buttonFigurAndColor);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_activity.this, randomColor.class);
                startActivity(intent);
            }
        });
        btnFigur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_activity.this, randomFigure.class);
                startActivity(intent);
            }
        });
        btnFigurAndColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second_activity.this, randomFigureAndColor.class);
                startActivity(intent);
            }
        });
    }
}
