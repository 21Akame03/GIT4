import java.util.Scanner;

public class App {

    private String password = "123456";

    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        manager.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Password Manager ---");
            System.out.println("1. Change Password");
            System.out.println("2. Check Password");
            System.out.println("3. Leave Password Manager");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            switch (choice) {
                case 1:
                    changePassword(scanner);
                    break;
                case 2:
                    checkPassword(scanner);
                    break;
                case 3:
                    System.out.println("Exiting Password Manager.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    private void changePassword(Scanner scanner) {
        System.out.print("Enter current password: ");
        String currentPassword = scanner.nextLine();

        if (!currentPassword.equals(password)) {
            System.out.println("Incorrect current password.");
            return;
        }

        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        if (!isPasswordValid(newPassword)) {
            System.out.println("Password must be at least 8 characters long, and optionally include a number, a special character, and an uppercase letter.");
            return;
        }

        if (newPassword.equals(password)) {
            System.out.println("New password cannot be the same as the old password.");
            return;
        }

        System.out.print("Confirm new password: ");
        String confirmPassword = scanner.nextLine();

        if (!newPassword.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return;
        }

        setPassword(newPassword);
        System.out.println("Password changed successfully.");
    }

    private void checkPassword(Scanner scanner) {
        System.out.print("Enter password to check: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(password)) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is incorrect.");
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
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }
}

