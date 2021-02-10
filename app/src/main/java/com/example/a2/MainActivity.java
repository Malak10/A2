package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText t;
    TextView n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.but1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t = (EditText) findViewById(R.id.nam1);
                n = (TextView) findViewById(R.id.txt1);
                n.setText("Hello, "+t.getText().toString()+"!");
            }
        });

    }
}