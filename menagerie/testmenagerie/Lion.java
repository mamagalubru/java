/**
 * @author bruno
 */
package testmenagerie;

public class Lion extends Felin {
 public void crier() {
  System.out.println(nom+" est un Lion qui rugit tr�s fort ");
 }
 Lion(String leNom,float lePoids, int leAge) {
  super(leNom,lePoids,leAge);
 }
}