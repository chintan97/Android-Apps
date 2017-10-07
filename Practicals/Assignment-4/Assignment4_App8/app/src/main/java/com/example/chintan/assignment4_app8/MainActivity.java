package com.example.chintan.assignment4_app8;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, enroll;
    Spinner branch;
    RadioGroup gender;
    DatePicker date;
    Button submit;
    String selectedBranch = "";
    String[] br = {"Select", "Mechanical", "Computer", "IT", "EC", "Civil", "Automobile", "Electrical"};
    String selectedGender = "";
    int day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameField);
        enroll = (EditText) findViewById(R.id.enrollField);
        gender = (RadioGroup) findViewById(R.id.genderPicker);
        branch = (Spinner) findViewById(R.id.branchSelect);
        date = (DatePicker) findViewById(R.id.datePicker);
        submit = (Button) findViewById(R.id.submitButton);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, br);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branch.setAdapter(adapter);

        branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedBranch = br[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.male) {
                    selectedGender = "Male";
                } else if (checkedId == R.id.female) {
                    selectedGender = "Female";
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day = date.getDayOfMonth();
                month = date.getMonth() + 1;
                year = date.getYear();

                if (selectedGender.equals("") || selectedBranch.equals("Select") || name.getText().toString().equals("") || enroll.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill all fields", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent i = new Intent(MainActivity.this, AfterSubmit.class);
                    i.putExtra("name", name.getText().toString());
                    i.putExtra("enrollment", enroll.getText().toString());
                    i.putExtra("branch", selectedBranch.toString());
                    i.putExtra("gender", selectedGender.toString());
                    i.putExtra("date", day + "-" + month + "-" + year);
                    startActivity(i);
                }
            }
        });
    }
}
