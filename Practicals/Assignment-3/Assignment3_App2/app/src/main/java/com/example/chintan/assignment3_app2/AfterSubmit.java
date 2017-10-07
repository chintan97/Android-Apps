package com.example.chintan.assignment3_app2;

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

        show = (TextView) findViewById(R.id.show);

        Intent i = getIntent();
        if (!i.equals(null)){
            show.setText("Email: "+i.getStringExtra("email")+"\nMobile: "+i.getStringExtra("mobile")+"\nFood-liking: "+i.getStringExtra("food")+"\nGender: "+i.getStringExtra("gender"));
        }
    }
}
