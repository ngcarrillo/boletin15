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
public class xogador extends superclasefutbol {
       private int dorsal;
       private String demarcacion;

    public xogador() {
    }


    public xogador(int dorsal, String demarcacion, int id, int idade, String nome, String apelido) {
        super(id, idade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void xogarpartido(){}
    public void entrenar(){}
    @Override
    public void viaxar() {
         JOptionPane.showMessageDialog(null, "Viaxan os xogadores");
    }
       
       
}
