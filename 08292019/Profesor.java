package skola;

import java.util.ArrayList;

//Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu. Predmeti mogu da se dodaju i oduzimaju iz liste.

//Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.

public class Profesor extends Covek {
	private String titula;
	private ArrayList<String> listaPredmeta;

	public Profesor(String ime, String prezime, int godRodjenja, String titula) {
		super(ime, prezime, godRodjenja);
		this.titula = titula;
		this.listaPredmeta = new ArrayList<String>();
	}

	public String getTitula() {
		return titula;
	}

	public void dodajPredmet(String predmet) {
		if (predmet == null) {
			return;
		}
		this.listaPredmeta.add(predmet);
	}

	public void oduzmiPredmet(String predmet) {
		if (predmet.equals(null)) {
			return;
		}
		for (int i = 0; i < listaPredmeta.size(); i++) {
			if (listaPredmeta.get(i).equals(predmet)) { // niz[i] isto sto
				listaPredmeta.remove(i);
				break;
			}
		}
				
	}
	public String ispisi() {
		String s = "";
		s += super.ispis();
		s += "je "+"("+titula+")"+ "koji drzi nastavu na:\n";
		for (String c: listaPredmeta) {
			s+= c + "\n";
		}
		return s;		
	}

}
