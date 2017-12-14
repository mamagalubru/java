public class Etudiant extends Personne {
	
	void etudier() {
		System.out.println(prenom + " " + nom + " " + age + " ans, apprend la vie !!!");
	}
	
	Etudiant(String unNom,String unPrenom) {
		super(unNom,unPrenom,20);
	}
	
}