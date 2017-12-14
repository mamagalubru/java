/**
 * @author bruno
 */
package testmenagerie;

class TestMenagerie1
{
public static void main(String args[])
 {
 System.out.println("IL ETAIT UNE FOIS, DES ANIMAUX, DES FELINS ET DES OISEAUX");
 Lion leo=new Lion("Leo",30,12);
 leo.vieillir();
 leo.afficher();
 leo.crier();
 Oiseau titi=new Oiseau("Titi",0.2f);
 titi.afficher();
 titi.crier();
 Animal teki=new Animal();
 teki.afficher();
 teki.crier();
 Felin kite=new Felin();
 kite.setAge(25);
 kite.afficher();
 kite.crier();
 System.out.println("-----------------------------");
 System.out.println("Population : "+Animal.getPopulation());
 System.out.println("-----------------------------");
 System.out.println("PUIS, LE FELIN REDEVIENT LION");
 kite=leo;
 kite.crier();
 leo.vieillir(); 
 kite.afficher(); 
 System.out.println("-----------------------------");
 System.out.println("Population avant ramasse-miette : "+Animal.getPopulation());
 System.gc();  
 System.out.println("Population après ramasse-miette : "+Animal.getPopulation());
 } 
}