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
            R.drawable.galeri01, R.drawable.galeri02, R.drawable.galeri03, R.drawable.galeri04, R.drawable.galeri05,
            R.drawable.galeri06, R.drawable.galeri07, R.drawable.galeri08, R.drawable.galeri09, R.drawable.galeri10,
            R.drawable.galeri11, R.drawable.galeri12, R.drawable.galeri13, R.drawable.galeri14, R.drawable.galeri15,
            R.drawable.galeri16, R.drawable.galeri17
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
                startActivity(detail);
            }
        });

        return view;
    }
}
