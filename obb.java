
class Transportmittel {

    public void durchfuehrenWartung() {
        System.out.println("Wartung wird durchgeführt.");
    }
}

class Zug extends Transportmittel {

    public void meldenVerspaetung() {
        System.out.println("Wir bitten die Verspätung zu entschuldigen.");
    }

    public static void main(String[] args) {

        Zug meinZug = new Zug();

        meinZug.durchfuehrenWartung();
        meinZug.meldenVerspaetung();
        Transportmittel meinTransport = new Zug();

        meinTransport.durchfuehrenWartung();

        meinTransport.meldenVerspaetung();  // Dies würde einen Fehler verursachen
    }
}