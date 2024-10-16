class KfzV0 {
    public int sitze;
    public int tankInhalt;
    public float verbrauch;
}


public class KfzDemo {
    public int sitze;
    public int tankInhalt;
    public float verbrauch;

    public static void main(String[] args) throws Exception {
        KfzV0 minivan = new KfzV0();

        minivan.sitze = 6;
        minivan.tankInhalt = 45;
        minivan.verbrauch = 14;
       
    }
}
