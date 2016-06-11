package com.example.user.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button firstApp, secondApp, thirdApp, fourthApp, fifthApp, capstonApp;
    // Initialising strings for Toast message
    private String content = "This button will launch my ";
    private String app1 = content + "Popular Movies App.";
    private String app2 = content + "Stock Hawk App.";
    private String app3 = content + "Build It Bigger App.";
    private String app4 = content + "Make Your App Material App.";
    private String app5 = content + "Go Ubiquitous App.";
    private String app6 = content + "Capstone App.";

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

        switch(v.getId())
        {
            case R.id.project1:
                Toast.makeText(this,app1,Toast.LENGTH_LONG).show();
                break;
            case R.id.project2:
                Toast.makeText(this,app2,Toast.LENGTH_LONG).show();
                break;
            case R.id.project3:
                Toast.makeText(this,app3,Toast.LENGTH_LONG).show();
                break;
            case R.id.project4:
                Toast.makeText(this,app4,Toast.LENGTH_LONG).show();
                break;
            case R.id.project5:
                Toast.makeText(this,app5,Toast.LENGTH_LONG).show();
                break;
            case R.id.project6:
                Toast.makeText(this,app6,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
