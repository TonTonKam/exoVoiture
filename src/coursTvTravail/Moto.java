package coursTvTravail;

public class Moto extends Vehicule{

	final int ROUES = 2;
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(int nbRoues, int contenanceRes, int contenuRes, String typeDeCarburant) {
		super(nbRoues, contenanceRes, contenuRes, typeDeCarburant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [ROUES=" + ROUES + "]";
	}
	
}
