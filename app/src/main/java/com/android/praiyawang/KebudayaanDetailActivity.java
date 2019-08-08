package com.android.praiyawang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class KebudayaanDetailActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView imageView;
    JustifiedTextView justifiedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_detail);

        Intent intent = getIntent();
        int imageKebudayaan = intent.getIntExtra("image",0);
        int judulKebudayaan = intent.getIntExtra("judul",0);
        int kontenKebudayaan = intent.getIntExtra("konten",0);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(judulKebudayaan);

        imageView = findViewById(R.id.imageKebudayaan);
        imageView.setImageResource(imageKebudayaan);

        justifiedTextView = findViewById(R.id.txtKebudayaan);
        justifiedTextView.setText(kontenKebudayaan);
    }
}
