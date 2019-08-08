package com.android.praiyawang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class FotoAdapter extends BaseAdapter {

    Context context;
    int galeri1[];

    public FotoAdapter(Context context, int[] galeri1) {
        this.context = context;
        this.galeri1 = galeri1;
    }

    @Override
    public int getCount() {
        return galeri1.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.model_foto, viewGroup, false);
        }

        ImageView gridImage = view.findViewById(R.id.fotoGrid);
        gridImage.setImageResource(galeri1[i]);

        return view;
    }
}
