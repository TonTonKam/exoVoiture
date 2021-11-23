package coursTvTravail;

public class Main {

	public static void main(String[] args) {
		
		Voiture polo = new Voiture();
		Voiture bmw = new Voiture(250, 100, 50,"Diesel");
		
		Moto honda = new Moto(250, 100, 50,"essence");
		
		System.out.println(polo + " " + bmw  + " " + honda);
		
		Pompe esso = new Pompe(500, 200, "Essence");
		Pompe total = new Pompe(500, 200, "Diesel");
		
		System.out.println("Avant " + total);
		
		bmw.faireLePlein(total);
		bmw.faireLePlein(esso);
		
		System.out.println("Apres " + total);
		
		
	}

}
