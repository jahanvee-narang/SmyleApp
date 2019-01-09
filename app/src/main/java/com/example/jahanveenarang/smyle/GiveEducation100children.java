package com.example.jahanveenarang.smyle;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class GiveEducation100children extends AppCompatActivity {


    Toolbar toolbar;
    Button bt_ed_donate, bt_ed_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_education100children);


        toolbar = findViewById(R.id.toolbar_education);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sponser Girl Educattion");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        bt_ed_donate = findViewById(R.id.bt_educate_donate);
        bt_ed_call = findViewById(R.id.bt_educate_call);

        bt_ed_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String posted_by = "9910191122";

                String uri = "tel:" + posted_by.trim();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(uri));
                if (ActivityCompat.checkSelfPermission(GiveEducation100children.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);

            }
        });

    }
}
