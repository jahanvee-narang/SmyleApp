package com.example.jahanveenarang.smyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TripBooking extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_booking);


        toolbar= findViewById(R.id.toolbar_trip_booking);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Book Your Trip");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
