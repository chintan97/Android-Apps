package com.example.chintan.assignment4_app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname, pass;
    Button submit;
    String enteredUname = "", enteredPass = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText) findViewById(R.id.unameField);
        pass = (EditText) findViewById(R.id.passField);
        submit = (Button) findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredUname = uname.getText().toString();
                enteredPass = pass.getText().toString();
                Log.i("Uname", getString(R.string.username));
                Log.i("Pass", getString(R.string.password));

                if (enteredUname.equals("") || enteredPass.equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill all fields!!!", Toast.LENGTH_LONG).show();
                }
                else if (enteredUname.equals(getString(R.string.username)) && enteredPass.equals(getString(R.string.password))){
                    Intent i = new Intent(MainActivity.this, AfterSubmit.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Username or Password not matched!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
