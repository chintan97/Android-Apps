package com.example.chintan.assignment3_tempapp1_2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater1 = getMenuInflater();
        inflater1.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        switch(item.getItemId())
        {
            case R.id.color_red:
                layout.setBackgroundColor(Color.rgb(255, 0, 0));
                return true;
            case R.id.color_blue:
                layout.setBackgroundColor(Color.rgb(0,0,255));
                return true;
            case R.id.color_green:
                layout.setBackgroundColor(Color.rgb(0,255,0));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
