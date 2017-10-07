package com.example.chintan.assignment4_app8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AfterSubmit extends AppCompatActivity {
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_submit);
        show = (TextView) findViewById(R.id.showDetails);

        Intent i = getIntent();

        if(!(i.equals(null))){
            show.setText("Name: "+i.getStringExtra("name")+"\nEnrollment: "+i.getStringExtra("enrollment")+"\nGender: "+i.getStringExtra("gender")+"\nBranch: "+i.getStringExtra("branch")+"\nBirth Date: "+i.getStringExtra("date"));
        }
    }
}
