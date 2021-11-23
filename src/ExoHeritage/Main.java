package ExoHeritage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Utilisateur fred = new Utilisateur("Fred", "Eric", "machin@truc.fr", 01050232 , "frederic", "cache", "chef de projet");
		Utilisateur luc = new Utilisateur("Luc", "Jean", "machin@boulot.fr", 1254587 , "jeanluc", "mot", "directeur general");
		Utilisateur marc = new Utilisateur("Marc", "Pierre", "caillou@boulot.fr", 1254987 , "marc", "mot", "manager");
		Utilisateur vincent = new Utilisateur("Vincent", "Pierre", "vince@boulot.fr", 186587 , "vince", "123", "directeur general");
		Utilisateur trac = new Utilisateur("Trac", "Pierre", "caillou@truc.fr", 1564856 , "piretrac", "soleil", "manager");
		
		Roles manager = new Roles("MN", "manager");
		Roles dirGen = new Roles("DG", "directeur general");
		Roles drh = new Roles("DRH", "directeur des ressources humaines");
		
		System.out.println(marc.calculerSalaire(manager));
		System.out.println(marc.calculerSalaire(dirGen));
		System.out.println(marc.calculerSalaire(drh));
		
		ArrayList<Utilisateur> listeUtilisateur = new ArrayList<>();
		listeUtilisateur.add(fred);
		listeUtilisateur.add(luc);
		listeUtilisateur.add(marc);
		listeUtilisateur.add(vincent);
		listeUtilisateur.add(trac);
		
		for (int i = 0; i < listeUtilisateur.size(); i++) {
			System.out.println("le "+ (i + 1)+"e utilisateur est  : "+ listeUtilisateur.get(i).afficher());
		}
		
		for (int i = 0; i < listeUtilisateur.size(); i++) {
			if(listeUtilisateur.get(i).getService().indexOf("manager") == 0) {
				System.out.println("les managers sont : "+ listeUtilisateur.get(i).afficher());
			}
		}
	}

}
