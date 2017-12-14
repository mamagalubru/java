	class Exponentielle {
		
		static double puissanceIterative(double x,int n) {
			double resultat=1;
			for (int i=1;i<=n;i++) resultat=resultat*x;
			return resultat;
			}			

		static double puissanceRecursive(double x,int n) {
			if (n<=0) return 1;
			else return x*puissanceRecursive(x,n-1);
			}
			
		static long factorielleIterative (int n) {
			long resultat=1;
			for (int i=1;i<=n;i++) resultat=resultat*i;
			return resultat;
			}	
		
		static long factorielleRecursive (int n) {
			if (n<=1) return 1;
			else return n*factorielleRecursive(n-1);
			}

		static double exponentielle(double x) {
			double resultat=0;//va mémoriser la succession des sommes
			int n=0; // compte le nombre d'itérations
			double terme; // mémorise x^n/n!
			do {terme = puissanceRecursive(x,n)/factorielleRecursive(n);
				resultat=resultat+terme;
				n=n+1;
				}
			while (terme>0.00000000001);	
			return resultat;
			}
			
			
		static double exponentielle2(double x) {
			double resultat=1;//va mémoriser la succession des sommes
			int n=0; // compte le nombre d'itérations
			double terme; // mémorise x^n/n!
			double puissanceN=1;//memorise la valeur de x^n
			double factorielleN=1;//memorise la valeur de n!
			do {n=n+1;
				puissanceN=puissanceN*x;
				factorielleN=factorielleN*n;
				terme=puissanceN/factorielleN;
				resultat=resultat+terme;
			}
			while (terme>0.0000000000001);	
			return resultat;
		}	
				
		public static void main (String arg[]) {
			double e=0;
			long t1=System.currentTimeMillis(); 
			for (int i=1;i<1000000;i++) e=exponentielle(1);
			long t2=System.currentTimeMillis();
			for (int i=1;i<1000000;i++) e=exponentielle2(1);
			long t3=System.currentTimeMillis(); 
			System.out.println("Methode 1 :"+(t2-t1)+"ms");
			System.out.println("Methode 2 :"+(t3-t2)+"ms");
			}
		
		}