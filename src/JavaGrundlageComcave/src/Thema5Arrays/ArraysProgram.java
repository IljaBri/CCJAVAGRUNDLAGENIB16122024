package Thema5Arrays;

public class ArraysProgram {

	public static void main(String[] args) {
		int[] ages = new int[5];
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 2;
		ages[3] = 30;
		ages[4] = 50;

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}

		String[] names;
		names = new String[2];
		names[0] = "Timo";
		names[1] = " Toni";

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
	}
}