package com.example.loggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FigureAndColorButtons extends AppCompatActivity {
    Button resetCAF;
    Button exitCAF;
    ImageButton rectangleRed;
    ImageButton triangleRed;
    ImageButton circleRed;
    ImageButton rombRed;
    ImageButton boxRed;
    ImageButton elipseRed;
    ImageButton rectanglePurple;
    ImageButton trianglePurple;
    ImageButton circlePurple;
    ImageButton rombPurple;
    ImageButton boxPurple;
    ImageButton elipsePurple;
    ImageButton rectangleYellow;
    ImageButton triangleYellow;
    ImageButton circleYellow;
    ImageButton rombYellow;
    ImageButton boxYellow;
    ImageButton elipseYellow;
    ImageButton rectangleGreen;
    ImageButton triangleGreen;
    ImageButton circleGreen;
    ImageButton rombGreen;
    ImageButton boxGreen;
    ImageButton elipseGreen;
    ImageButton rectangleBlue;
    ImageButton triangleBlue;
    ImageButton circleBlue;
    ImageButton rombBlue;
    ImageButton boxBlue;
    ImageButton elipseBlue;
    ImageButton rectangleMazarin;
    ImageButton triangleMazarin;
    ImageButton circleMazarin;
    ImageButton rombMazarin;
    ImageButton boxMazarin;
    ImageButton elipseMazarin;
    ImageButton rectangleOrange;
    ImageButton triangleOrange;
    ImageButton circleOrange;
    ImageButton rombOrange;
    ImageButton boxOrange;
    ImageButton elipseOrange;
    ImageButton rectangleIndigo;
    ImageButton triangleIndigo;
    ImageButton circleIndigo;
    ImageButton rombIndigo;
    ImageButton boxIndigo;
    ImageButton elipseIndigo;
    int figure;
    boolean isCorrect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure_and_color_buttons);
        resetCAF = findViewById(R.id.buttonResetCAF);
        exitCAF = findViewById(R.id.buttonExitCAF);
        rectangleRed = findViewById(R.id.rectangleRed);
        triangleRed = findViewById(R.id.triangleRed);
        circleRed = findViewById(R.id.circleRed);
        rombRed = findViewById(R.id.rombRed);
        boxRed = findViewById(R.id.boxRed);
        elipseRed = findViewById(R.id.elipseRed);
        rectanglePurple = findViewById(R.id.rectanglePurple);
        trianglePurple = findViewById(R.id.trianglePurple);
        circlePurple = findViewById(R.id.circlePurple);
        rombPurple = findViewById(R.id.rombPurple);
        boxPurple = findViewById(R.id.boxPurple);
        elipsePurple = findViewById(R.id.elipsePurple);
        rectangleYellow = findViewById(R.id.rectangleYellow);
        triangleYellow = findViewById(R.id.triangleYellow);
        circleYellow = findViewById(R.id.circleYellow);
        rombYellow = findViewById(R.id.rombYellow);
        boxYellow = findViewById(R.id.boxYellow);
        elipseYellow = findViewById(R.id.elipseYellow);
        rectangleGreen = findViewById(R.id.rectangleGreen);
        triangleGreen = findViewById(R.id.triangleGreen);
        circleGreen = findViewById(R.id.circleGreen);
        rombGreen = findViewById(R.id.rombGreen);
        boxGreen = findViewById(R.id.boxGreen);
        elipseGreen = findViewById(R.id.elipseGreen);
        rectangleBlue = findViewById(R.id.rectangleBlue);
        triangleBlue = findViewById(R.id.triangleBlue);
        circleBlue = findViewById(R.id.circleBlue);
        rombBlue = findViewById(R.id.rombBlue);
        boxBlue = findViewById(R.id.boxBlue);
        elipseBlue = findViewById(R.id.elipseBlue);
        rectangleMazarin = findViewById(R.id.rectangleMazarin);
        triangleMazarin = findViewById(R.id.triangleMazarin);
        circleMazarin = findViewById(R.id.circleMazarin);
        rombMazarin = findViewById(R.id.rombMazarin);
        boxMazarin = findViewById(R.id.boxMazarin);
        elipseMazarin = findViewById(R.id.elipseMazarin);
        rectangleOrange = findViewById(R.id.rectangleOrange);
        triangleOrange = findViewById(R.id.triangleOrange);
        circleOrange = findViewById(R.id.circleOrange);
        rombOrange = findViewById(R.id.rombOrange);
        boxOrange = findViewById(R.id.boxOrange);
        elipseOrange = findViewById(R.id.elipseOrange);
        rectangleIndigo = findViewById(R.id.rectangleIndigo);
        triangleIndigo = findViewById(R.id.triangleIndigo);
        circleIndigo = findViewById(R.id.circleIndigo);
        rombIndigo = findViewById(R.id.rombIndigo);
        boxIndigo = findViewById(R.id.boxIndigo);
        elipseIndigo = findViewById(R.id.elipseIndigo);
        Bundle argument = getIntent().getExtras();
        figure = Integer.parseInt(argument.get("Figure").toString());
        isCorrect = false;
        resetCAF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCorrect) {
                    Intent intent = new Intent(FigureAndColorButtons.this, randomFigureAndColor.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            }
        });
        exitCAF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FigureAndColorButtons.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        rectangleRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_red) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleRed.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleRed.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_red) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleRed.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleRed.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_red) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleRed.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleRed.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_red) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombRed.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombRed.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_red) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxRed.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxRed.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_red) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseRed.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseRed.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectanglePurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_pirple) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectanglePurple.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectanglePurple.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        trianglePurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_pirple) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    trianglePurple.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    trianglePurple.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circlePurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_pirple) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circlePurple.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circlePurple.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_pirple) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombPurple.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombPurple.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_pirple) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxPurple.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxPurple.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipsePurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_pirple) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipsePurple.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipsePurple.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectangleYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_yellow) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleYellow.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleYellow.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_yellow) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleYellow.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleYellow.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_yellow) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleYellow.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleYellow.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_yellow) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombYellow.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombYellow.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_yellow) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxYellow.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxYellow.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_yellow) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseYellow.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseYellow.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectangleGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_green) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleGreen.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleGreen.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_green) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleGreen.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleGreen.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_green) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleGreen.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleGreen.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_green) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombGreen.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombGreen.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_green) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxGreen.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxGreen.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_grenn) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseGreen.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseGreen.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectangleBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_blue) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleBlue.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleBlue.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_blue) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleBlue.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleBlue.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_blue) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleBlue.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleBlue.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_blue) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombBlue.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombBlue.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_blue) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxBlue.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxBlue.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_blue) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseBlue.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseBlue.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectangleMazarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_mazarin) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleMazarin.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleMazarin.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleMazarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_mazarin) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleMazarin.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleMazarin.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleMazarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_mazarin) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleMazarin.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleMazarin.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombMazarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_mazarin) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombMazarin.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombMazarin.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxMazarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_mazarin) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxMazarin.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxMazarin.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseMazarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_mazarin) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseMazarin.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseMazarin.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectangleOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_orange) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleOrange.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleOrange.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_orange) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleOrange.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleOrange.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_orange) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleOrange.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleOrange.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_orange) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombOrange.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombOrange.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_orange) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxOrange.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxOrange.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_orange) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseOrange.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseOrange.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rectangleIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.rectangle_indigo) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rectangleIndigo.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rectangleIndigo.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        triangleIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.triangle_indigo) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    triangleIndigo.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    triangleIndigo.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        circleIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.circle_indigo) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    circleIndigo.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    circleIndigo.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rombIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.romb_indigo) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    rombIndigo.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    rombIndigo.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        boxIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.box_indigo) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    boxIndigo.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    boxIndigo.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        elipseIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isCorrect && figure == R.drawable.elipse_indigo) {
                    isCorrect = true;
                    resetCAF.setVisibility(View.VISIBLE);
                    elipseIndigo.setImageResource(R.drawable.true_picture);
                    Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();
                } else if (!isCorrect) {
                    elipseIndigo.setImageResource(R.drawable.false_picture);
                    Toast.makeText(getApplicationContext(), "Неверно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
