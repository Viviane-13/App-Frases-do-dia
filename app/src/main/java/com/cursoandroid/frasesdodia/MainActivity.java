package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String [] frases = {
                "Você é mais forte e mais capaz do que imagina, e a conquista dos seus objetivos depende apenas de você!",
                "A imaginação é sua própria forma de coragem",
                "Uma vez que você tenha aceitado suas falhas, ninguém poderá usá-las contra você",
                "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo",
                "Quando tudo parece estar indo contra você, lembre-se que o avião decola contra o vento, não a favor dele",
                "A mente é tudo. Você se torna aquilo que você pensa",
                "Você deve lutar mais de uma batalha para se tornar um vencedor",
                "O sucesso não consiste em não errar, mas não cometer os mesmos equívocos mais de uma vez"
        };
        int numero = new Random().nextInt(8);
        TextView texto = findViewById(R.id.textResultado);

        texto.setText( frases[numero]);
    }

}
