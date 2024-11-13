public class Smartphone {
    // Attribute
    private int speicherkapazitaet;
    private String farbe;

    // Klassenattribut
    private static int anzahlSmartphones = 0;

    // Konstruktor
    public Smartphone(int speicherkapazitaet) {
        this.speicherkapazitaet = speicherkapazitaet;
        this.farbe = "Unbekannt";  // Standardwert für Farbe
        anzahlSmartphones++;  // Klassenattribut erhöhen
        System.out.println("Anzahl der Smartphones: " + anzahlSmartphones);
    }

    // Getter für speicherkapazitaet und farbe
    public int getSpeicherkapazitaet() {
        return speicherkapazitaet;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    // Hauptprogramm
    public static void main(String[] args) {
        // Instanziierung der Objekte
        Smartphone smartphone1 = new Smartphone(64);
        smartphone1.setFarbe("Schwarz");

        Smartphone smartphone2 = new Smartphone(128);
        smartphone2.setFarbe("Weiß");

        Smartphone smartphone3 = new Smartphone(256);
        smartphone3.setFarbe("Blau");

        // Ausgabe der Attribute
        System.out.println("Smartphone 1 - Speicherkapazität: " + smartphone1.getSpeicherkapazitaet() + "GB, Farbe: " + smartphone1.getFarbe());
        System.out.println("Smartphone 2 - Speicherkapazität: " + smartphone2.getSpeicherkapazitaet() + "GB, Farbe: " + smartphone2.getFarbe());
        System.out.println("Smartphone 3 - Speicherkapazität: " + smartphone3.getSpeicherkapazitaet() + "GB, Farbe: " + smartphone3.getFarbe());
    }
} 
    

