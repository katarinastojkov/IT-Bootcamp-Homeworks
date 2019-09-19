package tp;

import java.util.Scanner;

public class Zadatak_1_12082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Napisati program koji ce ispisati poruku “Hello World!” 10 puta. Koristiti while petlju.

		int n = 10;

		int br = 0;

		while (br < n) {
			System.out.println("Hello World!");
			br += 1;
		}

	}

}
