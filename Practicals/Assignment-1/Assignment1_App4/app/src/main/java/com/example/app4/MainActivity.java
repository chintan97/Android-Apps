package com.example.app4;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.tv1);
        TextView t2 = (TextView) findViewById(R.id.tv2);
        TextView t3 = (TextView) findViewById(R.id.tv3);
        t1.setTextColor(getResources().getColor(R.color.red));
        t1.setTextSize(getResources().getDimension(R.dimen.fifty));
        t2.setTextColor(getResources().getColor(R.color.blue));
        t3.setTextColor(getResources().getColor(R.color.green));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
