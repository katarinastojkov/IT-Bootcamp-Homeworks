package petanedeljafunkcije;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		 * ispisuje najmanji od unesenih brojeva.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi a: ");
		double a = sc.nextDouble();
		System.out.print("Unesi b: ");
		double b = sc.nextDouble();
		System.out.print("Unesi c: ");
		double c = sc.nextDouble();

		System.out.print("Proizvod realnih brojeva: " + a + ", " + b + ", " + c + " " + " je: " + proizvod(a, b, c));
		System.out.println();
		System.out.print("Najmanji od unesenih brojeva: " + a + ", " + b + ", " + c + " je: " + minBroj(a, b, c));

	}

	public static double proizvod(double a, double b, double c) {
		double p;
		p = a * b * c;
		return p;
	}

	public static double minBroj(double a, double b, double c) {
		double min = 0;
		if (a < b && a < c)
			min = a;
		else if (b < a && b < c)
			min = b;
		else if (c < a && c < b)
			min = c;
		return min;
	}

}
