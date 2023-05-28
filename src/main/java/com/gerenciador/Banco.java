package com.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    static{
        Empresa empresa1 = new Empresa("Alura");
        Empresa empresa2 = new Empresa("Continetal");
        Empresa empresa3 = new Empresa("Arauco");
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
