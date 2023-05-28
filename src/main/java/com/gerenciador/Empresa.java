package com.gerenciador;

public class Empresa {
    private Integer id;
    private String nome;

    public Empresa(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return this.nome;
    }
}
