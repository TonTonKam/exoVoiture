package Exo2Centre;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		Filiere informatique = new Filiere("Informatique");
		Filiere techno = new Filiere("Techno de l'info et de communication");
		Filiere genie = new Filiere("Génie civil");
		Filiere marketing = new Filiere("Marketing");
		
		Etudiant camara = new Etudiant("Camara", "Moussa", informatique);
		Etudiant homer = new Etudiant("Homer", "Simpson", informatique);
		Etudiant machin = new Etudiant("Machin", "Bidule", marketing);
		Etudiant jean = new Etudiant("Jean", "Dupont", genie);
		Etudiant bart = new Etudiant("Bart", "Simpson", genie);
		
		ArrayList<Filiere> listFiliere = new ArrayList<>();
		listFiliere.add(informatique);
		listFiliere.add(techno);
		listFiliere.add(genie);
		listFiliere.add(marketing);
		
		ArrayList<Etudiant> listEtudiant = new ArrayList<>();
		listEtudiant.add(camara);
		listEtudiant.add(homer);
		listEtudiant.add(machin);
		listEtudiant.add(jean);
		listEtudiant.add(bart);
		
		System.out.println("La liste des filières de notre école : \n" + informatique +""+ techno +""+ genie + "\n");
		
		System.out.println("Liste des étudiants par filière : \n");

		for (int i = 0; i < listFiliere.size(); i++) {
			System.out.println(listFiliere.get(i));
			
			for (int j = 0; j < listEtudiant.size(); j++) {
				if(listFiliere.get(i).getNom().equalsIgnoreCase(listEtudiant.get(j).getFiliere().getNom())) {
					System.out.println(listEtudiant.get(j));
				}
			}
		}
		

	}// fin

}
