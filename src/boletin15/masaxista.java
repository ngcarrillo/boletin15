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
public class masaxista extends superclasefutbol {
    private String titulación;
    private int anosEsperiencia;

    public masaxista() {
    }

    public masaxista(String titulación, int anosEsperiencia, int id, int idade, String nome, String apelido) {
        super(id, idade, nome, apelido);
        this.titulación = titulación;
        this.anosEsperiencia = anosEsperiencia;
    }

    public String getTitulación() {
        return titulación;
    }

    public void setTitulación(String titulación) {
        this.titulación = titulación;
    }

    public int getAnosEsperiencia() {
        return anosEsperiencia;
    }

    public void setAnosEsperiencia(int anosEsperiencia) {
        this.anosEsperiencia = anosEsperiencia;
    }
    
    public void darMasaxes(){}

    @Override
    public void viaxar() {
       JOptionPane.showMessageDialog(null, "Viaxan os masaxistas");
    }
    
    
}
