/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetreswing;

import javax.swing.* ;
/**
 *
 * @author bruno
 */
public class TestFenetreSwing3 extends JFrame {

    /**
     * constructeur 
     */
    public TestFenetreSwing3(){
        setTitle ("Mon troisième swing");
        setBounds (50,100,300,150);
     }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
     /**
     * créer l'objet fenêtre
     */
     JFrame fen = new TestFenetreSwing3();
     fen.add(new FenetreSwing3());
     fen.setVisible(true);
     System.out.println("Ma première fenêtre visible");
    }
    
}
