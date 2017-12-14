public class TourDeHanoi {
	
static void hanoi(int nb_disques, int depart, int arrivee){
int intermediaire = 6-(depart+arrivee);
if (nb_disques > 0) {
  hanoi (nb_disques-1, depart, intermediaire);
 System.out.println ("disque "+nb_disques+" de "+depart + "->" + arrivee);
  hanoi (nb_disques-1, intermediaire, arrivee);
  }
}

public static void main (String args[]) {
	hanoi(3,1,3);
}
}

