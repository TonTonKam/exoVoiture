package Exo2Centre;

public class Etudiant {

	//attributs
	private String nom, prenom;
	private Filiere filiere;
	private EFiliere eFiliere;
	
	//constructor
	public Etudiant(String prenom, String nom, Filiere filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}
	
	
	public Etudiant(String nom, String prenom, EFiliere eFiliere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.eFiliere = eFiliere;
	}

	//fonctions
	

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
		return "Je suis l'étudiant "+ prenom + " " + nom+"\n";
	}
	
	
}
