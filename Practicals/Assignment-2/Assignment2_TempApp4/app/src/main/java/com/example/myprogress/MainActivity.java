package com.example.myprogress;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {
ProgressBar pb,pb1;
int mprogress=0;
Handler mHandler=new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pb=(ProgressBar) findViewById(R.id.progressBar1);
		new Thread(new Runnable	() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(mprogress<100)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					mprogress++;
					pb.setProgress(mprogress);
					
				
				mHandler.post(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						pb.setProgress(mprogress);
						if(mprogress==100)
						{
							Intent i = new Intent(MainActivity.this, SecondActivity.class);
							startActivity(i);
						}
					}
				});
				
				}
			}
			
		}).start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
