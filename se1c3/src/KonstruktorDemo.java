public class KonstruktorDemo {
    public static void main(String[] args) {
        // Minivan und Sportwagen über Konstruktor initialisieren
        Kfz minivan = new Kfz(6, 70, 14);
        Kfz sportwagen = new Kfz(2, 45, 11);

        // Ausgabe der Reichweite und des Spritverbrauchs für 252 km
        System.out.println("Reichweite von Minivan: " + minivan.reichweite() + " km");
        System.out.println("Spritverbrauch von Minivan für 252 km: " + minivan.spritVerbrauch(252) + " Liter");

        System.out.println("Reichweite von Sportwagen: " + sportwagen.reichweite() + " km");
        System.out.println("Spritverbrauch von Sportwagen für 252 km: " + sportwagen.spritVerbrauch(252) + " Liter");
    }
}