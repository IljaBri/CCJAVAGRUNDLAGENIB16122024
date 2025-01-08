package Thema3Grundlagen;

import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Geldautomat {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		double kontostand = 1988955;
			System.out.println("Ihr Guthaben beträgt: " + df.format(kontostand) + "Euro. Wieviel Geld möchten Sie abheben? ");
			double betrag = scanner.nextDouble();
			if (betrag > kontostand) {
				System.out.println(" auf deinem Konto.");
			}
			else {
				double restguthaben = kontostand - betrag;
				System.out.println("Sie haben "  + df.format(betrag) + "Euro abgehoben. Ihr Restguthaben beträgt " + df.format(restguthaben) + ". Viel Spaß damit!");
			}

			scanner.close();
	}

}
