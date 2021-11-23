package Exo1Centre;

public class Specialite {

	//attributs
	private String specialite;

	//constructor
	public Specialite(String specialite) {
		super();
		this.specialite = specialite;
	}
	
	//getter
	public String getSpecialite() {
		return specialite;
	}

	@Override
	public String toString() {
		return "Specialite [specialite=" + specialite + "]";
	}
	
}
