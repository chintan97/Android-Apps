package com.example.chintan.assignment4_app5;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);

        toggle = (ToggleButton) findViewById(R.id.toggleButton);
        toggle.setChecked(false);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    layout.setBackgroundColor(Color.rgb(0, 0, 255));
                }
                else {
                    layout.setBackgroundColor(Color.rgb(255, 0, 0));
                }
            }
        });
    }
}
