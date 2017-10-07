package com.example.chintan.assignment5_app3;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    TextView showPath, showData;
    File readFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showPath = (TextView) findViewById(R.id.filePath);
        showData = (TextView) findViewById(R.id.showData);

        showPath.setText("Reading from file: " + Environment.getExternalStorageDirectory().getPath() + "Download/sample-text.txt");

        readFile = new File(Environment.getExternalStorageDirectory(), "Download/sample-text.txt");
        StringBuilder data = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(readFile));

            String line;

            while ((line = reader.readLine()) != null){
                data.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        showData.setText(data.toString());
    }
}
