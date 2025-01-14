package OOP.Thema1;

public class Auto {

	// Klassenattribut
	public final static int ANZAHL_REIFEN = 4;

	// Objektattribute (-eigenschaften)
	private String marke;

	private String modell;

	private int baujahr;

	// Default-Konstruktor
	public Auto() {
		this.baujahr = 1000;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	public static int getAnzahlReifen() {
		return ANZAHL_REIFEN;
	}

	public Auto(String marke, String modell, int baujahr) {
		super();
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}

	// Objektmethode
	public void fahren() {
		System.out.println(marke + " " + modell + " fährt und hat " + ANZAHL_REIFEN + " Reifen");
	}

	// Klassenmethode
	public static void info() {
		System.out.println("Standard Auto mit " + ANZAHL_REIFEN + " Reifen");
	}

	public String getMarke() {
		return this.marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	Auto auto1 = new Auto("BMW", "X5", 2021);
// auto1.fahren();

	Auto auto2 = new Auto("Mercedes", "AG15", 2024);
	{
// auto2.fahren();

		System.out.println(auto1.getMarke());
		{
			auto1.setMarke("Audi");
		}

		auto1.fahren();
		{
			System.out.println(auto2.getMarke());
			auto2.fahren();

			System.out.println(Auto.ANZAHL_REIFEN);
		}
	}
}