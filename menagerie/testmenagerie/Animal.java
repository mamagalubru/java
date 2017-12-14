/**
 * @author bruno
 */
package testmenagerie;

public class Animal {
  
 private static int population=0;
 
 protected String nom;
 protected float poids;
 
 Animal() {
  nom="Bizarre";
  poids=0; 
  incPopulation();
 }
 Animal(String leNom,float lePoids) {
  nom=leNom;
  poids=lePoids;
  incPopulation();
 }
 protected void finalize() {
  population=population-1;
 }  
 
 public void crier() {
  System.out.println(nom + " est un Animal qui émet un bruit");
  }
 public void afficher() {
  System.out.println(nom + " pèse " + poids + " kg");
 }
 public static int getPopulation() {
  return population;
 }
 public static void incPopulation() {
  population=population+1;
 }
}