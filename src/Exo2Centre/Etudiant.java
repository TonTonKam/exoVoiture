package Exo2Centre;

public class Etudiant {

	//attributs
	private String nom, prenom;
	private Filiere filiere;
	
	//constructor
	public Etudiant(String prenom, String nom, Filiere filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}
	
	//getter
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	
	//toString
	@Override
	public String toString() {
		return "Je suis l'�tudiant "+ prenom + " " + nom+"\n";
	}
	
	
}