package thema1.grundlagen;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wie heißt du?");
		String name = scanner.next();
		
		System.out.println("Wie viel wiegst du in Kg?");
		double weght = scanner.nextDouble(); 
		
		System.out.println("Wie gross bist du in Meter?");
		double hight = scanner.nextDouble(); 
		
		double BMI = weght / (hight*hight);
	
		System.out.println("Privet " + name + " dein BMI ist " + BMI + " Du wiegst " + weght + " Kg" + " Und deine Größe ist " + hight + " cm " );
	}

}
