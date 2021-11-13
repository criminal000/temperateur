package com.example.tempewael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextc,editTextf;
    Button button1;
    Double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextc= findViewById(R.id.ci);
        editTextf= findViewById(R.id.fe);
        button1 = findViewById(R.id.button12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celcuse=editTextc.getText().toString();
                String F=editTextf.getText().toString();
                if ((celcuse.isEmpty()) && (F.isEmpty()))
                {
                    Toast.makeText(MainActivity.this, "please write a number ", Toast.LENGTH_SHORT).show();
                }
                else if ((!celcuse.isEmpty()) && (!F.isEmpty()))
                {
                    Toast.makeText(MainActivity.this, "please write only one number ", Toast.LENGTH_SHORT).show();
                }

                else if ((!celcuse.isEmpty()) && (F.isEmpty()))
                {
                    a = Double.parseDouble(String.valueOf(editTextc.getText()));
                    Double b = a * 9 / 5 + 32;
                    String r = String.valueOf(b);
                    editTextf.setText(r);
                    Toast.makeText(MainActivity.this, r + "°F", Toast.LENGTH_SHORT).show();
                }
                else if ((celcuse.isEmpty()) &&  (!F.isEmpty()) )
                {
                    a = Double.parseDouble(String.valueOf(editTextf.getText()));
                    Double b = a - 32;
                    Double c = b * 5 / 9;
                    String r = String.valueOf(c);
                    editTextc.setText(r);
                    Toast.makeText(MainActivity.this, r + "°C", Toast.LENGTH_SHORT).show();
                }


            }
        });



        }
    public void reset(View View) {

        editTextc.setText("");
        editTextf.setText("");
    }



}
