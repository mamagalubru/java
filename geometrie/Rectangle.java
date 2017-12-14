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
public class Rectangle {
    
    private long longueur ;
    private long largeur ;
    
    public Rectangle() {
        longueur = 10;
        largeur = 20;
    }
    
    public Rectangle(long lo, long la) {
        longueur = lo;
        largeur = la;
    }
    
    long surface() {
 	return (longueur * largeur) ;
    }
    
    long perimetre() {
 	return ((longueur + largeur)*2);
    }

    void affiche() {
  	System.out.println(" Rectangle de surface : " + (surface()) + " m²");
	System.out.println(" Rectangle de périmètre : " + (perimetre()) + " m");
    }

}
