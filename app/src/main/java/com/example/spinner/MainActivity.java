package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tvRes;
    private Spinner spOperaciones;
    private Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText)findViewById(R.id.editTextNumber1);
        et2 =(EditText)findViewById(R.id.editTextNumber2);
        tvRes = (TextView)findViewById(R.id.textView3);
        btnCalcular =(Button)findViewById(R.id.button);
        spOperaciones =(Spinner)findViewById(R.id.spinner);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                calcular();
            }
        });
    }

    private void calcular(){
        int intValor1= Integer.parseInt(et1.getText().toString());
        int intValor2= Integer.parseInt(et2.getText().toString());
        String seleccionado = spOperaciones.getSelectedItem().toString();
        if(seleccionado.equals("Sumar")){
            int suma = intValor1 + intValor2;
            tvRes.setText(String.valueOf(suma));
        }else if(seleccionado.equals("Restar")) {
            int resta = intValor1 + intValor2;
            tvRes.setText(String.valueOf(intValor1 - intValor2));
        }else if(seleccionado.equals("Multiplication")){
                int multi = intValor1 * intValor2;
                tvRes.setText(String.valueOf(intValor1 * intValor2));
        }else if(seleccionado.equals("Divider")){
            int div = intValor1 / intValor2;
            tvRes.setText(String.valueOf(intValor1 / intValor2));
}   }   }

