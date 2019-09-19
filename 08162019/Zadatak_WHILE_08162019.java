package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_WHILE_08162019 {

	public static void main(String[] args) {
		//Saberi prirodne brojeve do 100.
		
		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 100;
		int sum = 0;

		while (a <= b) {
			sum += a;
			a++;

		}
		System.out.println("Suma brojeva do 100 je: " + sum);

	}

}
