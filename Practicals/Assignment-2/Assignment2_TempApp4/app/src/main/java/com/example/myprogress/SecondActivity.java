package com.example.myprogress;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class SecondActivity extends Activity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView) findViewById(R.id.textView);
    }

}
