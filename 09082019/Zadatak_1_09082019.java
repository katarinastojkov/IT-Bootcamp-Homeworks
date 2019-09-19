package dp;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite ceo broj: ");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Broj je paran!");
		} else {
			System.out.println("Broj je neparan!");
		}

	}

}
