package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2_a_08132019 {

	public static void main(String[] args) {

		// Napisati program koji ce sabrati brojeve od 1 do 5. Program treba da ispise
		// zbir.

		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 5;
		int sum = 0;
		while (a < b) {
			sum += a;
			a += 1;

		}
		System.out.println(sum);

	}

}
