package Grundlagen.rechner;

public class MeinErstesProgram {
	public static void additionUndAusgabe(int z1, int z2) {
		int ergebnis = z1 + z2;
		System.out.println("Addition von " + z1 + " und " + z2 + " ergibt = " + ergebnis);

	}

	public static void substraktionUndAusgabe(int z1, int z2) {
		int ergebnis = z1 - z2;
		System.out.println("Substraktion von " + z1 + " und " + z2 + " ergibt = " + ergebnis);

	}

	public static void multiplizierenUndAusgeben(int z1, int z2) {
		int ergebnis = z1 * z2;
		System.out.println("Multiplikation von " + z1 + " und " + z2 + " ergibt = " + ergebnis);
	}

	public static void dividierenUndAusgaben(int z1, int z2) {
		int ergebnis = z1 / z2;
		System.out.println("Dividieren von " + z1 + " und " + z2 + " ergibt = " + ergebnis);
	}

	public static void main(String[] args) {
		additionUndAusgabe(23, 24);
		substraktionUndAusgabe(2, 5);
		multiplizierenUndAusgeben(3, 7);
		dividierenUndAusgaben(7, 23);
	}
}
