package Thema4Schleifen;

import java.util.Scanner;

public class Zinsberechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kapital");

		double kapital = scanner.nextDouble();
		System.out.println("Wie hoch ist der zinssatz");

		double zinssatz = scanner.nextDouble();
		System.out.println("Wie lang ist die Laufzeit?");

		double laufzeit = scanner.nextDouble();
		System.out.println("Die Laufzeiz beträgt " + laufzeit);

		for (int i = 0; i <= laufzeit; i++) {

			kapital = kapital + kapital * (zinssatz * 0.01);

		}
		System.out.println(Math.round(kapital * 100) / 100.0);
		scanner.close();
	}

}
