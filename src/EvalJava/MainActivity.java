package EvalJava;

public class MainActivity {

	public static void main(String[] args) {
		PompeEssence pompe = new PompeEssence();
		
		Moto motoEssence = new Moto();
		Moto motoDiesel = new Moto();
		
		Moto motoTypeDiesel = new Moto("diesel");
		Moto motoTypeEssence = new Moto("essence");
		
		Voiture voitureEssence = new Voiture();
		Voiture voitureDiesel = new Voiture();

		Voiture voitureTypeEssence = new Voiture("essence");
		Voiture voitureTypeDiesel = new Voiture("diesel");
		
		
		//afficher
		/*
		System.out.println("le vehicule possede : "+ motoEssence.nbRoues() + " de nombre de roues");
		System.out.println("le vehicule a du carburant de type : "+ motoEssence.typeCarburant("essence"));
		System.out.println("le vehicule a du carburant de type : "+ motoDiesel.typeCarburant("diesel"));
		System.out.println("le caburant du vehicule est : "+ motoTypeDiesel.toString());
		System.out.println("le caburant du vehicule est : "+ motoTypeEssence.toString());
		
		System.out.println("le vehicule possede : "+ voitureEssence.nbRoues() + " de nombre de roues");
		System.out.println("le vehicule a du carburant de type : "+ voitureEssence.typeCarburant("essence"));
		System.out.println("le vehicule a du carburant de type : "+ voitureDiesel.typeCarburant("diesel"));
		*/
		System.out.println("le caburant du vehicule est : "+ voitureTypeDiesel.toString());
		System.out.println("le caburant du vehicule est : "+ voitureTypeEssence.toString());
		System.out.println(pompe.toString());
		
		voitureTypeEssence.fairePlein(pompe, 5);
		System.out.println(voitureTypeEssence.toString() + pompe.toString());
		
		voitureTypeDiesel.fairePlein(pompe, 15); 
		System.out.println(voitureTypeDiesel.toString() + pompe.toString());
		
		System.out.println(pompe.toString());
		
		motoTypeEssence.fairePlein(pompe, 8);
		System.out.println(motoTypeEssence + pompe.toString());
	}

}
