package Exo1Centre;

import java.util.ArrayList;

public class MainActivity {

	public static void main(String[] args) {
		Specialite java = new Specialite("JAVA/JEE");
		Specialite html = new Specialite("HTML/CSS");
		Specialite gestion = new Specialite("Gestion de projet");
		Specialite js = new Specialite("JS");
		Specialite php = new Specialite("PHP");
		
		Enseignant prof1 = new Enseignant(java, "Ted");
		Enseignant prof2 = new Enseignant(java, "Medh");
		Enseignant prof3 = new Enseignant(php, "Jhon");
		Enseignant prof4 = new Enseignant(js, "Momo");
		
		ArrayList<Specialite> listSpec = new ArrayList <>();
		listSpec.add(java);
		listSpec.add(html);
		listSpec.add(gestion);
		listSpec.add(js);
		listSpec.add(php);
		
		ArrayList<Enseignant> listProf = new ArrayList <>();
		listProf.add(prof1);
		listProf.add(prof2);
		listProf.add(prof3);
		listProf.add(prof4);

		
		for(int i = 0; i < listSpec.size(); i++) {
			//initialisation de la variable dans la boucle pour qu'a chaque passage elle se mette a false
			boolean valeurNull = false;
			for (int j = 0; j < listProf.size(); j++) {
				if(listSpec.get(i).getSpecialite() == listProf.get(j).getSpecialiteObject().getSpecialite()) {
					System.out.println(listProf.get(j));
					valeurNull = true;
				}
			}
			//si a la fin de la boucle de la listProf le false ne change pas, alors il n'y a aucun prof dans la listSpec
			if(valeurNull == false) {
				System.out.println("Aucun enseignant pour la spécialité : "+ listSpec.get(i).getSpecialite());
			}
		}
	}

}
