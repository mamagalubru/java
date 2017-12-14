public class Personne
{ 
  public String nom; 
  public String prenom;
  public int age;
  
  public Personne()
  {
    nom="Inconnu"; 
    prenom="Inconnu"; 
    age = 0;
  } 
  public Personne(String unNom)
  {
    nom=unNom; 
    prenom="Peu connu"; 
    age = 0;
  } 
  public Personne(String unNom,String unPrenom)
  {
    nom=unNom; 
    prenom=unPrenom; 
    age = 0;
  } 
  public Personne(String unNom,String unPrenom,int unAge)
  {
    nom=unNom; 
    prenom=unPrenom; 
    age = unAge;
  } 
 }