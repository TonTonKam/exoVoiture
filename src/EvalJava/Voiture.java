package EvalJava;

public class Voiture extends Vehicule{
	
	//attributs
	int contenanceReservoir;
	String contenuReservoir;
	
	//constructeur
	public Voiture() {
		super();
		contenanceReservoir = 0;
	}
	
	public Voiture(String contenu) {
		super();
		contenanceReservoir = 0;
		this.contenuReservoir = contenu;
	}

	//methode
	@Override
	protected int nbRoues() {

		return 4;
	}

	//si le constructeur est vide
	@Override
	protected String typeCarburant(String typeUtilise) {
		contenuReservoir = typeUtilise;
		return contenuReservoir;
	}
	
	//si le constructeur est de typeCarburant
	@Override
	protected String typeCarburant() {

		return null;
	}

	@Override
	protected int vitesseMax() {

		return 10;
	}

	@Override
	protected int fairePlein(PompeEssence pompe, int quantite) {
		int contenanceE = pompe.getContenanceEssence();
		int contenanceD = pompe.getContenanceDiesel();
		if(this.contenuReservoir == "essence") {
			if(pompe.getContenanceEssence() > 0 && quantite <= pompe.getContenanceEssence()) {
				contenanceE -= quantite;
				pompe.setContenanceEssence(contenanceE) ;
				this.contenanceReservoir += quantite;
			}
		}else {
			if(pompe.getContenanceDiesel() > 0 && quantite <= pompe.getContenanceDiesel()) {
				contenanceD -= quantite;
				pompe.setContenanceDiesel(contenanceD) ;
				this.contenanceReservoir += quantite;
			}
		}
		return contenanceReservoir;
	}


	
	//getter
	public int getContenanceReservoir() {
		return contenanceReservoir;
	}

	public String getContenuReservoir() {
		return contenuReservoir;
	}
	
	@Override
	public String toString() {
		return " La voiture a pour contenance " + contenanceReservoir + "litres, il contient de " + contenuReservoir + ". ";
	}

}
