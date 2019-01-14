package com.example.jahanveenarang.smyle;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CustomGalleryAdapter extends BaseAdapter {
    private Context context;
    private int[] images;

    public CustomGalleryAdapter(Context c, int[] images) {
        context = c;
        this.images = images;
    }


    public int getCount() {
        return images.length;
    }


    public Object getItem(int position) {
        return position;
    }


    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
       // imageView.setImageResource(images[position]);
        Picasso.get().load(images[position]).resize(200,200).centerCrop().into(imageView);

        //imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
        return imageView;
    }
}
