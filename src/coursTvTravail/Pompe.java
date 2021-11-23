package coursTvTravail;

public class Pompe {
	private int contenanceRes, contenuRes;
	private String typeDeCarburant;
	
	
	public Pompe(int contenanceRes, int contenuRes, String typeDeCarburant) {
		super();
		this.contenanceRes = contenanceRes;
		this.contenuRes = contenuRes;
		this.typeDeCarburant = typeDeCarburant;
	}


	public int getContenanceRes() {
		return contenanceRes;
	}


	public void setContenanceRes(int contenanceRes) {
		this.contenanceRes = contenanceRes;
	}


	public int getContenuRes() {
		return contenuRes;
	}


	public void setContenuRes(int contenuRes) {
		this.contenuRes = contenuRes;
	}


	public String getTypeDeCarburant() {
		return typeDeCarburant;
	}


	public void setTypeDeCarburant(String typeDeCarburant) {
		this.typeDeCarburant = typeDeCarburant;
	}


	@Override
	public String toString() {
		return "Pompe [contenanceRes=" + contenanceRes + ", contenuRes=" + contenuRes + ", typeDeCarburant="
				+ typeDeCarburant + "]";
	}
	
	
}
