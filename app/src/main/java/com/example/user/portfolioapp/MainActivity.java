package com.example.user.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button firstApp, secondApp, thirdApp, fourthApp, fifthApp, capstonApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference all buttons
        initializing();

        // set listener on each button
        firstApp.setOnClickListener(this);
        secondApp.setOnClickListener(this);
        thirdApp.setOnClickListener(this);
        fourthApp.setOnClickListener(this);
        fifthApp.setOnClickListener(this);
        capstonApp.setOnClickListener(this);

    }

    private void initializing() {

        firstApp = (Button)findViewById(R.id.project1);
        secondApp = (Button)findViewById(R.id.project2);
        thirdApp = (Button)findViewById(R.id.project3);
        fourthApp = (Button)findViewById(R.id.project4);
        fifthApp = (Button)findViewById(R.id.project5);
        capstonApp = (Button)findViewById(R.id.project6);

    }

    @Override
    public void onClick(View v) {

        String text = ((Button)v).getText().toString();
        Toast.makeText(this,"This app will launch " + text + " app.", Toast.LENGTH_LONG).show();
    }
}
