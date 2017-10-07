package com.example.app2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.tv1);
        String s[] = new String[3];
        
        s[0] = getResources().getString(R.string.r1);
        s[1] = getResources().getString(R.string.r2);
        s[2] = getResources().getString(R.string.r3);
        
        for(int i=0; i<s.length; i++){
        	t1.append(s[i] + "\n");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
