package thema1.grundlagen;

import java.util.Scanner;
import utils.IO;

public class BmiCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		System.out.println("** Welcome to my BMI Colculator **" );
		
		System.out.println("Your Weght: ");
		double weight = scanner.nextDouble();
		
		double height = IO.promptAndReadDouble("height");
		
		double bmi = weight / (height*height);
		System.out.println("Your Calculated BMI is " + bmi );
		
		scanner.close();

	}

}
