/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author Nuria
 */
public class superclasefutbol {
    private int id, idade;
    private String nome, apelido;
            
  public superclasefutbol() {
    }
  
    public superclasefutbol(int id, int idade, String nome, String apelido) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.apelido = apelido;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public void concentrarse (){
    JOptionPane.showMessageDialog(null, "concentrase a selección" );
    }
    public void viaxar(){
    JOptionPane.showMessageDialog(null, "viaxa a selección" );}

    @Override
    public String toString() {
        return "superclasefutbol{" + "id=" + id + ", idade=" + idade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }
    
    
}

