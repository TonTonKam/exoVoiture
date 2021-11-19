package EvalJava;

public abstract class Vehicule {

	protected abstract int nbRoues();
	protected abstract String typeCarburant(String typeUtilise);
	protected abstract String typeCarburant();
	
	protected abstract int vitesseMax();
	
	/*
	Dans Véhicule, ajouter une méthode fairePlein() qui prend une Pompe en paramètre,
	qui remplit le réservoir du Véhicule et enlève autant d'essence à la Pompe
	*/
	protected abstract int fairePlein(PompeEssence pompe, int quantite);
	
}
