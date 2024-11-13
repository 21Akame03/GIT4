public class BankAccount {
    private double kontostand;

    public BankAccount(double startKontostand) {
        this.kontostand = startKontostand;
    }

    // Method to put money into bank account
    public void einzahlen(double betrag) {
        if (betrag > 0) { // Check if the deposit is positive.
            kontostand += betrag; 
            System.out.println(betrag + " wurde eingezahlt. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Einzahlungsbetrag muss positiv sein.");
        }
    }

    // Method to withdraw money from bank account
    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= kontostand) { // Check if there is money in bank account
            kontostand -= betrag;
            System.out.println(betrag + " wurde abgehoben. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Abhebungsbetrag ungültig oder nicht genügend Guthaben.");
        }
    }

    // Getter
    public double getKontostand() {
        return kontostand;
    }

    public static void main(String[] args) {
        BankAccount konto = new BankAccount(1000.0);

       
        konto.einzahlen(200.0);
        konto.abheben(150.0);
        konto.abheben(1200.0); 
        System.out.println("Endgültiger Kontostand: " + konto.getKontostand());
    }
}