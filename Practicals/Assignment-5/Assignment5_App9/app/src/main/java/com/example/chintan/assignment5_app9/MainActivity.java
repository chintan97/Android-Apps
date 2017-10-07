package com.example.chintan.assignment5_app9;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    ImageView iv;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv =(ImageView) findViewById(R.id.imageView);
        sp = (Spinner) findViewById(R.id.spinner);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    iv.startAnimation(animation);
                }
                else if (position == 1){
                    animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                    iv.startAnimation(animation);
                }
                else if (position == 2){
                    animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                    iv.startAnimation(animation);
                }
                else {
                    animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                    iv.startAnimation(animation);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
