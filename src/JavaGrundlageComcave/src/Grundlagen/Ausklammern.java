package Grundlagen;

import java.util.Scanner;

public class Ausklammern {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int erg;

			System.out.println(" den wert für a angeben");
			int a = scanner.nextInt();

			System.out.println(" den wert für b angeben");
			int b = scanner.nextInt();

			System.out.println(" den wert für c angeben");
			int c = scanner.nextInt();

			erg = a + b - 3 * c;
			System.out.println("Ergebnis:" + erg);
		}
	}

	public static void b() {

		int x = 15;
		int y = 11;
		int z = 4;

		int erg;

		erg = 4 * x / y * z;
		System.out.println("Ergebnis:" + erg);

	}

}
