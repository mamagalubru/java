/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetreswing;

import javax.swing.* ;
import javax.imageio.* ;
import java.awt.image.* ;
import java.awt.* ;
import java.io.IOException ;

/**
 *
 * @author bruno
 */
public class FenetreSwing3 extends JPanel {

    private BufferedImage image; 

    /**
     * constructeur 
     */
    public FenetreSwing3(){
        try {
            image = ImageIO.read(getClass().getResource("/images/tuxguitar.png"));
        }
        catch (IOException ex) {
            System.out.println("Problème de chargement de l'image");
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0,null);
    }
}

