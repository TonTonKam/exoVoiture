package ExoHeritage;

public class Roles {
	//attributs
	private String code, libelle;
	private final double SALAIRE = 2000;

	//constructor
	public Roles(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	//getter & setter
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getSALAIRE() {
		return SALAIRE;
	}
	
	
}
