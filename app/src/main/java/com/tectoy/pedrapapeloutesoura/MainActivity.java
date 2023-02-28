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

    public void opcaoSelecionada(String escolhaUsuario){

        ImageView imgRetorno = findViewById(R.id.imgRetorno);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes [numero];

        switch (escolhaApp){
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

        if(//app ganhador
                (escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                (escolhaApp == "pedra" && escolhaUsuario == "tesousa")
        ){

        }else if(//usuario ganhador
                (escolhaUsuario == "tesoura" && escolhaApp == "papel") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                (escolhaUsuario == "pedra" && escolhaApp == "tesousa")
        ){

        }else{//empate

        }

        Log.i(logSelect, "Escolha do app: " + escolhaUsuario);
    }
}