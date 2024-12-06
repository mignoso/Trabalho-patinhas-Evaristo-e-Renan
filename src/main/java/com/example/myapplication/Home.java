package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private ImageView user;
    private Button caes_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        user = findViewById(R.id.user);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação quando o usuário clicar na imagem
            }
        });

        // Referência ao GridView
        GridView gridView = findViewById(R.id.animais_grid);

        // Dados dos cães (imagens, nomes, idades, raças e descricao)
        Integer[] animalImages = {
                R.drawable.dog1, R.drawable.dog2, R.drawable.dog3 // 3 elementos
        };
        String[] animalNames = {
                "Rex", "Bella", "Max" // 3 elementos
        };
        String[] animalAges = {
                "3 anos", "2 anos", "4 anos" // 3 elementos
        };
        String[] animalBreeds = {
                "Labrador", "Bulldog", "Beagle" // 3 elementos
        };
        String[] animalDescricao = {
                "Amigável e brincalhão, Rex é o cão ideal para famílias...",
                "Carinhosa e protetora, Bella é uma companheira leal...",
                "Max é um cão energético e sociável..." // 3 elementos
        };

        // Criar lista de animais
        List<Animal> animalList = new ArrayList<>();

        // Preencher a lista de animais
        for (int i = 0; i < animalNames.length; i++) {
            Animal animal = new Animal(animalNames[i], animalAges[i], animalBreeds[i], animalDescricao[i], animalImages[i]);
            animalList.add(animal);
        }

        // Criar o Adapter e configurar o GridView
        AnimalAdapter adapter = new AnimalAdapter(this, animalList);
        gridView.setAdapter(adapter);

        // Ação do botão de informações de adoção
        caes_button = findViewById(R.id.caes_button);
        caes_button.setOnClickListener(v -> {
            // Criando o Intent para navegar até a tela de status da adoção
            Intent statusIntent = new Intent(Home.this, AdocaoStatusActivity.class);
            statusIntent.putExtra("statusMessage", "Adoção realizada com sucesso! Nome do Adotante: João");
            startActivity(statusIntent);
        });

        user = findViewById(R.id.user);
        caes_button = findViewById(R.id.caes_button);

        // Ação do botão caes_button para navegar até AdocaoStatusActivity
        caes_button.setOnClickListener(v -> {
            // Criar uma intent para navegar até a AdocaoStatusActivity
            Intent statusIntent = new Intent(Home.this, AdocaoStatusActivity.class);
            statusIntent.putExtra("statusMessage", "Adoção Pendentes");
            startActivity(statusIntent); // Inicia a AdocaoStatusActivity
        });
    }
}
