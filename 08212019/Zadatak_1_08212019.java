package petanedeljanizovi;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neko broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi n za duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.print("Unesi " + n + " elemenata u niz: ");

		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		System.out.println("Niz je uspesno unesen");

		System.out.print("Unesi neki broj: ");
		int br = sc.nextInt();

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0 && br != 0)
				System.out.print(niz[i] + " ");

		}

	}

}
