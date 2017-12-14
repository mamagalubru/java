/**
 * @author bruno
 */
package testmenagerie;

public class Oiseau extends Animal {
 public void crier() {
  System.out.println(nom + " est un Oiseau qui siffle et chante");
 }
 Oiseau(String leNom,float lePoids) {
  super(leNom,lePoids);
 }
}