package com.example.chintan.assignment5_app4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText getNumber;
    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getNumber = (EditText) findViewById(R.id.getNumber);
        call = (Button) findViewById(R.id.callButton);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!getNumber.getText().toString().equals("")){
                    Uri number = Uri.parse("tel:" + getNumber.getText().toString());
                    Intent callIntent = new Intent(Intent.ACTION_CALL, number);
                    startActivity(callIntent);
                }
            }
        });
    }
}
