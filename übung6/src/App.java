abstract class Zahlungsart {
    public abstract double berechneGesamtbetrag(double betrag);
    public abstract void erklaereGebuehren(double betrag);
}

class PayPal extends Zahlungsart {
    @Override
    public double berechneGesamtbetrag(double betrag) {
        return betrag + betrag * 0.04 + 5; // 4% des Betrags plus 5 Euro
    }

    @Override
    public void erklaereGebuehren(double betrag) {
        System.out.println("Für PayPal-Zahlungen fallen 4% des Betrags plus 5 Euro Gebühren an.");
    }
}

class Kreditkarte extends Zahlungsart {
    @Override
    public double berechneGesamtbetrag(double betrag) {
        if (betrag < 100) {
            return betrag + betrag * 0.05; // 5% des Betrags
        } else {
            return betrag + betrag * 0.02 + 8; // 2% des Betrags plus 8 Euro
        }
    }

    @Override
    public void erklaereGebuehren(double betrag) {
        if (betrag < 100) {
            System.out.println("Gebühren für Kreditkarten-Zahlungen unter 100 Euro betragen 5% des Betrags.");
        } else {
            System.out.println("Gebühren für Kreditkarten-Zahlungen ab 100 Euro betragen 2% des Betrags plus 8 Euro.");
        }
    }
}

class Bankueberweisung extends Zahlungsart {
    @Override
    public double berechneGesamtbetrag(double betrag) {
        return betrag; // Keine zusätzlichen Gebühren
    }

    @Override
    public void erklaereGebuehren(double betrag) {
        System.out.println("Für Banküberweisungen fallen keine zusätzlichen Gebühren an.");
    }
}

public class App {
    public static void main(String[] args) {
        Zahlungsart[] zahlungsarten = {
            new PayPal(),
            new Kreditkarte(),
            new Bankueberweisung()
        };

        double betrag = 120.0;

        // Durchlaufen des Arrays und Aufrufen der Methoden
        for (Zahlungsart zahlungsart : zahlungsarten) {
            System.out.println("\nZahlungsart: " + zahlungsart.getClass().getSimpleName());
            zahlungsart.erklaereGebuehren(betrag);
            double gesamtbetrag = zahlungsart.berechneGesamtbetrag(betrag);
            System.out.println("Gesamtbetrag: " + gesamtbetrag + " Euro");
        }
    }
}