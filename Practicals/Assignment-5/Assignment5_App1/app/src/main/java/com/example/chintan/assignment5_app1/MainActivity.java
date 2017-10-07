package com.example.chintan.assignment5_app1;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer playerObject;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = (TextView) findViewById(R.id.simpleTextView);
        show.setText("Playing: " + Environment.getExternalStorageDirectory().getPath() + "/Download/sample-audio.mp3");
        playerObject = MediaPlayer.create(this, Uri.parse(Environment.getExternalStorageDirectory().getPath() + "/Download/sample-audio.mp3"));
        playerObject.setLooping(true);
        playerObject.start();
    }
    
}
