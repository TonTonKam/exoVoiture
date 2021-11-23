package coursTvTravail;

public class Voiture extends Vehicule{
	
	final int ROUES = 4;

	public Voiture() {
		super();
	}

	public Voiture(int nbRoues, int contenanceRes, int contenuRes, String typeDeCarburant) {
		super(nbRoues, contenanceRes, contenuRes, typeDeCarburant);
		
	}

	@Override
	public String toString() {
		return "Voiture [ROUES=" + ROUES + "]";
	}
	
	
}
