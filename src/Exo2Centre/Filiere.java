package Exo2Centre;

public class Filiere {
	
	//attribut
	private String nom;

	//constructor
	public Filiere(String nom) {
		super();
		this.nom = nom;
	}

	//getter
	public String getNom() {
		return nom;
	}

	//toString
	@Override
	public String toString() {
		return  "Filière : "+nom +"\n";
	}
	

}
