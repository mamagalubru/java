import java.util.*;
import java.io.*;

class CarFerry implements Serializable {
private Collection cale;
private double poidsLimite;
	
CarFerry(double poidsLimite){
this.poidsLimite=poidsLimite;
cale=new ArrayList ();	
	}

double poidsDesVehiculesDansLaCale(){
Iterator i=cale.iterator();
double poids=0;
while (i.hasNext()) {
	try
	    {Vehicule vehiculeDansLaCale =(Vehicule)(i.next());
	    poids=poids+vehiculeDansLaCale.getPoids();}
	catch (Exception e) { System.out.println("Quelqu'un a mis autre chose qu'un véhicule dans la cale !");}
	}
return poids;
}

boolean ajouteVehicule(Vehicule v) {
	if (poidsDesVehiculesDansLaCale()+v.getPoids()<=poidsLimite)
		{cale.add(v);
		return true;}
	else return false;		
	
	}	

void sauvegarde(String s) {
try
       {FileOutputStream f = new FileOutputStream(new File(s));
	 ObjectOutputStream oos = new ObjectOutputStream(f);
	 oos.writeObject(this);
         oos.close();}
      catch (Exception e)
       { System.out.println("Erreur "+e);}
}


public static void main (String args[])
{CarFerry monCarFerry=new CarFerry(100000);
Vehicule v=new Voiture(800.0);
Vehicule aEnlever =v;
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
System.out.println(monCarFerry.cale);
monCarFerry.cale.remove(aEnlever);
System.out.println(monCarFerry.cale);
v=new Voiture(1500.0);
monCarFerry.ajouteVehicule(v);
System.out.println(monCarFerry.cale);
}
	
}