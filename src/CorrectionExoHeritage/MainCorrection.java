package CorrectionExoHeritage;

public class MainCorrection {

	public static void main(String[] args) {

		//creation de roles
		Roles cp = new Roles("CP", "Chef de projet");
		Roles mn = new Roles("MN", "Manager");
		Roles dp = new Roles("DP", "Directeur de projet");
		Roles drh = new Roles("DRH", "Directeur de ressources");
		Roles dg = new Roles("DG", "Directeur general");
		
		Utilisateur cda = new Utilisateur("afpa", "prenom", "email", "tel", 2000, "login", "mdp", "service", mn);
		Utilisateur cda1 = new Utilisateur("machin", "prenom", 1500, drh);
		Utilisateur cda2 = new Utilisateur("truc", "prenom", 12000, dg);

		System.out.println(cda.afficher());
		System.out.println(cda1.afficher());
		System.out.println(cda2.afficher());
		
		System.out.println(cda.calculSal());
		System.out.println(cda1.calculSal());
		System.out.println(cda2.calculSal());
	}

}
