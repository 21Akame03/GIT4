public class PalindromChecker {

    public static boolean istPalindromRekursiv(String text) {
        // Remove spaces and convert to lowercase
        text = text.replaceAll("\\s", "").toLowerCase();

        // Recursively check whether the text is a palindrome
        return istPalindromRekursivHelper(text, 0, text.length() - 1);
    }

    // Hilfsmethode, die rekursiv die Palindrom-Überprüfung durchführt
    private static boolean istPalindromRekursivHelper(String text, int start, int end) {
        // Base case: If start index >= end index, the string is a palindrome
        if (start >= end) {
            return true;
        }
        // Recursive case: Check whether the characters at the start and end index are the same
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive call for the next section of the string
        return istPalindromRekursivHelper(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        
        String[] testStrings = {"Lagerregal", "Reliefpfeiler", "Otto", "Anna", "Nicht ein Palindrom"};

        for (String text : testStrings) {
            System.out.println("Ist \"" + text + "\" ein Palindrom? " + istPalindromRekursiv(text));
        }
    }
}