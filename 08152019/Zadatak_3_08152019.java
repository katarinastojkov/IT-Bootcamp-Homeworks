package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz int m=7, n=3;
		 */

		System.out.println("Unesi broj redova n: ");
		int n;
		n = sc.nextInt();
		System.out.println("Unesi broj kolona m: ");
		int m;
		m = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print("*     ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
