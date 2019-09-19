package ucionica;

public class Laptop {
	private Polaznik polaznik;
	private String marka;
	
	public Laptop (String marka, Polaznik polaznik) {
		this.marka=marka;
		this.polaznik=polaznik;
		
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}

	public void setPolaznik(Polaznik polaznik) {
		if (this.polaznik!=null)
		this.polaznik = polaznik;
	}
	public void resetPolaznik() {
		polaznik=null;
	}

	public String getMarka() {
		return marka;
	}
	
	public String ispisi() {
		String s;
		if (polaznik==null) {
			s="NEMA POLAZNIKA";
		}
		else {
			s=polaznik.ispisi();
		}
		return marka+"{"+s+"}";
	}//nova metoda za menjanje polaznika
}

