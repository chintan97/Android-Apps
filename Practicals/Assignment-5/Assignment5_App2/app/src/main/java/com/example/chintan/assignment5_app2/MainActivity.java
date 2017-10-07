package com.example.chintan.assignment5_app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "LDRP";
    public static int b = 0;
    public static String a = null;


    EditText mEd1;
    EditText et;
    EditText ett;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText)findViewById(R.id.et1);
        ett=(EditText)findViewById(R.id.et2);

        dbHelper =new DBHelper(this);

        Button ins = (Button) findViewById(R.id.btn2);
        Button up = (Button) findViewById(R.id.btn4);
        Button del = (Button) findViewById(R.id.btn3);
        Button mButton= (Button) findViewById(R.id.button);
        mEd1 = (EditText) findViewById(R.id.ed1);

        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("INSERT", "Insert Called");
                try
                {
                    dbHelper.insertDATA(Integer.valueOf(String.valueOf(et.getText())), ett.getText().toString());
                }
                catch(Exception ex)
                {
                    Log.d("EXCEPTION","Exception Called");
                    Toast.makeText(MainActivity.this, ex.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("UPDATE", "Update Called");
                try
                {
                    int cnt = dbHelper.updatedb("a", "LDRP");
                    Toast.makeText(MainActivity.this,String.valueOf(cnt) + " Data Updated",Toast.LENGTH_LONG).show();
                }
                catch(Exception ex)
                {
                    Toast.makeText(MainActivity.this,ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DELETE","Delete Pressed");
                try
                {
                    String mData = mEd1.getText().toString();
                    int cnt = dbHelper.deletedb(mData);
                    Toast.makeText(MainActivity.this,String.valueOf(cnt) + " Data Deleted",Toast.LENGTH_LONG).show();
                }
                catch(Exception ex)
                {
                    Toast.makeText(MainActivity.this,ex.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Flag", String.valueOf(dbHelper.flag));
                dbHelper.getAllData();
            }
        });
    }
}
