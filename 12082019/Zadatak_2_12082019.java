package tp;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n. Koristiti jednu petlju.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi n: ");

		int n = sc.nextInt();
		int br = 0;
		int sumaparnih = 0;
		int proizvodneparnih = 1;

		while (br <= n) {
			if (br % 2 == 0) {
				sumaparnih += br;
				br += 1;
			} else {
				proizvodneparnih *= br;
				br += 1;
			}
		}
		System.out.println("Suma parnih: " + sumaparnih);
		System.out.println("Proizvod neparnih: " + proizvodneparnih);
	}
}
