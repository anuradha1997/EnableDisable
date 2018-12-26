package com.example.anuradha.enabledisable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b1;
    ToggleButton t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.e1);
        b1= (Button) findViewById(R.id.button);
        e2= (EditText) findViewById(R.id.e2);
        t1= (ToggleButton) findViewById(R.id.toggleButton);
        b1.setEnabled(false);
        e1.setEnabled(false);
        e2.setEnabled(false);


        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    b1.setEnabled(true);
                    e1.setEnabled(true);
                    e2.setEnabled(true);


                }
                else {
                    b1.setEnabled(false);
                    e1.setEnabled(false);
                    e2.setEnabled(false);



                }
            }
        });
    }
}
