import  java.io.*;

class Test {

static Object relecture(String s) {
try  {FileInputStream f = new FileInputStream(new File(s));
	 ObjectInputStream oos = new ObjectInputStream(f);
	 Object o=oos.readObject();
         oos.close();
	 return o;}
      catch (Exception e)
       { System.out.println("Erreur "+e);
          return null;}
}
	
	public static void main (String args[]) {

CarFerry monCarFerry=new CarFerry(100000);
Vehicule v=new Voiture(800.0);
monCarFerry.ajouteVehicule(v);
v=new Voiture(900.0);
monCarFerry.ajouteVehicule(v);
v=new Velo(15.0);
monCarFerry.ajouteVehicule(v);
v=new Voiture(700.0);
monCarFerry.ajouteVehicule(v);
v=new Velo(10.0);
monCarFerry.ajouteVehicule(v);
v=new Voiture(850.0);
monCarFerry.ajouteVehicule(v);
monCarFerry.sauvegarde("sauve");
monCarFerry= (CarFerry)(relecture("sauve"));
System.out.println(monCarFerry);
		}
	}