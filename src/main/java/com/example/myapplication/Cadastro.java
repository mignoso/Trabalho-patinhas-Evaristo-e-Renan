package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {
    private Button voltarParaLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Inicialize o botão
        voltarParaLoginButton = findViewById(R.id.voltar_para_login_button);

        // Configura o clique do botão para finalizar a activity atual
        voltarParaLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finaliza a activity de Cadastro e retorna à LoginActivity
                finish(); // Chama a activity anterior (LoginActivity)
            }
        });
    }
}
