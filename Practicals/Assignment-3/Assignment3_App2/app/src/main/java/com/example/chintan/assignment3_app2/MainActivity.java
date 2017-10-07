package com.example.chintan.assignment3_app2;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.CharacterPickerDialog;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, mobile, food, gender;
    Button foodSelect, genderSelect, submit;
    String genderOptions = "mfo";
    CharacterPickerDialog cp = null;
    String[] foodChoice = {"Indian food", "Chinese", "Continental"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.emailField);
        mobile = (EditText) findViewById(R.id.mobileField);
        food = (EditText) findViewById(R.id.foodChoice);
        gender = (EditText) findViewById(R.id.genderChoice);
        foodSelect = (Button) findViewById(R.id.selectFood);
        genderSelect = (Button) findViewById(R.id.genderSelect);
        submit = (Button) findViewById(R.id.submitButton);
        food.setRawInputType(InputType.TYPE_NULL);
        gender.setRawInputType(InputType.TYPE_NULL);
        registerForContextMenu(email);
        registerForContextMenu(mobile);
        registerForContextMenu(food);
        registerForContextMenu(gender);

        cp = new CharacterPickerDialog(this, new View(this), null, genderOptions, true) {
            public void onClick(View v) {
                String c = "";
                c = ((Button) v).getText().toString();
                gender.setText(c);
                cp.dismiss();
            }
        };

        genderSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cp.setTitle("Select Gender");
                cp.setCancelable(true);
                cp.show();
            }
        });

        foodSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Food", "Food");
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Select Food");
                builder.setItems(foodChoice, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        food.setText(foodChoice[which]);
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("") || mobile.getText().toString().equals("") || food.getText().toString().equals("") || gender.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please fill all fields!!!", Toast.LENGTH_LONG).show();
                }
                else {
                    final ProgressDialog progress = new ProgressDialog(MainActivity.this);
                    progress.setTitle("Please Wait...");
                    progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    progress.setProgress(0);
                    progress.setMax(100);
                    progress.show();

                    new Thread(){
                        @Override
                        public void run(){
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            progress.dismiss();
                        }

                    }.start();

                    Intent i = new Intent(MainActivity.this, AfterSubmit.class);
                    i.putExtra("email", email.getText().toString());
                    i.putExtra("mobile", mobile.getText().toString());
                    i.putExtra("food", food.getText().toString());
                    i.putExtra("gender", gender.getText().toString());
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId() == R.id.emailField || v.getId() == R.id.mobileField){
            menu.add("Copy");
            menu.add("Cut");
            menu.add("Delete");
        }
        else if (v.getId() == R.id.foodChoice || v.getId() == R.id.genderChoice){
            menu.add("Copy");
        }
    }
}
