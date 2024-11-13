public class SpritDemo {
    public static void main(String[] args) {
        // Minivan initialisieren
        Fahrzeug minivan = new Fahrzeug();
        minivan.sitze = 6;
        minivan.tankInhalt = 70;
        minivan.verbrauch = 14;

        // Reichweite und Spritverbrauch für 252 km berechnen und ausgeben
        System.out.println("Reichweite von Minivan: " + minivan.reichweite() + " km");
        System.out.println("Spritverbrauch von Minivan für 252 km: " + minivan.spritVerbrauch(252) + " Liter");

        // Sportwagen initialisieren
        Fahrzeug sportwagen = new Fahrzeug();
        sportwagen.sitze = 2;
        sportwagen.tankInhalt = 45;
        sportwagen.verbrauch = 11;

        // Reichweite und Spritverbrauch für 252 km berechnen und ausgeben
        System.out.println("Reichweite von Sportwagen: " + sportwagen.reichweite() + " km");
        System.out.println("Spritverbrauch von Sportwagen für 252 km: " + sportwagen.spritVerbrauch(252) + " Liter");
    }
}