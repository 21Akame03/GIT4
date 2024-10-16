public class App {
    

    static int addieren(int ... zahlen) {
        int summe = 0; 
        for (int zahl : zahlen) {
            summe += zahl;
        }

        return summe;
    }

    static double dividieren(double a, double b) {
        return a + b;
    }

    // GGT 
    static int ggt(int a, int b) {
        // if b = 0, then the greatest common divider is 2. 
        if (b == 0) {
            return a;
        }

        // if a == 0, then the answer is still b.
        // otherwise, keep repeating till parameter b = 0.
        return ggt(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        int eineZahl = 10;
        int nochEineZahl = 12;
        double eineKommaZahl = 20.8;
        String eineZeichenKette = "Hello Course 1"; 
        
        int summe = addieren(eineZahl, nochEineZahl);
        double quotient = dividieren(eineKommaZahl, summe);
        
        System.out.println(eineZeichenKette + " " + quotient);
        ggt(eineZahl, nochEineZahl);

        // Man benutzt Static Methods, weil die methods gehören zum object/Class und nicht zu einem instance von dem Class.
        // Das heißt. man die Methoden ohne eine Instance vom Class durch direkt zugriff nutzen.
        // Nutzung der Methoden braucht auch keine Instance spezifische daten zu funktionieren.
        // zusätzlich ist es memory efficient. 

    }
}
