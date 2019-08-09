package com.android.praiyawang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class FotoDetailActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView imageView;
    JustifiedTextView txtKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_detail);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detail Foto");

        txtKeterangan = findViewById(R.id.txtGaleri);
        imageView = findViewById(R.id.imageDetail);
        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
        txtKeterangan.setText(intent.getIntExtra("keterangan", 0));
    }
}
