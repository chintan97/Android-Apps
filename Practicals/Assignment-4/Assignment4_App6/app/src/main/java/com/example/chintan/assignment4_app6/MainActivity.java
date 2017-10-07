package com.example.chintan.assignment4_app6;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner) findViewById(R.id.spinner);
        im = (ImageView) findViewById(R.id.image);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choice, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Choice", position + "");
                if (position == 0) {
                    im.setImageResource(R.drawable.rectangle);
                }
                else if (position == 1){
                    im.setImageResource(R.drawable.circle);
                }
                else if (position == 2){
                    im.setImageResource(R.drawable.roundrectangle);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
