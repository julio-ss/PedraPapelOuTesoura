package com.tectoy.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String logSelect = "Opcao selecionada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoTesoura(View v){
        this.opcaoSelecionada("Tesoura");
    }

    public void selecionadoPapel(View v){
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoPedra(View v){
        this.opcaoSelecionada("Pedra");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imgRetorno = findViewById(R.id.imgRetorno);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes [numero];

        switch (opcaoApp){
            case "pedra":
                imgRetorno.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgRetorno.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgRetorno.setImageResource(R.drawable.tesoura);
                break;
            default:
                break;
        }

        Log.i(logSelect, "Escolha do app: " + opcaoApp);
    }
}