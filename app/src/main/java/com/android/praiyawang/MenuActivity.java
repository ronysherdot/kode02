package com.android.praiyawang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MenuActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    CardView cardKonten, cardGaleri, cardTentang, cardVisit;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert
                .setMessage("Apakah anda mau menutup Aplikasi ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MenuActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cardKonten = findViewById(R.id.cardKonten);
        cardGaleri = findViewById(R.id.cardGaleri);
        cardTentang = findViewById(R.id.cardTentang);
        cardVisit = findViewById(R.id.cardVisit);

        cardKonten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konten = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(konten);
                finish();
            }
        });

        cardGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galeri = new Intent(MenuActivity.this, GaleriActivity.class);
                startActivity(galeri);
                finish();
            }
        });

        cardTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tentang = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(tentang);
                finish();
            }
        });

        cardVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visit = new Intent(MenuActivity.this, VisitActivity.class);
                startActivity(visit);
                finish();
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kampung Adat Praiyangan");
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);

        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.exitApp:
                        AlertDialog.Builder alert = new AlertDialog.Builder(MenuActivity.this);
                        alert
                                .setMessage("Apakah anda mau menutup Aplikasi ?")
                                .setCancelable(false)
                                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        MenuActivity.this.finish();
                                    }
                                })
                                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alert.create();
                        alertDialog.show();
                        return true;
                    default:
                        return true;
                }
            }
        });

        drawerLayout = findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}
