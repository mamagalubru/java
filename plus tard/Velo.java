class Velo extends Vehicule {

Velo (double poids) {
super(poids);
}

public String toString() {return "Je suis un velo ("+getPoids()+")";}

void rouler() {System.out.print("je pédale");}

}
