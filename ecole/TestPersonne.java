import  java.io.*;

class TestPersonne {

public static void main (String args[]) {

	Personne p1=new Personne();
	Personne p2=new Personne("tetu");
	Personne p3=new Personne("toto","tatoo");
	Etudiant p4=new Etudiant("tetenlair","touriste");
	System.out.println("Noms = " + p1.nom + p2.nom + p3.nom + p4.nom);
	System.out.println("Prenoms = " + p1.prenom + p2.prenom + p3.prenom + p4.prenom);
	System.out.println("Ages = " + p1.age + p2.age + p3.age + p4.age);
	
	Personne foule[]= new Personne[4];
    foule[0]=p1;
    foule[1]=p2;
    foule[2]=p3;
    foule[3]=p4;
		
	for (int i=0;i<foule.length;i++) 
		if (foule[i]instanceof Etudiant) {
			((Etudiant)foule[i]).etudier();
		}
	}
}