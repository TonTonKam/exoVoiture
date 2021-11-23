package CorrectionExoHeritage;

public class Personne {

	private String nom, prenom, email, tel;
	private double salaire;
	
	public Personne(String nom, String prenom, String email, String tel, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.salaire = salaire;
	}
	public Personne(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	//fonction
	public double calculSal() {
		return this.salaire;
	}

	public String afficher() {
		return "nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", tel=" + tel + ", salaire="
				+ salaire;
	}
	
}
