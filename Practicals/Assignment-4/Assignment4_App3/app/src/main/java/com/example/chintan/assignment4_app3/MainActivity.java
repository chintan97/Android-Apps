package com.example.chintan.assignment4_app3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.TooManyListenersException;

public class MainActivity extends AppCompatActivity {
    CheckBox cricket, tennis, badminton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cricket = (CheckBox) findViewById(R.id.cricket);
        tennis = (CheckBox) findViewById(R.id.tennis);
        badminton = (CheckBox) findViewById(R.id.badminton);

        cricket.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!tennis.isChecked() && !badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket", Toast.LENGTH_LONG).show();
                }
                else if (tennis.isChecked() && !badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket and Tennis", Toast.LENGTH_LONG).show();
                }
                else if (!tennis.isChecked() && badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket and Badminton", Toast.LENGTH_LONG).show();
                }
                else if(tennis.isChecked() && badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket, Tennis and Badminton", Toast.LENGTH_LONG).show();
                }
                else if (tennis.isChecked() && badminton.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Tennis and Badminton", Toast.LENGTH_LONG).show();
                }
                else if (!tennis.isChecked() && badminton.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Badminton", Toast.LENGTH_LONG).show();
                }
                else if (tennis.isChecked() && !badminton.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Tennis", Toast.LENGTH_LONG).show();
                }
            }
        });

        tennis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!cricket.isChecked() && !badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Tennis", Toast.LENGTH_LONG).show();
                }
                else if (cricket.isChecked() && !badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket and Tennis", Toast.LENGTH_LONG).show();
                }
                else if (!cricket.isChecked() && badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Tennis and Badminton", Toast.LENGTH_LONG).show();
                }
                else if(cricket.isChecked() && badminton.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket, Tennis and Badminton", Toast.LENGTH_LONG).show();
                }
                else if (cricket.isChecked() && badminton.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket and Badminton", Toast.LENGTH_LONG).show();
                }
                else if (!cricket.isChecked() && badminton.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Badminton", Toast.LENGTH_LONG).show();
                }
                else if (cricket.isChecked() && !badminton.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket", Toast.LENGTH_LONG).show();
                }
            }
        });

        badminton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!cricket.isChecked() && !tennis.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Badminton", Toast.LENGTH_LONG).show();
                }
                else if (cricket.isChecked() && !tennis.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket and Badminton", Toast.LENGTH_LONG).show();
                }
                else if (!cricket.isChecked() && tennis.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Tennis and Badminton", Toast.LENGTH_LONG).show();
                }
                else if(cricket.isChecked() && tennis.isChecked() && isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket, Tennis and Badminton", Toast.LENGTH_LONG).show();
                }
                else if (cricket.isChecked() && tennis.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket and Tennis", Toast.LENGTH_LONG).show();
                }
                else if (!cricket.isChecked() && tennis.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Tennis", Toast.LENGTH_LONG).show();
                }
                else if (cricket.isChecked() && !tennis.isChecked() && !isChecked){
                    Toast.makeText(getApplicationContext(), "Your hobby is Cricket", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
