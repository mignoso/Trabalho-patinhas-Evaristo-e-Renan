package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DogDetailsActivity extends AppCompatActivity {

    private ImageView dogImage;
    private TextView dogName;
    private TextView dogAge;
    private TextView dogBreed;
    private TextView dog_descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_details);

        // Referências aos componentes da UI
        dogImage = findViewById(R.id.dog_image);
        dogName = findViewById(R.id.dog_name);
        dogAge = findViewById(R.id.dog_age);
        dogBreed = findViewById(R.id.dog_breed);
        dog_descricao = findViewById(R.id.dog_descricao);

        // Recupera os dados passados pela Intent
        Intent intent = getIntent();
        String dogNameText = intent.getStringExtra("dog_name");
        String dogAgeText = intent.getStringExtra("dog_age");
        String dogBreedText = intent.getStringExtra("dog_breed");
        String dog_descricaoText = intent.getStringExtra("dog_descricao");
        int dogImageResId = intent.getIntExtra("dog_image", R.drawable.dog1); // Imagem padrão

        // Define os valores no layout
        dogName.setText(dogNameText);
        dogAge.setText(dogAgeText);
        dogBreed.setText(dogBreedText);
        dog_descricao.setText(dog_descricaoText);

        dogImage.setImageResource(dogImageResId);

        Button adoteButton = findViewById(R.id.adoteButton);

        // Quando o botão for clicado, inicia a tela de formulário de adoção
        adoteButton.setOnClickListener(v -> {
            // Navega para a tela de formulário de adoção
            Intent intentForm = new Intent(DogDetailsActivity.this, AdocaoFormActivity.class);
            startActivity(intentForm);
        });
    }
}
