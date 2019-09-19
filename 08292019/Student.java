package skola;
//Student je covek koji se kreira sa brojem indeksa i ima  trenutnu godinu studija i trenutni prosek. Sva polja mogu samo da se dohvate. 

//Studenta ispisati u formatu: Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).

public class Student extends Covek {

	private int brIndeks;
	private int godStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godinaRodjenja, int brIndeks, int godStudija,
			double trenutniProsek) {
		super(ime, prezime, godinaRodjenja);
		this.brIndeks=brIndeks;
		this.godStudija=godStudija;
		this.trenutniProsek=trenutniProsek;
	
	}

	public int getBrIndeks() {
		return brIndeks;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public double getTrenutniProsek() {
		return trenutniProsek;
	}
	public String ispis() {
		String s="";
		s+=super.ispis()+"je student "+godStudija+" godine studija sa prosekom "+trenutniProsek;
		return s;
	}

}
