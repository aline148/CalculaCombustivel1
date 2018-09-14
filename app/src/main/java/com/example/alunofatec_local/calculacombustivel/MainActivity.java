package com.example.alunofatec_local.calculacombustivel;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static final NumberFormat currencyFormat =
            NumberFormat.getCurrencyInstance();
    private TextView tv_gas;
    private TextView tv_etanol;
    private TextInputEditText input_resultado;
    private double valor_gasolina;
    private double valor_etanol;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor_gasolina = (TextView) findViewById(R.id.tv_gas);
        valor_etanol = (TextView) findViewById(R.id.tv_gas);
        input_resultado = (TextInputEditText) findViewById(R.id.input_resultado);
        imagem = (ImageView) findViewById(R.id.imageView);


    }
}
