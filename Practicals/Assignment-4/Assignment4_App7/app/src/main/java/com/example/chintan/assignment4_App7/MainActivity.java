package com.example.chintan.assignment4_App7;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.showText);
        rg = (RadioGroup) findViewById(R.id.group);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.red){
                    tv.setTextColor(Color.rgb(255, 0, 0));
                }
                else if (checkedId == R.id.blue){
                    tv.setTextColor(Color.rgb(0, 0, 255));
                }
                else if (checkedId == R.id.green){
                    tv.setTextColor(Color.rgb(0, 255, 0));
                }
            }
        });
    }
}
