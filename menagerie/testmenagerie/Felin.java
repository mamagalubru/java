/**
 * @author bruno
 */
package testmenagerie;

public class Felin extends Animal {

 private int age;
 
 Felin() {
  nom="Etrange";
  poids=21; 
  age=2000; 
  incPopulation();
 }
 Felin(String leNom,float lePoids, int leAge) {
  super(leNom,lePoids);
  setAge(leAge);
 } 
 
 public void setAge(int leAge) {
  this.age=leAge;
 }
 public int vieillir() {
  age=age+1;
  return age;
 }
 public void crier() {
  System.out.println(nom+" est un Félin qui miaule ou rugit fort ");
 }
 public void afficher() {
  super.afficher();
  System.out.println(nom + " est agé de " + age + " ans");
 }
}