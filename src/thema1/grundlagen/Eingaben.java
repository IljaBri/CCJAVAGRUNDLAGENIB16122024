package thema1.grundlagen;

import java.util.Scanner;

public class Eingaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = scanner.next();
				
		System.out.println("What is your age?:");
		int age = scanner.nextInt();
		
		System.out.println("wo wohnst du?:");
		String town = scanner.next();
		
		System.out.println("Your name is: " + name + " and your age is " + age + " and you live in " + town );
		
	}

}
