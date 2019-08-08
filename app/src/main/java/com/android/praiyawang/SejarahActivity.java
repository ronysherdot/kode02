package com.android.praiyawang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class SejarahActivity extends AppCompatActivity {

    Toolbar toolbar;
    CarouselView carouselView;
    int[] carouselMenu = {
            R.drawable.carousel1, R.drawable.carousel2, R.drawable.carousel3, R.drawable.carousel4
    };


    @Override
    public void onBackPressed() {
        Intent back = new Intent(SejarahActivity.this, MainActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sejarah");

        carouselView = findViewById(R.id.carouselView);
        carouselView.setViewListener(viewListener);
        carouselView.setPageCount(carouselMenu.length);
        carouselView.setSlideInterval(4000);
    }

    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {
            View carouselSet = getLayoutInflater().inflate(R.layout.carousel_view, null);

            ImageView carouselImage = carouselSet.findViewById(R.id.carouselImage);
            carouselImage.setImageResource(carouselMenu[position]);
            carouselView.setIndicatorGravity(Gravity.CENTER_HORIZONTAL| Gravity.TOP);

            return carouselSet;
        }
    };
}
