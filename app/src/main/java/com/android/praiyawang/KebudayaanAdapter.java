package com.android.praiyawang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class KebudayaanAdapter extends BaseAdapter {

    Context context;
    int[] kebudayaan1;
    int[] kebudayaan2;
    int[] kebudayaan3;

    public KebudayaanAdapter(Context context, int[] kebudayaan1, int[] kebudayaan2, int[] kebudayaan3) {
        this.context = context;
        this.kebudayaan1 = kebudayaan1;
        this.kebudayaan2 = kebudayaan2;
        this.kebudayaan3 = kebudayaan3;
    }

    @Override
    public int getCount() {
        return kebudayaan1.length;
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
            view = LayoutInflater.from(context).inflate(R.layout.model_kebudayaan, viewGroup, false);
        }

        ImageView gridImage = view.findViewById(R.id.fotoKebudayaan);
        TextView textView = view.findViewById(R.id.judulKebudayaan);
        gridImage.setImageResource(kebudayaan1[i]);
        textView.setText(kebudayaan2[i]);

        return view;
    }
}
