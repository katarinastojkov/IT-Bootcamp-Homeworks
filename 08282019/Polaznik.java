package ucionica;

public class Polaznik {
	private static int UID=0;
	private int id;
	public Polaznik (String naziv) {
		this.naziv=naziv;
		id=++UID;
	}
	private String naziv;
	public static int getUID() {
		return UID;
	}
	public String getNaziv() {
		return naziv;
	}
	public String ispisi() {
		return naziv+"{"+id+"}";
	}
}
