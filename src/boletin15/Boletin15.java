/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author Nuria
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        superclasefutbol selecion = new superclasefutbol();
        xogador xogador1 = new xogador();
        adestradror adestrador1 = new adestradror();
        masaxista masaxista1 = new masaxista();
        selecion.concentrarse();
        xogador1.concentrarse();
        adestrador1.concentrarse();
        masaxista1.concentrarse();
        
        selecion.viaxar();
        xogador1.viaxar();
        masaxista1.viaxar();
        adestrador1.viaxar();
        
        
        //selecion.getdorsal(); // no se puede invocar un metodo dunha subclase con un metodo da superclase
        
    }
    
    
}
