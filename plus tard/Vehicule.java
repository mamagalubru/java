import java.io.*; // pour pouvoir utiliser l'interface Serializable  afin de sauvegarder les vehicules dans un fichier

public abstract class Vehicule implements Comparable, Serializable {
private double poids;

public int compareTo(Object v) {
if (v instanceof Vehicule) {
	System.out.println("on compare un vehicule de poids"+this.poids+" avec un autre vehicule de poids"+((Vehicule)v).getPoids());
	if (this.poids <  ((Vehicule)v).getPoids() )
		return -1;
	else if (this.poids  == ((Vehicule)v).getPoids())
			return 0;
		else return 1;}
else return 1;
}

Vehicule (double poids) {
this.poids=poids;}

double getPoids(){return poids;}

public String toString() {
return "Je suis une vehicule";}

abstract void rouler ();

}