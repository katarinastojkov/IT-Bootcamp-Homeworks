package petanedeljafunkcijenizovi;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		 * od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi prvi ceo broj a: ");
		int a = sc.nextInt();
		System.out.print("Unesi drugi ceo broj b: ");
		int b = sc.nextInt();
		System.out.print("Unesi treci ceo broj c: ");
		int c = sc.nextInt();

		od1do2deljivosa3(a, b, c);
	}

	public static int od1do2deljivosa3(int a, int b, int c) {
		while (a <= b) {
			a += 1;
			if (a % c == 0 && c != 0)
				System.out.println(a);
		}
		return a;
	}

}
