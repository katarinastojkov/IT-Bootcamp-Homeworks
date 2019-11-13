package prvanedelja;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		/*
		 * Napisi program koji ce racunati obim i povrsinu pravougaonika, tako sto se
		 * stranice ucitavaju preko konzole.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi stranicu a: ");
		double a = sc.nextDouble();
		System.out.print("Unesi stranicu b: ");
		double b = sc.nextDouble();

		double o = 2 * a + 2 * b, p = a * b; //Formule za izracunavanje obima i povrsine pravougaonika

		System.out.println("Obim pravougaonika je: " + o + "," + " povrsina pravougaonika je: " + p);
	}

}
