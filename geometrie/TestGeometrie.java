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
public class TestGeometrie {
    
public static void main(String args[])
	{
	Rectangle rect=new Rectangle(50,30);
        rect.affiche();
    
	Carre carr=new Carre(25);
	carr.surface();
        carr.perimetre();
          
	for (int i=0;i<=2;i++) System.gc();		
		
	Rectangle cage[]= new Rectangle[5];
        cage[0]=carr;
        cage[1]=new Carre(20);
        cage[2]=rect;
        cage[4]=new Rectangle(21,11);
		
	  for (int i=0;i<cage.length;i++) 
		if (cage[i]!=null) {
			cage[i].surface();
			cage[i].perimetre();
		}
	}	
}