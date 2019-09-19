package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_IF_08162019 {

	public static void main(String[] args) {
		// Učitati dva broja a zatim ispisati manji pa veći broj.

		Scanner sc = new Scanner(System.in);

		int a, b;
		System.out.println("Unesi a: ");
		a = sc.nextInt();
		System.out.println("Unesi b: ");
		b = sc.nextInt();

		if (b < a)
			System.out.println("b je manji broj od a: " + b + " " + a);
		else if (a < b)
			System.out.println("a je manji broj od b: " + a + " " + b);

	}

}
