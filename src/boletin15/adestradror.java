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
public class adestradror extends superclasefutbol {
    public int idFederación;

    public adestradror() {
    }

    public adestradror(int id, int idade, String nome, String apelido) {
        super(id, idade, nome, apelido);
    }

    public int getIdFederación() {
        return idFederación;
    }

    public void setIdFederación(int idFederación) {
        this.idFederación = idFederación;
    }
    public void dirixirpartido(){}
    public void dirixiradestramento(){}

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os adestradores");
    }
    
}
