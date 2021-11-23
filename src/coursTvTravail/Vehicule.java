package coursTvTravail;

public class Vehicule {
	
	//attributs
	private int vMax, contenanceRes, contenuRes;
	private String typeDeCarburant;

	//constructeur
	public Vehicule() {
		
	}
	
	public Vehicule(int vMax, int contenanceRes, int contenuRes, String typeDeCarburant) {
		super();
		this.vMax = vMax;
		this.contenanceRes = contenanceRes;
		this.contenuRes = contenuRes;
		this.typeDeCarburant = typeDeCarburant;
	}

	//getter & setter
	public int getvMax() {
		return vMax;
	}

	public void setvMax(int vMax) {
		this.vMax = vMax;
	}

	public int getContenanceRes() {
		return contenanceRes;
	}

	public void setContenanceRes(int contenanceRes) {
		this.contenanceRes = contenanceRes;
	}

	public int getContenuRes() {
		return contenuRes;
	}

	public void setContenuRes(int contenuRes) {
		this.contenuRes = contenuRes;
	}

	public String getTypeDeCarburant() {
		return typeDeCarburant;
	}

	public void setTypeDeCarburant(String typeDeCarburant) {
		this.typeDeCarburant = typeDeCarburant;
	}
	
	//fonction
	public void faireLePlein(Pompe pompe) {
		//bonus
		if(this.typeDeCarburant != pompe.getTypeDeCarburant()) {
			System.err.println("Ce n'est pas le bon type de carburant");
		}else {
			//exo normal
			int besoinCarburant = this.contenanceRes - this.contenuRes;
			
			System.out.println("Votre besoin de carburant est de : "+ besoinCarburant);
			
			if(besoinCarburant > pompe.getContenuRes()) {
				besoinCarburant = pompe.getContenuRes();
			}
			System.out.println("Faire le plein en ajoutant au contenu ce dont il a besoin pour remplir le reservoir");
			
			this.contenanceRes += besoinCarburant;
			
			pompe.setContenuRes(pompe.getContenuRes() - besoinCarburant);
		}
	}

}
