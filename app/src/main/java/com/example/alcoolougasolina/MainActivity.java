package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txtAlcool, txtGasolina;
    private TextView txtResultado;
    private double precoAlcool, precoGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAlcool = findViewById(R.id.txtAlcool);
        txtGasolina = findViewById(R.id.txtGasolina);
        txtResultado = findViewById(R.id.txtResposta);
    }

    public void calcular (View View){
        precoAlcool = Double.parseDouble(txtAlcool.getText().toString().replace(",","."));
        precoGasolina = Double.parseDouble(txtGasolina.getText().toString().replace(",","."));

        if(precoAlcool > precoGasolina){
            txtResultado.setText(R.string.melhor_gasolina);
        }else{
            txtResultado.setText(R.string.melhor_alcool);
        }
    }
}