package ExoHeritage;

public class Utilisateur extends Personne implements Ifonction{
	
	//attributs
	private String login, motDePasse, service;
	public static int identifiant = 0;
	private int ident;
	
	public Utilisateur(String nom, String prenom, String email, int tel, String login, String motDePasse,
			String service) {
		super(nom, prenom, email, tel);
		this.login = login;
		this.motDePasse = motDePasse;
		this.service = service;
		
		identifiant++;
		ident = identifiant;
	}

	//fonctions
	public int getIdent() {
		return ident;
	}

	@Override
	public String afficher() {
		return "login=" + login + ", motDePasse=" + motDePasse + ", service=" + service + ", ident="
				+ ident + ", getIdent()=" + getIdent() + ", getSalaire()=" + getSalaire();
	}

	@Override
	public double calculerSalaire(Roles roles) {
		if(roles.getLibelle() == "manager" && roles.getLibelle() == this.getService() ) {
			setSalaire(roles.getSALAIRE() * 1.1);
		}
		else if(roles.getLibelle() == "directeur general" && roles.getLibelle() == this.getService()) {
			setSalaire(roles.getSALAIRE() * 1.4);
		}else {
			setSalaire(roles.getSALAIRE());
		}
		return getSalaire();
	}

	public String getService() {
		return service;
	}
	
}
