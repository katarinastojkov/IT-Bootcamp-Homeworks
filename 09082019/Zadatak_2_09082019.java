package dp;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljeni geometrijski oblik za koji zelite da se izracuna povrsina: ");

		String oblik;
		oblik = sc.nextLine();


		switch (oblik) {
		case "pravougaonik":
			double a, b, p;
			System.out.print("Ucitaj stranicu a: ");
			a = sc.nextDouble();
			System.out.print("Ucitaj stranicu b: ");
			b = sc.nextDouble();
			p = a * b;
			if (a>0 && b>0) 
			System.out.println("Povrsina pravougaonika je: " + p);
			else System.out.println("Povrsina se ne moze izracunati");
			break;
		case "krug":
			double r, pkr;
			System.out.print("Ucitaj poluprecnik kruga: ");
			r = sc.nextDouble();
			pkr = r * r * 3.14;
			if (r>0)
			System.out.println("Povrsina kruga je: " + pkr);
			else System.out.println("Povrsina se ne moze izracunati");
			break;
			case "kvadrat":
			double k, pkv;
			System.out.print("Unesite stranicu kvadrata: ");
			k = sc.nextDouble();
			pkv = k * k;
			if (k>0)
			System.out.println("Povrsina kvadrata je: " + pkv);
			else System.out.println("Povrsina se ne moze izracunati");
			break;
		default:
			System.out.println("Uneli ste oblik koji ne postoji u programu!");
			break;
		}
	}

}
