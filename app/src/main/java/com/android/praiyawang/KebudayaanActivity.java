package com.android.praiyawang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class KebudayaanActivity extends AppCompatActivity {

    ListView gridMenu;
    Toolbar toolbar;
    int[] kebudayaan1 = {
        R.drawable.marapu, R.drawable.belis, R.drawable.tenunikat, R.drawable.sirihpinang, R.drawable.tarikbatukubur, R.drawable.carousel4
    };

    int[] kebudayaan2 = {
            R.string.kebudayaan1, R.string.kebudayaan2,
            R.string.kebudayaan3, R.string.kebudayaan4,
            R.string.kebudayaan5, R.string.kebudayaan6
    };

    int[] kebudayaan3 = {
            R.string.kontenKebudayaan1, R.string.kontenKebudayaan2,
            R.string.kontenKebudayaan3, R.string.kontenKebudayaan4,
            R.string.kontenKebudayaan5, R.string.kontenKebudayaan6
    };

    @Override
    public void onBackPressed() {
        Intent back = new Intent(KebudayaanActivity.this, MainActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kebudayaan");

        gridMenu = findViewById(R.id.gridKebudayaan);
        KebudayaanAdapter kebudayaanAdapter = new KebudayaanAdapter(getApplicationContext(), kebudayaan1, kebudayaan2, kebudayaan3);
        gridMenu.setAdapter(kebudayaanAdapter);
        gridMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detail = new Intent(getApplicationContext(), KebudayaanDetailActivity.class);
                detail.putExtra("image", kebudayaan1[i]);
                detail.putExtra("judul", kebudayaan2[i]);
                detail.putExtra("konten", kebudayaan3[i]);
                detail.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(detail);
            }
        });
    }
}
