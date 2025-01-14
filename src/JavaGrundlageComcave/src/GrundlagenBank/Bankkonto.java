package GrundlagenBank;

public class Bankkonto {

	private String kontoNummer;

	private double kontoStand;

	private Kunde kontoInhaber;

	public void einzahlen(double betrag) {
		kontoStand += betrag;
	}

	@Override
	public String toString() {
		return "Bankkonto [kontoNummer=" + kontoNummer + ", kontoStand=" + kontoStand + ", kontoInhaber=" + kontoInhaber
				+ "]";
	}

	public void abheben(double betrag) {
		if (betrag <= kontoStand) {
			kontoStand -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben!");
		}

	}
}