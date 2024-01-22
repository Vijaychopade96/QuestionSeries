package ProgrammingQ2.Q1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        Set<Character> uniqueChars = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = removeDuplicates(input);
        System.out.println(result); // Output: helo
    }
}

