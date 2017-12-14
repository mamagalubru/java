/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgeometrie;

/**
 *
 * @author bruno
 */
public class Carre extends Rectangle {

    public Carre(long co) {
        super(co, co);
    }
    
    long surface() {
        long s = (super.surface());
 	System.out.println(" Carré de surface : " + s + " m²");
        return s;
    }
    
    long perimetre() {
        long p = (super.perimetre());
 	System.out.println(" Carré de périmètre : " + p + " m");
        return p;
    }

}
