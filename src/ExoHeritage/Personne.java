package ExoHeritage;

public class Personne {
	//attribut
	private String nom, prenom, email;
	private int tel;
	private double salaire;
	
	//constructor
	public Personne(String nom, String prenom, String email, int tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double d) {
		this.salaire = d;
	}
	
}
