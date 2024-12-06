package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AdocaoStatusActivity extends AppCompatActivity {

    private TextView adocaoStatusText, adotanteNomeText, adotanteTelefoneText, adotanteEnderecoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adocao_status);

        // Inicializando as referências para as TextViews
        adocaoStatusText = findViewById(R.id.adocao_status_text);
        adotanteNomeText = findViewById(R.id.adotante_nome_text);
        adotanteTelefoneText = findViewById(R.id.adotante_telefone_text);
        adotanteEnderecoText = findViewById(R.id.adotante_endereco_text);

        // Recupera os dados passados pela Intent
        Intent intent = getIntent();
        String nomeAdotante = intent.getStringExtra("adotante_nome");
        String telefoneAdotante = intent.getStringExtra("adotante_telefone");
        String enderecoAdotante = intent.getStringExtra("adotante_endereco");
        String status = intent.getStringExtra("status");

        // Verifique se as TextViews não estão nulas antes de definir o texto
        if (adocaoStatusText != null) {
            adocaoStatusText.setText(status); // Exibe o status da adoção
        }

        if (adotanteNomeText != null) {
            adotanteNomeText.setText("Nome do Adotante: " + nomeAdotante); // Exibe o nome do adotante
        }

        if (adotanteTelefoneText != null) {
            adotanteTelefoneText.setText("Telefone do Adotante: " + telefoneAdotante); // Exibe o telefone
        }

        if (adotanteEnderecoText != null) {
            adotanteEnderecoText.setText("Endereço do Adotante: " + enderecoAdotante); // Exibe o endereço
        }
    }
}
