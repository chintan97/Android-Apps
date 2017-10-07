package com.example.chintan.assignment5_app7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class afterRegister extends AppCompatActivity {
    TextView show;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_register);

        show = (TextView) findViewById(R.id.showData);
        sp = getSharedPreferences("session", MODE_PRIVATE);
        if (sp.contains("email")){
            show.setText("Thank you for registering.\nDetails entered...\nEmail: " + sp.getString("email", null) + "\nPassword: " + sp.getString("password", null));
        }
        else {
            Toast.makeText(getApplicationContext(), "Please register first!!!", Toast.LENGTH_LONG).show();
            Intent i = new Intent(afterRegister.this, MainActivity.class);
        }
    }
}
