package com.example.chintan.assignment2_tempapp5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener((View.OnClickListener) this);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener((View.OnClickListener) this);
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener((View.OnClickListener) this);
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener((View.OnClickListener) this);
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener((View.OnClickListener) this);
        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener((View.OnClickListener) this);
        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener((View.OnClickListener) this);
        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener((View.OnClickListener) this);
        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener((View.OnClickListener) this);

        im = (ImageView) findViewById(R.id.imageView);

    }

    @Override
    public void onClick(View v){
        if (v == b1){
            im.setImageResource(R.drawable.a);
        }
        else if (v == b2){
            im.setImageResource(R.drawable.b);
        }
        else if (v == b3){
            im.setImageResource(R.drawable.c);
        }
        else if (v == b4){
            im.setImageResource(R.drawable.d);
        }
        else if (v == b5){
            im.setImageResource(R.drawable.ee);
        }
        else if (v == b6){
            im.setImageResource(R.drawable.f);
        }
        else if (v == b7){
            im.setImageResource(R.drawable.g);
        }
        else if (v == b8){
            im.setImageResource(R.drawable.h);
        }
        else if (v == b9){
            im.setImageResource(R.drawable.ii);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
