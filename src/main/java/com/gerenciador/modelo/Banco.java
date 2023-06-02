package com.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    public static Integer chaveSequencial = 1;

    static{
        Empresa empresa1 = new Empresa(Banco.chaveSequencial++, "Alura", new Date());
        Empresa empresa2 = new Empresa(Banco.chaveSequencial++, "Continetal", new Date());
        Empresa empresa3 = new Empresa(Banco.chaveSequencial++, "Arauco", new Date());
        lista.add(empresa1);
        lista.add(empresa2);
        lista.add(empresa3);

        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        u1.setLogin("admin");
        u1.setSenha("admin");
        u2.setLogin("xpto");
        u2.setSenha("12345");
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return lista;
    }

    public Empresa getEmpresa(Integer id){
        Iterator<Empresa> it = lista.iterator();
        while(it.hasNext()){
            Empresa emp = it.next();
            if(emp.getId()==id){
                return emp;
            }
        }
        return null;
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

    public void update(Integer id, String nome, Date data){
        Iterator<Empresa> it = lista.iterator();
        while(it.hasNext()){
            Empresa emp = it.next();
            if(emp.getId()==id){
                emp.setNome(nome);
                emp.setDataAbertura(data);
            }
        }
    }

    public Usuario existeUsuario(String login, String senha) {
        for(Usuario usuario : listaUsuarios){
            if(usuario.ehIgual(login, senha)){
                return usuario;
            }
        }
        return null;
    }
}
