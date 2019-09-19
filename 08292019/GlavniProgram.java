package skola;
//Napisati glavni program koji ce imati bar tri studenta i dva profesora.

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Bora", "Boric", 1989, 39998, 3, 7.59);
		Student s1 = new Student("Mika", "Mikic", 1998, 39322, 1, 8.59);
		Student s2 = new Student("Kasa", "Kasic", 1991, 39299, 2, 8.94);
		Profesor p = new Profesor("Stanko", "Stanic", 1980, "Predavac");
		Profesor p1 = new Profesor("Sasa", "Sasic", 1984, "Asistent");
		p.dodajPredmet("Statistika");
		p.dodajPredmet("Matematika");
		p1.dodajPredmet("Teorija cena");
		p1.dodajPredmet("Makroekonomija");
		System.out.println(s.ispis());
		System.out.println(s1.ispis());
		System.out.println(s2.ispis());
		System.out.println(p.ispisi());
		System.out.println(p1.ispisi());

	}

}
