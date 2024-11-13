public class Fahrzeug {
    public int sitze;
    public int tankInhalt;
    public float verbrauch;

    // Methode zur Berechnung der Reichweite
    public int reichweite() {
        return (int) (tankInhalt / verbrauch * 100);
    }

    // Methode zur Berechnung des Spritverbrauchs
    public float spritVerbrauch(int gefahreneStrecke) {
        return (verbrauch / 100) * gefahreneStrecke;
    }
}


