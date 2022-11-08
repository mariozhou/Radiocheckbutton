package com.example.radiocheckbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity2 extends AppCompatActivity {

    Button backButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);

        backButton = (Button) findViewById(R.id.buttonBack);
        textView = (TextView) findViewById(R.id.textViewBack);

        String s = getIntent().getStringExtra(MainActivity.genderTAG);
        if (s.equals("binario") ){
            textView.append(" ");
        }else{
            textView.append(" "+s);
        }


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}