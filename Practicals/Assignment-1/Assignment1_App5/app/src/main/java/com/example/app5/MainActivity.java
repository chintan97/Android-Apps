package com.example.app5;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ShowToast") public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        int x[] = getResources().getIntArray(R.array.toa);
        //TextView t = (TextView) findViewById(R.id.t1);
        for (int i=0; i<x.length; i++)
        	Toast.makeText(this, x[i]+"", 10000).show();
        //t.append(x);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
