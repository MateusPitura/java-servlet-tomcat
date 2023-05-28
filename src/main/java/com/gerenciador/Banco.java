package com.gerenciador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    static{
        Empresa empresa1 = new Empresa("Alura", new Date());
        Empresa empresa2 = new Empresa("Continetal", new Date());
        Empresa empresa3 = new Empresa("Arauco", new Date());
        lista.add(empresa1);
        lista.add(empresa2);
        lista.add(empresa3);
    }

    public void adiciona(Empresa empresa) {
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return lista;
    }

}
