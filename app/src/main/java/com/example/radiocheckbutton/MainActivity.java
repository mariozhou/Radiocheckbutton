package com.example.radiocheckbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButtonMale,radioButtonFemale,radioButtonBin;
    private CheckBox checkBoxTerms;
    Button buttonAccept;
    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonFemale = (RadioButton) findViewById(R.id.radioMujer);
        radioButtonMale = (RadioButton) findViewById(R.id.radioHombre);
        radioButtonBin = (RadioButton) findViewById(R.id.radioBinario);
        buttonAccept = (Button) findViewById(R.id.button);
        checkBoxTerms = (CheckBox) findViewById(R.id.checkBox);
        
        checkBoxTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox cb = (CheckBox) view;

                radioButtonMale.setClickable( cb.isChecked());
                radioButtonFemale.setClickable( cb.isChecked());
                radioButtonBin.setClickable( cb.isChecked());

            }
        });

        buttonAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean check = checkBoxTerms.isChecked();
                String messaje = "";
                if (check){
                    if (radioButtonMale.isChecked()){
                        messaje = "chico has aceptado los terminos";
                    }else if (radioButtonFemale.isChecked()){
                        messaje = "chica ha aceptado los terminos";
                    }else if (radioButtonBin.isChecked()){
                        messaje = "has aceptado los terminos";
                    } else{
                        messaje = "oye ha aceptado pero no ha seleccionado genero";
                    }

                }else {
                    messaje = "no ha aceptado los terminos";
                }

                Toast.makeText(MainActivity.this, messaje, Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onClick: "+messaje);

            }
        });

    }
}