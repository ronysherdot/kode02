package com.android.praiyawang;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class Foto2Activity extends Fragment {

    GridView gridView;
    int galeri1[] = {
            R.drawable.galeri18, R.drawable.galeri19, R.drawable.galeri20,
            R.drawable.galeri21, R.drawable.galeri22, R.drawable.galeri23, R.drawable.galeri24, R.drawable.galeri25,
            R.drawable.galeri26, R.drawable.galeri27, R.drawable.galeri28, R.drawable.galeri29, R.drawable.galeri30,
            R.drawable.galeri31, R.drawable.galeri32
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_foto2, container, false);

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
