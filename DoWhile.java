package oOP;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			Locale.setDefault(Locale.US);
			System.out.println("Enter a number");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root  = %.3f%n", sq);

			System.out.println("Repeat (y/n)? ");
			 resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
