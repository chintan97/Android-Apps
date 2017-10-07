package com.example.chintan.assignment5_app7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button submit;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.emailField);
        password = (EditText) findViewById(R.id.passwordField);
        submit = (Button) findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!email.getText().toString().equals("") && !password.getText().toString().equals("")){
                    sp = getSharedPreferences("session", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("email", email.getText().toString());
                    editor.putString("password", password.getText().toString());
                    editor.apply();

                    //Here, code for inserting data into database can be written

                    Intent i = new Intent(MainActivity.this, afterRegister.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Fill all fields!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
