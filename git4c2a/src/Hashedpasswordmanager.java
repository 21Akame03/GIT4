import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.Base64;

public class Hashedpasswordmanager {

    private String passwordHash;

    public Hashedpasswordmanager() {
        // Set default password as "123456" (hashed)
        this.passwordHash = hashPassword("123456");
    }

    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        manager.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            System.out.println("\n--- Password Manager ---");
            System.out.println("1. Passwort ändern");
            System.out.println("2. Überprüfen Sie das Passwort");
            System.out.println("3. Verlassen Sie die Passwortverwaltungr");
            System.out.print("Geben Sie Ihre Wahl ein: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    changePassword(scanner);
                    break;
                case 2:
                    checkPassword(scanner);
                    break;
                case 3:
                    System.out.println("Beenden des Passwort-Managers.");
                    end = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl, bitte versuchen Sie es erneut.");
            }
        }
        scanner.close();
    }

    private void changePassword(Scanner scanner) {
        System.out.print("\nGeben Sie das aktuelle Passwort ein: ");
        String currentPassword = scanner.nextLine();

        if (!hashPassword(currentPassword).equals(passwordHash)) {
            System.out.println("Falsches aktuelles Passwort.");
            return;
        }

        System.out.print("Geben Sie ein neues Passwort ein: ");
        String newPassword = scanner.nextLine();

        if (!isPasswordValid(newPassword)) {
            System.out.println("Das Passwort muss mindestens 8 Zeichen lang sein und optional eine Zahl, ein Sonderzeichen und einen Großbuchstaben enthalten.");
            return;
        }

        if (hashPassword(newPassword).equals(passwordHash)) {
            System.out.println("Das neue Passwort darf nicht mit dem alten Passwort identisch sein.");
            return;
        }

        System.out.print("Neues Passwort bestätigen: ");
        String confirmPassword = scanner.nextLine();

        if (!newPassword.equals(confirmPassword)) {
            System.out.println("Passwörter stimmen nicht überein.");
            return;
        }

        setPassword(newPassword);
        System.out.println("Passwort erfolgreich geändert.");
    }

    private void checkPassword(Scanner scanner) {
        System.out.print("Geben Sie zur Überprüfung das Passwort ein: ");
        String inputPassword = scanner.nextLine();

        if (hashPassword(inputPassword).equals(passwordHash)) {
            System.out.println("Das Passwort ist korrekt.");
        } else {
            System.out.println("Das Passwort ist falsch.");
        }
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 8) return false;

        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[*,\\-\\+/].*");
        boolean hasUppercase = password.matches(".*[A-Z].*");

        return hasNumber && hasSpecialChar && hasUppercase;
    }

    private void setPassword(String newPassword) {
        this.passwordHash = hashPassword(newPassword);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Fehler: SHA-256-Algorithmus nicht gefunden.");
        }
    }
}