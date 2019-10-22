package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    Button mbutton;
    Button mbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton = (Button) findViewById(R.id.button);
        mbutton2 = (Button) findViewById(R.id.button2);
        mbutton2.setVisibility(View.GONE);


        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbutton.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mbutton2.performClick();
                    }
                }, 500);
            }

        });


        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbutton.setEnabled(true);
                Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
