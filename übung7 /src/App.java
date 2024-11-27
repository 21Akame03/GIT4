import java.util.Stack;

interface IFahrzeug {
    void starten();
    void stoppen();
}

interface ILandfahrzeug extends IFahrzeug {
    void fahren();
}

interface IWasserfahrzeug extends IFahrzeug {
    void schwimmen();
}

class Landfahrzeug implements ILandfahrzeug {
    @Override
    public void starten() {
        System.out.println("Landfahrzeug startet.");
    }

    @Override
    public void stoppen() {
        System.out.println("Landfahrzeug stoppt.");
    }

    
    @Override
    public void fahren() {
        System.out.println("Landfahrzeug fährt.");
    }
}

class Wasserfahrzeug implements IWasserfahrzeug {
    @Override
    public void starten() {
        System.out.println("Wasserfahrzeug startet.");
    }

    @Override
    public void stoppen() {
        System.out.println("Wasserfahrzeug stoppt.");
    }

    @Override
    public void schwimmen() {
        System.out.println("Wasserfahrzeug schwimmt.");
    }
}


class Amphibienfahrzeug implements ILandfahrzeug, IWasserfahrzeug {
    private final Landfahrzeug landfahrzeug = new Landfahrzeug();
    private final Wasserfahrzeug wasserfahrzeug = new Wasserfahrzeug();

    @Override
    public void starten() {
        System.out.println("Amphibienfahrzeug startet.");
    }

    @Override
    public void stoppen() {
        System.out.println("Amphibienfahrzeug stoppt.");
    }

    @Override
    public void fahren() {
        landfahrzeug.fahren();
    }

    @Override
    public void schwimmen() {
        wasserfahrzeug.schwimmen();
    }
}

// A stack is a LIFO (last-in, first-out) data structure where elements are added and removed only from the top
class StapelVerteiler {
    public void verteileZahlen(Stack<Integer> stapel1, Stack<Integer> stapel2, Stack<Integer> stapel3) {
        if (stapel1.isEmpty()) {
            return; 
        }

        int zahl = stapel1.pop(); 
        if (zahl % 2 == 0) {
            stapel2.push(zahl); 
        } else {
            stapel3.push(zahl); 
        }

        verteileZahlen(stapel1, stapel2, stapel3); 
    }

    public static void main(String[] args) {
        Stack<Integer> stapel1 = new Stack<>();
        Stack<Integer> stapel2 = new Stack<>();
        Stack<Integer> stapel3 = new Stack<>();

     
        stapel1.push(1);
        stapel1.push(2);
        stapel1.push(3);
        stapel1.push(4);
        stapel1.push(5);

        StapelVerteiler verteiler = new StapelVerteiler();
        verteiler.verteileZahlen(stapel1, stapel2, stapel3);

        System.out.println("Gerade Zahlen: " + stapel2);
        System.out.println("Ungerade Zahlen: " + stapel3);
    }
}
