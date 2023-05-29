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

    public Empresa(Integer id, String nome, Date dataAbertura){
        this.id=id;
        this.nome=nome;
        this.dataAbertura=dataAbertura;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.nome + " | " + this.dataAbertura;
    }
}
