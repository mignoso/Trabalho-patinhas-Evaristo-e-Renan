package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AdocaoFormActivity extends AppCompatActivity {

    private EditText adotanteNome, adotanteTelefone, adotanteEndereco;
    private Button enviarAdocaoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adocao_form);

        // Referências aos campos do formulário
        adotanteNome = findViewById(R.id.adotante_nome);
        adotanteTelefone = findViewById(R.id.adotante_telefone);
        adotanteEndereco = findViewById(R.id.adotante_endereco);
        enviarAdocaoButton = findViewById(R.id.enviar_adocao_button);

        // Ação do botão de envio
        enviarAdocaoButton.setOnClickListener(v -> {
            // Pega os dados preenchidos
            String nome = adotanteNome.getText().toString();
            String telefone = adotanteTelefone.getText().toString();
            String endereco = adotanteEndereco.getText().toString();
            String status = "Adoção Pendentes"; // Definindo o status como "Adoção Pendentes"

            // Cria uma intent para enviar os dados para AdocaoStatusActivity
            Intent intent = new Intent(AdocaoFormActivity.this, AdocaoStatusActivity.class);
            intent.putExtra("adotante_nome", nome);
            intent.putExtra("adotante_telefone", telefone);
            intent.putExtra("adotante_endereco", endereco);
            intent.putExtra("status", status); // Passa o status para a próxima activity

            // Inicia a AdocaoStatusActivity
            startActivity(intent);
        });
    }
}
