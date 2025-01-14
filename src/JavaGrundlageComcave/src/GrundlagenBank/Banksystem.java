package GrundlagenBank;

public class Banksystem {

	public static void main(String[] args) {

		Bank bank = new Bank("Sparkasse");
		System.out.println("Bank: " + bank.getName());

		Kunde kunde = new Kunde();
		kunde.setName("Max Mustermann");
		kunde.setAdresse("Edekastrasse 6");
		
		Kunde kunde2 = new Kunde();
		kunde2.setName("Kevin Schmidt");
		kunde2.setAdresse("Lidlstrasse 51");
		
		Kunde kunde3 = new Kunde();
		kunde3.setName("Arne Fischer");
		kunde3.setAdresse("Aldistrasse 7");
		
		bank.setAnzahlKonten(2);
		System.out.println(bank);

		bank.printBankInfo();
		System.out.println("Kundeninformationen:");
		System.out.println(kunde);
		System.out.println(kunde2);
		
		
		Aktie aktie1 =new Aktie("AAPL123", "Apple Inc.", 150.0);
		Aktie aktie2 =new Aktie("MSFT456", "Microsoft Copr.", 280.0);
				
		System.out.println("Aktieninformationen:");
		System.out.println(aktie1);
		System.out.println(aktie2);
	}

	public Banksystem() {
		super();
	}

}
