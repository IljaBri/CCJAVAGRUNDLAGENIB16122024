package OOP.Thema1;

public class Hund {

	private static final String Grau = null;

	private static final String Amstaff = null;

	private static final String Ildar = null;

	private static final String Männchen = null;

	String name;

	String rasse;

	int alter;

	String farbe;

	String geschlecht;

	Hund() {
		this.alter = 1;
		this.farbe = Grau;
		this.rasse = Amstaff;
		this.name = Ildar;
		this.geschlecht = Männchen;
	}

	Hund(String name) {
		super();
	}

	public Object bellen() {
		System.out.println("bellen");
		return null;

		
	}

	public void familienstand() {
		if (alter > 1) {
			System.out.println("verheiratet");
		} else {
			System.out.println("noch ein kindchen");
		}
	}
}