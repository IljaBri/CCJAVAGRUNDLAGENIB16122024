package GrundlagenBank;

public class Bank {

	private String name;

	private String standort;

	private int anzahlKonten;

	public Bank() {
		this.name = "Unbekannt";
	}

	public Bank(String name) {
		super();
		this.name = name;
	}

	public Bank(String name, String so) {
		super();
		this.name = name;
		this.standort = so;
	}

	public Bank(String name, String so, int ak) {
		super();
		this.name = name;
		this.standort = so;
		this.anzahlKonten = ak;
	}

	@Override
	public String toString() {
		return "Bank " + name + ", anzahlKonten = " + anzahlKonten + "";
	}

	public void printBankInfo() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}

	public int getAnzahlKonten() {
		return anzahlKonten;
	}

	public void setAnzahlKonten(int anzahlKonten) {
		this.anzahlKonten = anzahlKonten;
	}
}