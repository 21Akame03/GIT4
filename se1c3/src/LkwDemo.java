public class LkwDemo {
    public static void main(String[] args) {
        // Objekte sportwagen und sattelschlepper erstellen
        Kfz sportwagen = new Kfz(2, 45, 11);
        Lkw sattelschlepper = new Lkw(2, 45, 11, 30, true);

        // Referenzvariable kfz vom Typ Kfz, die nacheinander auf die Objekte verweist
        Kfz kfz;

        // Zuweisung von sportwagen und Verbrauchsausgabe
        kfz = sportwagen;
        System.out.println("Spritverbrauch von Sportwagen für 252 km: " + kfz.spritVerbrauch(252) + " Liter");

        // Zuweisung von sattelschlepper und Verbrauchsausgabe
        kfz = sattelschlepper;
        System.out.println("Spritverbrauch von Sattelschlepper für 252 km: " + kfz.spritVerbrauch(252) + " Liter");
    }
}