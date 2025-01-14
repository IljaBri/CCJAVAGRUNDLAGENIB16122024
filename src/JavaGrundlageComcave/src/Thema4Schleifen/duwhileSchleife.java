package Thema4Schleifen;

import java.util.Scanner;

public class duwhileSchleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int pin;
		do {
			System.out.println("Bitte geben Sie Ihre PIN ein: ");
			pin = scanner.nextInt();
			System.out.println(pin);
		} while (pin != 1234);

		System.out.println("Programm ENDE");
		scanner.close();
	}

}
