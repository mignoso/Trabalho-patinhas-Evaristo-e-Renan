package com.example.myapplication;

public class Animal {

    private String nome;
    private String idade;
    private String raca;
    private String descricao;
    private int imagemResId;

    public Animal(String nome, String idade, String raca, String descricao, int imagemResId) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.descricao = descricao;
        this.imagemResId = imagemResId;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImagemResId() {
        return imagemResId;
    }
}
