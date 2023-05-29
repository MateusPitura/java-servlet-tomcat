package com.gerenciador;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    public static Integer chaveSequencial = 1;

    static{
        Empresa empresa1 = new Empresa(Banco.chaveSequencial++, "Alura", new Date());
        Empresa empresa2 = new Empresa(Banco.chaveSequencial++, "Continetal", new Date());
        Empresa empresa3 = new Empresa(Banco.chaveSequencial++, "Arauco", new Date());
        lista.add(empresa1);
        lista.add(empresa2);
        lista.add(empresa3);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return lista;
    }

    public void remove(Integer id){
        Iterator<Empresa> it = lista.iterator();
        while(it.hasNext()){
            Empresa emp = it.next();
            if(emp.getId()==id){
                it.remove();
            }
        }
    }
}
