import  java.io.*;

class TestCercle {

public static void main (String args[]) {

	Cercle c1=new Cercle(10);
	DemiCercle dc1=new DemiCercle(10);
	System.out.println("Surface cercle = " + c1.surface());
	System.out.println("Perimetre cercle = " + c1.perimetre());
	System.out.println("Surface demi-cercle = " + dc1.surface());
	System.out.println("Perimetre demi-cercle = " + dc1.perimetre());
		}
	}