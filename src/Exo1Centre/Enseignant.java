package Exo1Centre;

public class Enseignant{

	//attributs
	private String nom;
	private Specialite specialite;

	//constructor
	public Enseignant(Specialite specialite, String nom) {
		this.specialite = specialite;
		this.nom = nom;
	}

	//getter
	public String getNom() {
		return nom;
	}

	public Specialite getSpecialiteObject() {
		return specialite;
	}

	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", specialite=" + specialite + "]";
	}
	
}
