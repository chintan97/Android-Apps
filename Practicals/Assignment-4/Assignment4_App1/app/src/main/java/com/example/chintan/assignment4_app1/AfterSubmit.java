package com.example.chintan.assignment4_app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AfterSubmit extends AppCompatActivity {
    TextView uname, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_submit);

        uname = (TextView) findViewById(R.id.showUname);
        pass = (TextView) findViewById(R.id.showPass);

        Intent i = getIntent();
        if(!i.equals(null)){
            uname.setText("Username: " + getString(R.string.username));
            pass.setText("Password: " + getString(R.string.password));
        }
    }
}
