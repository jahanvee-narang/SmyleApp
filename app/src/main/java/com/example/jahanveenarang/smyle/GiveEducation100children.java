package com.example.jahanveenarang.smyle;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GiveEducation100children extends AppCompatActivity {


    Toolbar toolbar;
    Button bt_ed_donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_education100children);


        toolbar = findViewById(R.id.toolbar_education);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sponsor Girl Education");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        bt_ed_donate = findViewById(R.id.bt_educate_donate);


    }
    public void dial(View view){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
            call("9910191122");
        }else {
            String[] permissions = {Manifest.permission.CALL_PHONE};
            ActivityCompat.requestPermissions(this,permissions,1);
        }

    }

    public void call(String phone){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_CALL);
        Uri uri=Uri.parse("tel:"+phone);
        intent.setData(uri);
        startActivity(intent);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==1){
            int callGrantResult=grantResults[0];
            if(callGrantResult==PackageManager.PERMISSION_GRANTED){
                call("9910191122");

            }else{
                Toast.makeText(this,"Grant permission",Toast.LENGTH_LONG).show();
            }
        }
    }
}
