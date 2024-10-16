import java.util.Scanner; // Import Scanner Class

public class App {
    

    static int addieren(int ... zahlen) {
        int summe = 0; 
        for (int zahl : zahlen) {
            summe += zahl;
        }

        return summe;
    }

    static int addieren(int a, int b) {
        return a + b;
    }

    static double dividieren(double a, double b) {
        return a / b;
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

    static int multiplizieren(int a, int b) {
        return a * b;
    }

    static double sin(double x) {
        return Math.sin((x));
    }

    static double XhochY(double x, double y) {
        return Math.pow(x, y); // same as x^y
    }

    public static void main(String[] args) throws Exception {
        // !NOTE: von task 1
        // int eineZahl = 10;
        // int nochEineZahl = 12;
        // double eineKommaZahl = 20.8;
        // String eineZeichenKette = "Hello Course 1"; 
        
        // int summe = addieren(eineZahl, nochEineZahl);
        // double quotient = dividieren(eineKommaZahl, summe);
        
        // System.out.println(eineZeichenKette + " " + quotient);
        // ggt(eineZahl, nochEineZahl);

        //! NOTE:
        // Man benutzt Static Methods, weil die methods gehören zum object/Class und nicht zu einem instance von dem Class.
        // Das heißt. man die Methoden ohne eine Instance vom Class durch direkt zugriff nutzen.
        // Nutzung der Methoden braucht auch keine Instance spezifische daten zu funktionieren.
        // zusätzlich ist es memory efficient. 
        
        //*  TASK 2
        System.out.println("CALCULATOR - please Select: ");
        System.out.println("0: Programmende\n1: addieren (x + y)\n2: dividieren (x / y)\n3: multiplizieren (x * y)\n4: sin(x)\n5: x^y");

        int choice = -1; // initial ist es ein falsche eingabe
        double x = 0;
        double y = 0;
        while (choice != 0) {

            System.out.println("\nPlease enter a selection (0-5): ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt(); // eingabge der choice
            
            /*
             * 1. ask for the input of choice 
             * 2. if choice is not within the switch, then go back to start until choice is valid
             * 3. if choice is valid, the values of zahlen needed to carry out the calculation is asked
             * 4. calculations are done and the results are printed out on the screen
             */
            try {
                switch(choice) {
                    case 0: // Programmende
                        System.out.println("\n*----- Programmende -----*");
                        return; // exit program by returning a value of void from main function.

                    case 1: // addieren
                        System.out.println("\nBitte geben Sie die Werte x ein:");
                        x = scanner.nextInt();
                        System.out.println("Bitte geben Sie die Werte y ein:");
                        y = scanner.nextInt();
                        System.out.println("Summe: " + addieren((int)x, (int)y)); 
                        break;

                    case 2: // dividieren
                        System.out.println("\nBitte geben Sie die Werte x ein:");
                        x = scanner.nextDouble();
                        System.out.println("Bitte geben Sie die Werte y ein:");
                        y = scanner.nextDouble();
                        System.out.println("Quotient: " + String.format("%.2f", dividieren(x, y))); // limit to 2 decimal places
                        break;

                    case 3: // multiplizieren
                        System.out.println("\nBitte geben Sie die Werte x ein:");
                        x = scanner.nextInt();
                        System.out.println("Bitte geben Sie die Werte y ein:");
                        y = scanner.nextInt();
                        System.out.println("Multiplikation: " + multiplizieren((int)x, (int)y));
                        break;

                    case 4: // sin(x)
                        System.out.println("\nBitte geben Sie die Werte x ein:");
                        x = scanner.nextDouble();
                        System.out.println("sin(" + x + "): " + String.format("%.2f", sin(x)));
                        break;

                    case 5: // x^y
                        System.out.println("\nBitte geben Sie die Werte x ein:");
                        x = scanner.nextDouble();
                        System.out.println("Bitte geben Sie die Werte y ein:");
                        y = scanner.nextDouble();
                        System.out.println(x + "^" + y + ": " + String.format("%.2f", XhochY(x, y)));
                        break;

                    default:
                        System.out.println("Falsche Eingabe!");      
                }       
            } catch (Exception e) {
                System.out.println("[-] Fehler: " + e.getMessage());
            }
        }
    }
}
