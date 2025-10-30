package com.example.deportes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnBaseball, btnBasketball, btnCycling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBaseball = findViewById(R.id.btnBaseball);
        btnBasketball = findViewById(R.id.btnBasketball);
        btnCycling = findViewById(R.id.btnCycling);

        // Listener para Baseball
        btnBaseball.setOnClickListener(v -> openDetail(
                R.drawable.baseball,
                "Baseball",
                "El béisbol es un deporte de equipo jugado entre dos conjuntos de nueve jugadores. Se enfrentan bateando y defendiendo con guante y bate."
        ));

        // Listener para Basketball
        btnBasketball.setOnClickListener(v -> openDetail(
                R.drawable.basketball,
                "Basketball",
                "El baloncesto es un deporte en el que dos equipos de cinco jugadores intentan anotar puntos introduciendo una pelota en el aro del equipo contrario."
        ));

        // Listener para Cycling
        btnCycling.setOnClickListener(v -> openDetail(
                R.drawable.cycling,
                "Cycling",
                "El ciclismo es un deporte que consiste en montar una bicicleta y recorrer diferentes tipos de terrenos o pistas, ya sea por velocidad o resistencia."
        ));
    }

    private void openDetail(int imageRes, String title, String description) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("image", imageRes);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}