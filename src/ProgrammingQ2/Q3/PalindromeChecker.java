package ProgrammingQ2.Q3;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";

        if (isAlphaNumericPalindrome(input)) {
            System.out.println("The string is a palindrome and contains only alphanumeric characters.");
        } else {
            System.out.println("The string is not a palindrome or contains non-alphanumeric characters.");
        }
    }

    public static boolean isAlphaNumericPalindrome(String input) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use StringBuilder to reverse the cleaned string
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check if the cleaned string is equal to its reversed version
        return cleanedInput.equals(reversed);
    }
}

