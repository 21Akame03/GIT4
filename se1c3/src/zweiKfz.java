class KfzV0 {
    public int sitze;
    public int tankInhalt;
    public float verbrauch;
}

// 4.

public class zweiKfz {
    public int sitze;
    public int tankInhalt;
    public float verbrauch;

    public static void main(String[] args) throws Exception {
        KfzV0 sportwagen = new KfzV0();

        sportwagen.sitze = 2;
        sportwagen.tankInhalt = 45;
        sportwagen.verbrauch = 11;
       
    }
}
