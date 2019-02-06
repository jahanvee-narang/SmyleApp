package com.example.jahanveenarang.smyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TripBooking extends AppCompatActivity {

    Toolbar toolbar;
    Button trippay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_booking);


        toolbar= findViewById(R.id.toolbar_trip_booking);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Book Your Trip");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        trippay = findViewById(R.id.TRIPpay);

        trippay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(TripBooking.this , PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}
