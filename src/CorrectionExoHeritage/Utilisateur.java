package CorrectionExoHeritage;

public class Utilisateur extends Personne{

	private String login, mdp, service;
	private Roles roles;

	public Utilisateur(String nom, String prenom, String email, String tel, double salaire, String login, String mdp,
			String service, Roles role) {
		super(nom, prenom, email, tel, salaire);
		this.login = login;
		this.mdp = mdp;
		this.service = service;
		this.roles = role;
	}

	public Utilisateur(String nom, String prenom, String email, String tel, double salaire, String login, String mdp,
			String service) {
		super(nom, prenom, email, tel, salaire);
		this.login = login;
		this.mdp = mdp;
		this.service = service;
	}
	
	public Utilisateur(String nom, String prenom, double salaire, Roles role) {
		super(nom, prenom, salaire);
		this.roles = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Roles getRole() {
		return roles;
	}

	public void setRole(Roles role) {
		this.roles = role;
	}
	
	//fonctions
	public double calculSal() {
		if(this.roles.getLibelle().equalsIgnoreCase("manager")) {
			return 1.1 * this.getSalaire();
		}
		else if(this.roles.getLibelle().equalsIgnoreCase("directeur general")) {
			return 1.4 * this.getSalaire();
		}
		return super.calculSal();
	}
	
	public String afficher() {
		return super.afficher()+ " "+ roles.getLibelle();
	}
}
