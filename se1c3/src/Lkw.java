public class Lkw extends Kfz {
    public int ladeFlaeche;
    public boolean hatAnhaenger;

    // Konstruktor zur Initialisierung von Lkw-Objekten
    public Lkw(int sitze, int tankInhalt, float verbrauch, int ladeFlaeche, boolean hatAnhaenger) {
        super(sitze, tankInhalt, verbrauch);
        this.ladeFlaeche = ladeFlaeche;
        this.hatAnhaenger = hatAnhaenger;
    }

    // Methode zur Berechnung des Spritverbrauchs (mit zusätzlichem Verbrauch von 5 Litern)
    @Override
    public float spritVerbrauch(int gefahreneStrecke) {
        return super.spritVerbrauch(gefahreneStrecke) + 5;
    }
}