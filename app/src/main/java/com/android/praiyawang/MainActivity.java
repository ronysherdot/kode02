package com.android.praiyawang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardSejarah, cardKebudayaan;
    Toolbar toolbar;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Konten Pilihan");

        cardSejarah = findViewById(R.id.cardSejarah);
        cardKebudayaan = findViewById(R.id.cardKebudayaan);

        cardSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarah = new Intent(MainActivity.this, SejarahActivity.class);
                startActivity(sejarah);
                finish();
            }
        });

        cardKebudayaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kebudayaan = new Intent(MainActivity.this, KebudayaanActivity.class);
                startActivity(kebudayaan);
                finish();
            }
        });
    }
}
