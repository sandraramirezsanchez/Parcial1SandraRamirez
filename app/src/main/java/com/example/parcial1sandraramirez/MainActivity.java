package com.example.parcial1sandraramirez;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView Resultado;
    EditText valor1;
    EditText valor2;
    Button suma, resta, div, multi;
    float resulatado;
    int nume1, nume2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado=findViewById(R.id.Texto3);
        valor1=findViewById(R.id.Texto1);
        valor2=findViewById(R.id.Texto2);

        suma=findViewById(R.id.suma);
        resta=findViewById(R.id.resta);
        div=findViewById(R.id.div);
        multi=findViewById(R.id.multi);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nume1=Integer.parseInt(valor1.getText().toString());
                nume2=Integer.parseInt(valor2.getText().toString());
                resulatado= nume1 + nume2;
                Resultado.setText(String.valueOf(resulatado));

            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nume1=Integer.parseInt(valor1.getText().toString());
                nume2=Integer.parseInt(valor2.getText().toString());
                resulatado= nume1 - nume2;
                Resultado.setText(String.valueOf(resulatado));

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nume1=Integer.parseInt(valor1.getText().toString());
                nume2=Integer.parseInt(valor2.getText().toString());
                resulatado= nume1 * nume2;
                Resultado.setText(String.valueOf(resulatado));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nume1=Integer.parseInt(valor1.getText().toString());
                nume2=Integer.parseInt(valor2.getText().toString());
                resulatado= nume1 / nume2;
                Resultado.setText(String.valueOf(resulatado));

            }
        });
    }
}
