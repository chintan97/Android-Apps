package com.example.assignment2_app1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		tv = (TextView) findViewById(R.id.tv1);
		Intent i = getIntent();
		
		if(!(i.equals(null))){
			if (i.hasExtra("number")){
				tv.setText("Entered number is: " + i.getStringExtra("number"));
				for (int j=1; j<=Integer.parseInt(i.getStringExtra("number")); j++){
					tv.append("\n" + j);
				}
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}
