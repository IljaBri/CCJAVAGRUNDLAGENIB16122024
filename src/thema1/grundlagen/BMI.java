package thema1.grundlagen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wie heißt du?");
		String name = scanner.next();
		
		System.out.println("Wie viel wiegst du in Kg?");
		double weight = scanner.nextDouble(); 
		
		System.out.println("Wie gross bist du in Meter?");
		double height = scanner.nextDouble(); 
		
		double BMI = weight / (height*height);
	
		System.out.println("Privet " + name + " dein BMI ist " + BMI + " Du wiegst " + weight + " Kg" + " Und deine Größe ist " + height + " cm " );
		
		scanner.close();
	}

}
