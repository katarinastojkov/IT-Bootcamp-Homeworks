package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2_c_08132019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko
		 * konzole). Program treba da ispise zbir.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi neki ceo broj k: ");
		int k = sc.nextInt();
		System.out.print("Unesi neki ceo broj n: ");
		int n = sc.nextInt();
		int sum = 0;

		while (k < n) {
			sum += k;
			k += 1;
		}
		System.out.println("Zbir: " + sum);
	}

}
