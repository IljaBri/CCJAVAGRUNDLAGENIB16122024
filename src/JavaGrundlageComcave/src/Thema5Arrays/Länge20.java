package Thema5Arrays;

import java.util.Random;
import java.util.Arrays;

public class Länge20 {

	public static void main(String[] args) {

		Random random = new Random(1000);
		int min = 1;
		int max = 2000;
		int[] numbers1 = new int[20];
		int[] numbers2 = new int[20];

		for (int i = 0; i < numbers1.length; i++) {
			numbers1[i] = random.nextInt((max - min)) * 2;

		}
		System.out.println(Arrays.toString(numbers1));
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = random.nextInt((max - min));
		}
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
	}
}