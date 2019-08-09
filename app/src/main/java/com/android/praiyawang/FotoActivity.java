package com.android.praiyawang;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class FotoActivity extends Fragment {

    GridView gridView;
    int galeri1[] = {
            R.drawable.galeri08, R.drawable.galeri02, R.drawable.galeri24, R.drawable.galeri11, R.drawable.galeri16,
            R.drawable.galeri22, R.drawable.galeri21, R.drawable.galeri23, R.drawable.mamuli, R.drawable.tenunikat,
            R.drawable.galeri13, R.drawable.sirihpinang
    };

    int keterangan[] = {
        R.string.galeri01, R.string.galeri02, R.string.galeri03,R.string.galeri04, R.string.galeri05, R.string.galeri06,
            R.string.galeri07, R.string.galeri08, R.string.galeri09, R.string.galeri10, R.string.galeri11, R.string.galeri12

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_foto, container, false);

        gridView = view.findViewById(R.id.gridFoto1);
        FotoAdapter fotoAdapter = new FotoAdapter(view.getContext(), galeri1);
        gridView.setAdapter(fotoAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detail = new Intent(view.getContext(), FotoDetailActivity.class);
                detail.putExtra("image", galeri1[i]);
                detail.putExtra("keterangan", keterangan[i]);
                startActivity(detail);
            }
        });

        return view;
    }
}
