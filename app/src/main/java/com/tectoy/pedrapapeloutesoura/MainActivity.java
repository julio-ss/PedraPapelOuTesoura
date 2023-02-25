package com.tectoy.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

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
        Log.i(logSelect, "Opcao selecionada: " + opcaoSelecionada);
    }
}