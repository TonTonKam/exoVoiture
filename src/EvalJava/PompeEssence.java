package EvalJava;

public class PompeEssence {
	//attribut
	private String typeCarburant, contenu;
	private int contenanceEssence, contenanceDiesel;
	
	//constructeur
	public PompeEssence() {
		super();
		contenu = typeCarburant;

		if(contenu == "essence") {
			this.contenanceEssence = 50;
		}else{
			this.contenanceDiesel = 50;
		}
	}

	//getter & setter
	
	public String getContenu() {
		return contenu;
	}

	public int getContenanceEssence() {
		return contenanceEssence;
	}

	public void setContenanceEssence(int contenance) {
		this.contenanceEssence = contenance;
	}
	
	public int getContenanceDiesel() {
		return contenanceDiesel;
	}
	
	public void setContenanceDiesel(int contenance) {
		this.contenanceDiesel = contenance;
	}

	@Override
	public String toString() {
		return "La pompe d'essence a pour contenance : " + contenanceEssence + ", la pompe de diesel a pour contenance " + contenanceDiesel + ". ";
	}
	
	
	
}
