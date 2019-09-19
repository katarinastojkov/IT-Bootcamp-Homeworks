package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, O, P;
		System.out.print("Ucitaj stranicu a: ");
		a = sc.nextDouble();
		System.out.print("Ucitaj stranicu b: ");
		b = sc.nextDouble();

		O = 2 * a + 2 * b; //Formula za izracunavanje obima pravougaonika
		P = a * b;//Formula za izracunavanje povrsine pravougaonika
		System.out.println("Obim pravougaonika je: " + O + " a povrsina pravougaonika je: " + P);

	}

}
