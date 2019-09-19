//Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja. 
//Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char). Moze da joj se odredi prinos u periodu zadatom brojem godina.
//Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].
public abstract class Parcela {
	protected double povrsina; //u kvadratnim metrima prilikom kreiranja.
	private static int UID=0;
	private int id;
	protected char oznaka;
	
	public Parcela(double povrsina) {
		this.povrsina=povrsina;
		this.id=++UID;
		
	}
	public double getPovrsina() {
		return povrsina;
	}

	public  char getOznaka() {
		return oznaka;
	}
	public abstract double getPrinos(int godine);
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append(oznaka+"-"+id+"["+povrsina+"]");
	    return sb.toString();
	}
	
}
