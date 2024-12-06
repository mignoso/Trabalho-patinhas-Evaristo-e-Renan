package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AdicionarAnimal extends AppCompatActivity {

    private EditText animalName, animalAge, animalBreed, animalDescription;
    private Button submitAnimalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_animal);

        animalName = findViewById(R.id.animalName);
        animalAge = findViewById(R.id.animalAge);
        animalBreed = findViewById(R.id.animalBreed);
        animalDescription = findViewById(R.id.animalDescription);
        submitAnimalButton = findViewById(R.id.submitAnimalButton);

        submitAnimalButton.setOnClickListener(v -> {
            // Coletar dados do formulário
            String nome = animalName.getText().toString();
            String idade = animalAge.getText().toString();
            String raca = animalBreed.getText().toString();
            String descricao = animalDescription.getText().toString();

            // Criar uma instância do DBHelper
            DBHelper dbHelper = new DBHelper(AdicionarAnimal.this);

            // Inserir o novo animal no banco de dados
            long animalId = dbHelper.inserirAnimal(nome, idade, raca, descricao, "imagem_exemplo.png");

            // Mostrar o resultado
            if (animalId != -1) {
                Toast.makeText(AdicionarAnimal.this, "Animal inserido com sucesso! ID: " + animalId, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(AdicionarAnimal.this, "Erro ao inserir o animal.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
