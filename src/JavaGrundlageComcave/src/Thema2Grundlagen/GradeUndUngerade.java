package Thema2Grundlagen;

import java.util.Scanner;

public class GradeUndUngerade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein");
		int zahl = scanner.nextInt();

		System.out.println((zahl % 2 == 0 ? "Gerade" : "Ungerade"));

		scanner.close();
	}

}
