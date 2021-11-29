package Polymorphisme;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Polo pl = new Polo();
		Moto moto = new Moto();
		
		pl.seDeplacer();
		moto.seDeplacer();
		
		System.out.println("-- polymorphisme --");
		
		Voiture poloMut = new Polo();
		
		Voiture motoMut = new Moto();
		
		poloMut.seDeplacer();
		motoMut.seDeplacer();
		
		ArrayList<Voiture> listVoiture = new ArrayList<>();
		listVoiture.add(motoMut);
		listVoiture.add(poloMut);
		listVoiture.add(pl);
		listVoiture.add(moto);
		
		for (int i = 0; i < listVoiture.size(); i++) {
			System.out.println(listVoiture.get(i));
			listVoiture.get(i).seDeplacer();
		}
		
		
		IPersonne eleve = new Cda();
		IPersonne classe = new Afpa();
		
		System.out.println("-- polymorphisme --\n");
		
		System.out.println(eleve.bonjour());
		System.out.println(classe.bonjour());
		
		//creation d'un objet interface
		IPersonne IPersonne = new IPersonne() {
			
			@Override
			public String bonjour() {
				// TODO Auto-generated method stub
				return "je dis bonjour";
			}
		};
		System.out.println(IPersonne.bonjour());
	}

}
