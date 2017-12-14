/**
 * @author bruno
 */
package testmenagerie;

class TestMenagerie2
{
public static void main(String args[])
 {
 System.out.println("IL ETAIT UNE FOIS, DES ANIMAUX, DES FELINS ET DES OISEAUX");
 Lion leo=new Lion("Leo",30,12);
 Oiseau titi=new Oiseau("Titi",0.2f);
 Animal teki=new Animal();
 Felin kite=new Felin();
 System.out.println("-----------------------------");
 System.out.println("ARRIVE LE BRACONNIER QUI LES MET TOUS EN CAGE");
 System.out.println("-----------------------------");
 System.out.println("Population avant mise en cage : "+Animal.getPopulation());
 Animal cage[]= new Animal[6];
        cage[0]=titi;
        cage[1]=new Lion("Simba",20,3);
        cage[2]=teki;
        cage[3]=leo;
        cage[4]=new Felin("GrosMinet",10,45);
        cage[5]=kite;
 System.out.println("-----------------------------");
 System.out.println("Population après mise en cage : "+Animal.getPopulation());
 System.out.println("-----------------------------");
 for (int i=0;i<cage.length;i++) {
   if (cage[i]!=null) {
     cage[i].crier();
     cage[i].afficher();
   }
  }
 } 
}