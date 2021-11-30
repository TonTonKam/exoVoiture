package etudiant;

public class MainEtudiant {

	public static void main(String[] args) {
		//Créer 3 étudiants
		Etudiant student = new Etudiant("Homer", "Simpson");
		Etudiant student1 = new Etudiant("Jean", "Dupont");
		Etudiant student2 = new Etudiant("Machin", "Bibule");
		//bonus
		Etudiant student3 = new Etudiant("Pata", "Coufin");
		
		EtudiantDao dao = new EtudiantDao();
		
		//Créer 3 étudiants
		dao.create(student);
		dao.create(student1);
		dao.create(student2);
		dao.create(student3);
		
		//Afficher l’étudiant avec   id = 3
		System.out.println(dao.findById(3));
		System.out.println("********");
		for (Etudiant etud3 : dao.findById(3)) {
			System.out.println("Etudiant3, son nom : "+ etud3.getNom() +", son prenom : "+ etud3.getPrenom());
		}
		//Supprimer l’étudiant avec id = 3
		dao.delete(3);
		
		//Modifier le nom de l’étudiant Jean par Dujardin
		dao.update("Dujardin", "Dupont", dao.findByEtuNom("Jean"));
		
		//Afficher la liste des étudiants
		for (Etudiant etud : dao.read()) {
			System.out.println("Etudiant, son nom : "+ etud.getNom() +", son prenom : "+ etud.getPrenom());
		}
		
		//Afficher la liste des étudiants portant le nom « Camara »
		for (Etudiant nom : dao.findByNom("Camara")) {
			System.out.println("Etudiant3, son nom : "+ nom.getNom() +", son prenom : "+ nom.getPrenom());
		}
	}

}
