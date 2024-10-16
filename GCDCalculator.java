public class GCDCalculator {

    // Method to calculate GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Continue until b becomes 0
        while (b != 0) {
            // Calculate the remainder
            int remainder = a % b;
            // Update a to b, and b to the remainder
            a = b;
            b = remainder;
        }
        // When b is 0, a contains the GCD
        return a;
    }

    public static void main(String[] args) {
        // Example: finding GCD of 48 and 18
        int num1 = 48;
        int num2 = 18;

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}