package com.example.chintan.assignment5_app10;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    ImageView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (ImageView) findViewById(R.id.imageView);
        view.setBackgroundResource(R.drawable.framebyframe);
        animationDrawable = (AnimationDrawable) view.getBackground();
        animationDrawable.start();
    }
}
