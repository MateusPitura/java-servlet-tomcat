package com.gerenciador;

import java.util.Date;

public class Empresa {
    private Integer id;
    private String nome;
    private Date dataAbertura;

    public Empresa(String nome, Date dataAbertura){
        this.nome=nome;
        this.dataAbertura=dataAbertura;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }
}
