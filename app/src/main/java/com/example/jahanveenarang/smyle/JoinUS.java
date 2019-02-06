package com.example.jahanveenarang.smyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class JoinUS extends AppCompatActivity {

    android.support.v7.widget.Toolbar  toolbar;

    EditText ed_first , ed_second , ed_email, ed_number , ed_state;
    String firstName, LastName , Phonenumber , emailid , state; 
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_us);

        toolbar= findViewById(R.id.toolbar_joinUs);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Join Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        
        ed_first = findViewById(R.id.firstname);
        ed_second = findViewById(R.id.lastname);
        ed_email = findViewById(R.id.emailid);
        ed_state = findViewById(R.id.state);
        submit = findViewById(R.id.submit);
        
       
        
        
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstName = ed_first.getText().toString();
                LastName = ed_second.getText().toString();
                Phonenumber = ed_number.getText().toString();
                emailid = ed_email.getText().toString();
                state = ed_state.getText().toString();
                
            }
        });



    }
}
