//Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume ili njive i ispisuje njihov prinos u toku 3 godine.

public class GlavniProgram {

	public static void main(String[] args) {
		Njiva n = new Njiva(600, 300);
		Njiva n1 = new Njiva(500, 200);
		Suma s = new Suma(650, 550, 330, 3);
		Suma s1 = new Suma(330, 155, 55, 2);
		Parcela [] niz2 = new Parcela [10];
		Parcela[]niz= {n, n1,s, s1};
		for (int i=0; i<niz.length; i++) {
			System.out.println(niz[i]);
		}
		
	}
		

}
