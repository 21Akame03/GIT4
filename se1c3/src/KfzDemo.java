public class KfzDemo {
    public static void main(String[] args) {
        // Objekt minivan erstellen und initialisieren
        Fahrzeug minivan = new Fahrzeug();
        minivan.sitze = 6;
        minivan.tankInhalt = 70;
        minivan.verbrauch = 14;

        // Reichweite berechnen und ausgeben
        System.out.println("Reichweite von Minivan bei vollem Tank: " + minivan.reichweite() + " km");

        // Objekt sportwagen erstellen und initialisieren
        Fahrzeug sportwagen = new Fahrzeug();
        sportwagen.sitze = 2;
        sportwagen.tankInhalt = 45;
        sportwagen.verbrauch = 11;

        // Reichweite berechnen und ausgeben
        System.out.println("Reichweite von Sportwagen bei vollem Tank: " + sportwagen.reichweite() + " km");
    }
}