package com.progra.progahojaoperaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText N1,N2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = (EditText)findViewById(R.id.TexNum1);
        N2 = (EditText)findViewById(R.id.TexNum2);


    }

    public void suma(View view){

        String valor1 = N1.getText().toString();
        String valor2 = N2.getText().toString();

        int valor_entero1 = Integer.parseInt(valor1);
        int valor_entero2 = Integer.parseInt(valor2);

        int suma = valor_entero1 + valor_entero2;
        String resultado = String.valueOf(suma);
        Toast.makeText(this,"El resultado de la suma es:" + resultado,Toast.LENGTH_LONG).show();

    }
    public void resta(View view){

        String valor1 = N1.getText().toString();
        String valor2 = N2.getText().toString();

        int valor_entero1 = Integer.parseInt(valor1);
        int valor_entero2 = Integer.parseInt(valor2);

        int resta = valor_entero1 - valor_entero2;
        String resultado = String.valueOf(resta);
        Toast.makeText(this,"El resultado de la resta es:" + resultado,Toast.LENGTH_LONG).show();

    }public void multiplicacion(View view){

        String valor1 = N1.getText().toString();
        String valor2 = N2.getText().toString();

        int valor_entero1 = Integer.parseInt(valor1);
        int valor_entero2 = Integer.parseInt(valor2);

        int multiplicacion = valor_entero1 * valor_entero2;
        String resultado = String.valueOf(multiplicacion);
        Toast.makeText(this,"El resultado de la multiplicaciòn es:" + resultado,Toast.LENGTH_LONG).show();

    }public void division(View view){

        String valor1 = N1.getText().toString();
        String valor2 = N2.getText().toString();

        int valor_entero1 = Integer.parseInt(valor1);
        int valor_entero2 = Integer.parseInt(valor2);

        int division = valor_entero1 + valor_entero2;
        String resultado = String.valueOf(division);
        Toast.makeText(this,"El resultado de la divisiòn es:" + resultado,Toast.LENGTH_LONG).show();

    }
    public void limpiar(View view){
        N1.setText("");
        N2.setText("");
    }
}