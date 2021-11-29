package Polymorphisme;

public class Polo extends Voiture{

	@Override
	public void seDeplacer() {
		System.out.println("Je me deplace en voiture");
		
	}

	@Override
	public void sArreter() {
		System.out.println("Je m'arrete en voiture");
		
	}

}
