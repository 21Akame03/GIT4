public class Person {
    private String name;
    private int alter;

    // Konstruktor
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Methode zum Ausgeben der Details
    public void printDetails() {
        System.out.println("Name: " + name + ", Alter: " + alter);
    }

    // Hauptprogramm
    public static void main(String[] args) {
        // Erstellen von zwei Person-Objekten
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Ausgeben der Details auf der Konsole
        person1.printDetails();
        person2.printDetails();
    }
}