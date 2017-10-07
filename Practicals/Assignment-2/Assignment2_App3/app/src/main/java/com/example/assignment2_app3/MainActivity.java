package com.example.assignment2_app3;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	Handler h=new Handler();
	int i=0;
	Context x=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
       
        setContentView(R.layout.activity_main);
        x=this;
        Log.i("loop", "setcontent");
        new Thread((new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//Log.i("for", "After thread start"+i);
				while(i<10){
					try{
						Thread.sleep(3000);
						i++;
						
						
					}
					catch(Exception e){
						e.printStackTrace();
					}
				
					Log.i("loop", "before post");
					h.post(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							Toast.makeText(x, "Message "+i, 1000).show();
						}
					});
					
					//Log.i("loop", "After thread"+i);
					
				}
			}
		})).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
