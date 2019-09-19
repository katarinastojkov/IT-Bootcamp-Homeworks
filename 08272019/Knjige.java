package domaciklaseprvicas;

public class Knjige {
	/*
	 * Napisati klasu Knjige koja ima sledeca polja: naziv knjige, autora, broj
	 * strana, godinu izdanja. Sva polja mogu da se dohvate, a godina izdanja moze i
	 * da se postavi. Napisati glavni program koji kreira tri knjige i ispisuje sve
	 * njihove podatke.
	 */
	private String nazivKnjige;
	private String autor;
	private String brStrana;
	private int godinaIzdanja;

	public Knjige(String nazivKnjige, String autor, String brStrana) {
		this.nazivKnjige = nazivKnjige;
		this.autor = autor;
		this.brStrana=brStrana;
		
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public String getAutor() {
		return autor;
	}

	public String getBrStrana() {
		return brStrana;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja=godinaIzdanja;
	}
}