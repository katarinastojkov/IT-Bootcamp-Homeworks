package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2_b_08132019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko
		 * konzole). Program treba da ispise zbir.
		 */

		Scanner sc = new Scanner(System.in);

		int a = 1;
		int n = sc.nextInt();
		int sum = 0;

		while (a < n) {
			sum += a;
			a += 1;
		}
		System.out.println("Zbir je: " + sum);
	}

}
