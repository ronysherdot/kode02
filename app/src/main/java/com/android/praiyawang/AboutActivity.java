package com.android.praiyawang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;


    @Override
    public void onBackPressed() {
        Intent back = new Intent(AboutActivity.this, MenuActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tentang Aplikasi");

        viewPager = findViewById(R.id.viewPager);
        setupViewPage(viewPager);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPage(ViewPager viewPager) {
        PagerAdapter pagerAdapter = new PageAdapter(getSupportFragmentManager());
        ((PageAdapter) pagerAdapter).addFragment(new Profil1(), getString(R.string.profil1));
        ((PageAdapter) pagerAdapter).addFragment(new Profil2(), getString(R.string.profil2));
        ((PageAdapter) pagerAdapter).addFragment(new Profil3(), getString(R.string.profil3));
        viewPager.setAdapter(pagerAdapter);
    }
}
