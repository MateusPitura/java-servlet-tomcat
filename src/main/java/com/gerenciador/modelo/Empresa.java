package com.gerenciador.modelo;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        return this.id + " | " + this.nome + " | " + this.dataAbertura;
    }
}
