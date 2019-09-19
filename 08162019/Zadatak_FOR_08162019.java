package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_FOR_08162019 {

	public static void main(String[] args) {
		/*
		 * 	Napisati program da ispisuje 3 puta u 3 reda IME sa razmakom.
		 * IME IME IME
		 * IME IME IME
		 * IME IME IME
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n=3;
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++ ) {
				System.out.print("IME ");
			}System.out.println();
		}
		
	}

}
