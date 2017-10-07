package com.example.chintan.assignment4_app4;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox bold, italic, bolditalic;
    TextView changeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bold = (CheckBox) findViewById(R.id.bold);
        italic = (CheckBox) findViewById(R.id.italic);
        bolditalic = (CheckBox) findViewById(R.id.bolditalic);
        changeText = (TextView) findViewById(R.id.changeText);

        bold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && !italic.isChecked() && !bolditalic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                }
                else if((bolditalic.isChecked()) || (isChecked && italic.isChecked())){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                }
                else if (!isChecked && italic.isChecked() && !bolditalic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                }
                else if (!isChecked && !italic.isChecked() && !bolditalic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                }
            }
        });
        italic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && !bold.isChecked() && !bolditalic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                }
                else if((bolditalic.isChecked()) || (isChecked && bold.isChecked())){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                }
                else if (!isChecked && bold.isChecked() && !bolditalic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                }
                else if (!isChecked && !bold.isChecked() && !bolditalic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                }
            }
        });
        bolditalic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
                }
                else if (!isChecked && bold.isChecked() && !italic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                }
                else if (!isChecked && italic.isChecked() && !bold.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                }
                else if(!isChecked && !bold.isChecked() && !italic.isChecked()){
                    changeText.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                }
            }
        });
    }
}
