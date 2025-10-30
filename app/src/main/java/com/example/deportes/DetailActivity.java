package com.example.deportes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgSport;
    private TextView tvTitle, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgSport = findViewById(R.id.imgSport);
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);

        // Recuperar los datos del Intent
        int imageRes = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");

        // Mostrar los datos
        imgSport.setImageResource(imageRes);
        tvTitle.setText(title);
        tvDescription.setText(description);
    }
}