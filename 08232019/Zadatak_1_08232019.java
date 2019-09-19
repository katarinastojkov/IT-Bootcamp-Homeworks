package petanedeljafunkcijenizovi;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava ceo broj n. Taj broj n se prosledjuje metodi
		 * koja formira i vraca ceo broj koji predstavlja inverzan broj. Glavni program
		 * nakon toga ispisuje taj inverzan broj.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneci ceo broj: ");
		int n = sc.nextInt();
		System.out.println("Inverzan broj unetog broja je: ");
		inverzanBroj(n);

	}

	public static int inverzanBroj(int n) {
		int inv = 0;
		while (n != 0) {
			int c = n % 10;
			inv *= 10;
			inv += c;
			n /= 10;
		}
		System.out.println(inv);
		return inv;
	}
}
