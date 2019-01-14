package com.example.jahanveenarang.smyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Gallery extends AppCompatActivity {

    android.widget.Gallery simpleGallery;
    CustomGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;

    int[] images = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5,
            R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9,R.drawable.pic10,R.drawable.pic11,
            R.drawable.pic12,R.drawable.pic13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        simpleGallery = (android.widget.Gallery) findViewById(R.id.simpleGallery);
        selectedImageView = (ImageView) findViewById(R.id.selectedImageView);
        customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images);
        simpleGallery.setAdapter(customGalleryAdapter);
        simpleGallery.setSpacing(10);

        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //selectedImageView.setImageResource(images[position]);
                Picasso.get().load(images[position]).resize(900,500).centerCrop().into(selectedImageView);


            }
        });
    }
}
