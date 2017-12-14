/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetreswing;

import javax.swing.* ;
import java.awt.* ;

/**
 *
 * @author bruno
 */
public class FenetreSwing2 extends JFrame {

    /**
     * constructeur 
     */
    public FenetreSwing2(){
        setTitle ("Mon second swing");
        setBounds (100,50,400,200);
     }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
     /**
     * créer l'objet fenêtre
     */
     JFrame fen = new FenetreSwing2();
     JButton bouton = new JButton ("Mon Bouton");
     Container contenu = fen.getContentPane();
     contenu.setLayout(new FlowLayout());
     contenu.add(bouton);
     fen.setVisible(true);
     System.out.println("Ma seconde fenêtre visible");
    }
    
}

