class Voiture extends Vehicule {

Voiture (double poids) {
super(poids);
}

int carburant=10;

public  String toString() {return "Je suis une voiture ("+getPoids()+")";}

	void consommeCarburant() throws CarburantException
	{if (carburant>0) {
		carburant--;}
	else throw new CarburantException("Panne seche");
	}
	
	void avance() throws PneuException
	{if (Math.random()>0.1) throw new PneuException("Pneu creve");
	}

	void rouler(){
		try {
		consommeCarburant();
			avance();	
	   	        System.out.println("Je consomme de l'essence");
			
			}
		catch (PneuException e) {System.out.println(e.getMessage()+". Vous devez sortir la roue de secours");}		
	}
	
	
	}