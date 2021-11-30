package etudiant;

public class Etudiant{
	
	//attributs
	private String nom, prenom;
	//bonus
	private int id;

	//constructor
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	//bonus
	public Etudiant(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	

	//getter & setter
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public int getId() {
		return id;
	}
	
}
