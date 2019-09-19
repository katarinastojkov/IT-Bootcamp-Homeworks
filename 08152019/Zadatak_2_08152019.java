package cetvrtanedelja;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unosom broja n odredi granicu Fibonacci-jevom nizu: ");
		int n1 = 0, n2 = 1, n3;
		n3 = sc.nextInt();
		

		for (int i = 1; i <= n3; i++) {
			System.out.print(n1 + " ");
			int sum = n1 + n2;
			n1=n2;
			n2=sum;
		}

	}

}
