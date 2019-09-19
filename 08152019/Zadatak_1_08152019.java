package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih
		 * tela (kocke, kvadra, valjka, lopte). Koristiti do while petlju i switch
		 * grananje. Za izlaz koristiti nulu (0).
		 */

		Scanner sc = new Scanner(System.in);

		int izbor;

		do {
			System.out.println(
					"Izaberi geometrijsko telo unoseci njegov broj: 1-Kocka, 2-Kvadar, 3-Valjak, 4-Lopta za koje zelis da ti se izracuna povrsina");
			System.out.println("0 - Izlaz");
			System.out.println("1 - Kocka");
			System.out.println("2 - Kvadar");
			System.out.println("3 - Valjak");
			System.out.println("4 - Lopta");
			izbor = sc.nextInt();

			double a, b, c, r, h, p;

			switch (izbor) {
			case 1:
				System.out.println("Unesi stranicu kocke a: ");
				a = sc.nextDouble();
				p = 6 * a * a;
				System.out.println("Povrsina kocke je: " + p);
				break;
			case 2:
				System.out.println("Unesi stranice a, b i c stranice kvadra: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				p = 2 * (a * b + b * c + c * a);
				System.out.println("Povrsina kvadra je: " + p);
				break;
			case 3:
				System.out.println("Unesi r i H kako bi izracunao povrsinu valjka: ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				p = 2 * r * r * 3.14 + h * 2 * r * 3.14;
				System.out.println("Povrsina valjka je: " + p);
				break;
			case 4:
				System.out.println("Unesi r kako bi izracunao povrsinu lopte: ");
				r = sc.nextDouble();
				p = 4 * r * r * 3.14;
				System.out.println("Povrsina lopte je: " + p);
				break;
			default: 
				System.out.println("Los unos!");
				break;
			case 0:
				System.out.println("Izlaz iz programa!");
				break;
			}

		} while (izbor != 0);
		

	}

}