package EvalJava;

public abstract class Vehicule {

	protected abstract int nbRoues();
	protected abstract String typeCarburant(String typeUtilise);
	protected abstract String typeCarburant();
	
	protected abstract int vitesseMax();
	
	/*
	Dans V�hicule, ajouter une m�thode fairePlein() qui prend une Pompe en param�tre,
	qui remplit le r�servoir du V�hicule et enl�ve autant d'essence � la Pompe
	*/
	protected abstract int fairePlein(PompeEssence pompe, int quantite);
	
}
